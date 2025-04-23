package com.ecommerceDashboard.Service;


import com.ecommerceDashboard.DTO.UserMultipleProductFilterRequest;

import com.ecommerceDashboard.Repository.UserMultiProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMultiProductService {

    @Autowired
    private UserMultiProductRepository repository;

    public List<Object[]> getFilteredUsers(UserMultipleProductFilterRequest request) {
        return repository.getUsersWithMultipleProducts(request);
    }
}