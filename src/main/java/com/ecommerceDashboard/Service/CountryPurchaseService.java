package com.ecommerceDashboard.Service;

import com.ecommerceDashboard.DTO.CountryPurchaseFilterRequest;
import com.ecommerceDashboard.Repository.CountryPurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryPurchaseService {

    @Autowired
    private CountryPurchaseRepository repository;

    public List<Object[]> getFilteredCountryPurchases(CountryPurchaseFilterRequest filter) {
        return repository.getCountryPurchaseStats(
                filter.getPaymentMethod(),
                filter.getProductCategory(),
                filter.getTransactionDateFrom(),
                filter.getTransactionDateTo()
        );
    }
}