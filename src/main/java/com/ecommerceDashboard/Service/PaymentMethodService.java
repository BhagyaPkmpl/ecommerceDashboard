package com.ecommerceDashboard.Service;

import com.ecommerceDashboard.DTO.PaymentMethodFilterRequest;
import com.ecommerceDashboard.Repository.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PaymentMethodService {

    @Autowired
    private PaymentMethodRepository repository;

    public List<Object[]> getFilteredPaymentStats(PaymentMethodFilterRequest filter) {
        LocalDateTime dateFrom = filter.getTransactionDateFrom();
        LocalDateTime dateTo = filter.getTransactionDateTo();

        return repository.getPaymentMethodStats(
                filter.getPaymentMethod(),
                filter.getCountry(),
                filter.getProductCategory(),
                filter.getPurchaseAmountFrom(),
                filter.getPurchaseAmountTo(),
                dateFrom,
                dateTo
        );
    }
}

