package com.boots.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Document{
    private int id;
    private String imagePath;
    private int clientId;
}
