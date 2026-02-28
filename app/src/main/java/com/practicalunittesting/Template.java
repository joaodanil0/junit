package com.practicalunittesting;

/**
 * Represents a message template that can be rendered for a client.
 */
public class Template {

    private final String text;

    public Template(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}