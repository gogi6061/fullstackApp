package com.amiriskhakov.spring.fullstackapp.payload.response;

public class MessageResponse {
    private String message;
    public MessageResponse(String message) {
        this.message = message;
    }

    public MessageResponse(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}
