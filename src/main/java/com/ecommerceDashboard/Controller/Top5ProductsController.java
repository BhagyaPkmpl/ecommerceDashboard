package com.ecommerceDashboard.Controller;


import com.ecommerceDashboard.DTO.Top5ProductsRequest;
import com.ecommerceDashboard.Service.Top5ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/top-products")
public class Top5ProductsController {

    @Autowired
    private Top5ProductsService service;

    @PostMapping("/filter")
    public List<Object[]> getTop5Products(@RequestBody Top5ProductsRequest request) {
        return service.fetchTop5Products(request);
    }
}