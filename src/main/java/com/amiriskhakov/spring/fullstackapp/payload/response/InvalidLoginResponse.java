package com.amiriskhakov.spring.fullstackapp.payload.response;


public class InvalidLoginResponse {

    private String username;
    private String password;



    public InvalidLoginResponse() {
        this.password = "Invalid password";
        this.username = "Invalid username";
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "InvalidLoginResponse{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
