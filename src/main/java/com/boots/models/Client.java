package com.boots.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
    int id;
    String firstName;
    String lastName;
    String password;
    String phone;
    String organisation;
    String address;
    Document doc;
}

