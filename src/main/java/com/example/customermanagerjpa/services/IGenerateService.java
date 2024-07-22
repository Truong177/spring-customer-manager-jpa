package com.example.customermanagerjpa.services;

import com.example.customermanagerjpa.models.Customer;

import java.util.List;

public interface IGenerateService<T> {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void remove(int id);


}
