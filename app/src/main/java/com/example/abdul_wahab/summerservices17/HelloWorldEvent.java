package com.example.abdul_wahab.summerservices17;

/**
 * Created by Abdul-Wahab on 8/11/2017.
 */
public class HelloWorldEvent {
    private final String message;

    public HelloWorldEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}