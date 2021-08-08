package com.myfirstapp.model;

public class Greeting {
    private final long  id;
    private final String message;

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Greeting(long id, String message) {
        this.id = id;
        this.message = message;
    }
}
