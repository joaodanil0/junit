package com.practicalunittesting;

import java.util.List;
import java.util.ArrayList;

class Client {
    private List<Address> addresses = new ArrayList<>();
    private String email;

    Client() {};

    void addAddress(Address address) {
        addresses.add(address);
    }

    List<Address> getAddresses() {
        return addresses;
    }

    String getEmail() {
        return email;
    }
}
