package com.ecommerceDashboard.Controller;

import com.ecommerceDashboard.DTO.ProductCategoryFilterRequest;
import com.ecommerceDashboard.Service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product-categories")
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService service;

    @PostMapping("/top5")
    public List<Object[]> getTop5CommonProductCategories(@RequestBody ProductCategoryFilterRequest filterRequest) {
        return service.getTop5CommonProductCategories(filterRequest);
    }
}
