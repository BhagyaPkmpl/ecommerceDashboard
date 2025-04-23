package com.ecommerceDashboard.Service;

import com.ecommerceDashboard.DTO.ProductCategoryFilterRequest;
import com.ecommerceDashboard.Repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    public List<Object[]> getTop5CommonProductCategories(ProductCategoryFilterRequest filter) {
        return repository.getTop5CommonProductCategories(
                filter.getCountry(),
                filter.getAgeFrom(),
                filter.getAgeTo(),
                filter.getPaymentMethod(),
                filter.getTransactionDateFrom(),
                filter.getTransactionDateTo()
        );
    }
}
