package com.practicalunittesting;

public interface TemplateEngine {
    String prepareMessage(Template template, Client client);
}