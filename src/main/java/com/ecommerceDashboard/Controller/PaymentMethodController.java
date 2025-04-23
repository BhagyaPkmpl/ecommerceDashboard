package com.ecommerceDashboard.Controller;

import com.ecommerceDashboard.DTO.PaymentMethodFilterRequest;
import com.ecommerceDashboard.Service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PaymentMethodController {

    @Autowired
    private PaymentMethodService service;

    @PostMapping("/payment-methods/filter")
    public List<Object[]> getFilteredPaymentMethods(@RequestBody PaymentMethodFilterRequest filterRequest) {
        return service.getFilteredPaymentStats(filterRequest);
    }

}
