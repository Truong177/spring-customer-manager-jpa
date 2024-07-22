package com.example.customermanagerjpa.repositories;

import com.example.customermanagerjpa.models.Customer;

import java.util.List;

public interface IGenerateRepository<T> {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void remove(int id);


}
