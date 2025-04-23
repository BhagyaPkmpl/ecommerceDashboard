package com.ecommerceDashboard.Controller;
import com.ecommerceDashboard.DTO.UserMultipleProductFilterRequest;
import com.ecommerceDashboard.Service.UserMultiProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserMultiProductController {

    @Autowired
    private UserMultiProductService service;

    @PostMapping("/multiple-products")
    public List<Object[]> getUsersWithMultipleProductCategories(@RequestBody UserMultipleProductFilterRequest request) {
        return service.getFilteredUsers(request);
    }
}
