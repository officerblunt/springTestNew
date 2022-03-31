package com.boots.service;

import com.boots.models.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeliveryController {
    private final DeliveryService deliveryService;

    @Autowired
    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @PostMapping(value = "/deliveries")
    public ResponseEntity<?> create(@RequestBody Delivery delivery) {
        deliveryService.create(delivery);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/deliveries")
    public  ResponseEntity<List<Delivery>> read() {
        final  List<Delivery> deliveries = deliveryService.readAll();

        return deliveries != null && !deliveries.isEmpty()
                ? new ResponseEntity<>(deliveries, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/deliveries/{id}")
    public ResponseEntity<Delivery> read(@PathVariable(name = "id") int id) {
        final Delivery delivery = deliveryService.read(id);

        return delivery != null
                ? new ResponseEntity<>(delivery, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/deliveries/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Delivery delivery) {
        final boolean updated = deliveryService.update(delivery, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/deliveries/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = deliveryService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
