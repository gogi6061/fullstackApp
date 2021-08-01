package com.amiriskhakov.spring.fullstackapp.web;

import com.amiriskhakov.spring.fullstackapp.payload.request.LoginRequest;
import com.amiriskhakov.spring.fullstackapp.payload.request.SignupRequest;
import com.amiriskhakov.spring.fullstackapp.payload.response.JWTTokenSuccessResponse;
import com.amiriskhakov.spring.fullstackapp.payload.response.MessageResponse;
import com.amiriskhakov.spring.fullstackapp.security.JWTTokenProvider;
import com.amiriskhakov.spring.fullstackapp.security.SecurityConstants;
import com.amiriskhakov.spring.fullstackapp.services.UserService;
import com.amiriskhakov.spring.fullstackapp.validations.ResponseErrorValidation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/auth")
@PreAuthorize("permitAll()")
public class AuthController {

    @Autowired
    private ResponseErrorValidation responseErrorValidation;

    @Autowired
    private JWTTokenProvider jwtTokenProvider;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserService userService;


    @PostMapping("/signup")
    public ResponseEntity<Object> registerUser(@Valid @RequestBody SignupRequest signupRequest,
                                               BindingResult bindingResult) {
        ResponseEntity<Object> errors = responseErrorValidation.mapValidationService(bindingResult);
        if (!ObjectUtils.isEmpty(errors)) return errors;

        userService.createUser(signupRequest);
        return ResponseEntity.ok(new MessageResponse("User registered successfully"));
    }

    @PostMapping("/signin")
    public ResponseEntity<Object> authUser(@Valid @RequestBody LoginRequest loginRequest,
                                       BindingResult bindingResult) {
        ResponseEntity<Object> errors = responseErrorValidation.mapValidationService(bindingResult);
        if (!ObjectUtils.isEmpty(errors)) return errors;

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginRequest.getUsername(),
                loginRequest.getPassword()
        ));

        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = SecurityConstants.TOKEN_PREFIX + jwtTokenProvider.generateToken(authentication);


        return ResponseEntity.ok(new JWTTokenSuccessResponse(true, jwt));


    }


}
