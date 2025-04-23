package com.ecommerceDashboard.Controller;

import com.ecommerceDashboard.DTO.CountryPurchaseFilterRequest;
import com.ecommerceDashboard.Service.CountryPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/countries-purchase")
public class CountryPurchaseController {

    @Autowired
    private CountryPurchaseService service;

    @PostMapping("/filter")
    public List<Object[]> getFilteredCountryPurchases(@RequestBody CountryPurchaseFilterRequest filterRequest) {
        return service.getFilteredCountryPurchases(filterRequest);
    }
}