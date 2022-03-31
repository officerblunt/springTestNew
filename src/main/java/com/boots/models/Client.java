package com.boots.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String phone;
    private String organisation;
    private String address;
    private Document doc;
}

