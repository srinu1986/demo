package com.example.demo.service;

public class DogNotFoundException extends RuntimeException {
    public DogNotFoundException(String message) {
        super(message);
    }
}
