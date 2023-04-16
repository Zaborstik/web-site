package com.website.services;

import com.website.models.MyEntity;
import com.website.repositories.MyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyEntityService {

    @Autowired
    private MyEntityRepository myEntityRepository;

    public List<MyEntity> findAll(){
        return myEntityRepository.findAll();
    }

    // Add more methods for CRUD operations
}
