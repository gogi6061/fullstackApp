package com.amiriskhakov.spring.fullstackapp.services;


import com.amiriskhakov.spring.fullstackapp.entity.User;
import com.amiriskhakov.spring.fullstackapp.entity.enums.Role;
import com.amiriskhakov.spring.fullstackapp.exceptions.UserExistException;
import com.amiriskhakov.spring.fullstackapp.payload.request.SignupRequest;
import com.amiriskhakov.spring.fullstackapp.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }



    public User createUser(SignupRequest userIn){
        User user =  new User();
        user.setEmail(userIn.getEmail());
        user.setName(userIn.getFirstname());
        user.setLastname(userIn.getLastname());
        user.setUsername(userIn.getUsername());
        user.setPassword(passwordEncoder.encode(userIn.getPassword()));
        user.getRole().add(Role.ROLE_USER);

        try{
            LOG.info("Saving User {}", userIn.getEmail());
            return userRepository.save(user);
        }catch (Exception e){
            LOG.error("Error during registration. {}", e.getMessage());
            throw  new UserExistException("This user "+ user.getUsername()+ "already exist. Please check credentials");
        }

    }
}
