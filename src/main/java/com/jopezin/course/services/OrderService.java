package com.jopezin.course.services;

import com.jopezin.course.entities.Order;
import com.jopezin.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> orderObj = repository.findById(id);
        return orderObj.get();
    }
}
