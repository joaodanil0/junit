package com.practicalunittesting;

import java.util.List;
import java.util.ArrayList;

class Client {
    private List<Address> addresses = new ArrayList<>();

    Client() {};

    void addAddress(Address address) {
        addresses.add(address);
    }

    List<Address> getAddresses() {
        return addresses;
    }
}
