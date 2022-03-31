package com.boots.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Document{
    int id;
    String imagePath;
    int clientId;
}
