package com.pos.pointofsale.controller;

import com.pos.pointofsale.dto.CustomerSaveDto;
import com.pos.pointofsale.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
public class CustomerController {
    private final CustomerService service;

    @PostMapping("/customers")
    public void save(@RequestBody CustomerSaveDto customerDto) {
        System.out.println("save triggeres..");
        service.save(customerDto);
    }

    @GetMapping("/customers")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        System.out.println("delete customer triggered..");
        try {
            service.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
