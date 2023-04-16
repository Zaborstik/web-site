package com.website.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.website.models.MyEntity;
import com.website.services.MyEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private MyEntityService myEntityService;

    public List<MyEntity> getAllEntities() {
        return myEntityService.findAll();
    }

    // Add more methods for CRUD operations

    @GetMapping("/id")
    public String getData(){
        return "data";
    }
}
