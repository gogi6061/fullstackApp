package com.amiriskhakov.spring.fullstackapp.payload.response;


public class JWTTokenSuccessResponse {
    private boolean success;
    private String token;


    public JWTTokenSuccessResponse(boolean b, String jwt) {
        success = b;
        token = jwt;
    }
    public JWTTokenSuccessResponse(){

    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "JWTTokenSuccessResponse{" +
                "success=" + success +
                ", token='" + token + '\'' +
                '}';
    }
}
