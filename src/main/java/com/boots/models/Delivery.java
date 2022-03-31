package com.boots.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Delivery {
    private int id;
    private int amountOfSpaces;
    private String organisation;
}
