package com.bridgelabz.greetingapp.model;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    String template = "Hello %s!";
    AtomicLong counter = new AtomicLong();
    String formattedMessage;
    long count;
    public Greeting(String name) {
        this.formattedMessage = String.format(template, name);
        this.count = counter.incrementAndGet();
    }

    public String getFormattedMessage() {
        return formattedMessage;
    }

    public long getCount() {
        return count;
    }
}
