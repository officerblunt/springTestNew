package com.boots.service;

import com.boots.models.Delivery;

import java.util.List;

public interface DeliveryService {

    void create(Delivery delivery);

    List<Delivery> readAll();

    Delivery read(int id);

    boolean update(Delivery delivery, int id);

    boolean delete(int id);
}
