package com.practicalunittesting;

public interface MailServer {
    /**
     * Sends a message to the given address.
     *
     * @param email   destination e‑mail address
     * @param message body of the message
     */
    void send(String email, String message);
}