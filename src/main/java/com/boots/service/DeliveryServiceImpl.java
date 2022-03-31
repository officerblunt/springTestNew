package com.boots.service;

import com.boots.models.Delivery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class DeliveryServiceImpl implements DeliveryService{

    private static final Map<Integer, Delivery> DELIVERY_REPSITORY_MAP = new HashMap<>();

    private static final AtomicInteger DELIVERY_ID_HOLDER = new AtomicInteger();

    @Override
    public void create(Delivery delivery) {
        final int deliveryId = DELIVERY_ID_HOLDER.incrementAndGet();
        delivery.setId(deliveryId);
        DELIVERY_REPSITORY_MAP.put(deliveryId, delivery);
    }

    @Override
    public List<Delivery> readAll() {
        return new ArrayList<>(DELIVERY_REPSITORY_MAP.values());
    }

    @Override
    public Delivery read(int id) {
        return  DELIVERY_REPSITORY_MAP.get(id);
    }

    @Override
    public boolean update(Delivery delivery, int id) {
        if (DELIVERY_REPSITORY_MAP.containsKey(id)) {
            delivery.setId(id);
            DELIVERY_REPSITORY_MAP.put(id, delivery);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        return DELIVERY_REPSITORY_MAP.remove(id) != null;
    }
}
