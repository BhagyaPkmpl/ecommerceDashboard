package com.ecommerceDashboard.Service;

import com.ecommerceDashboard.DTO.Top5ProductsRequest;
import com.ecommerceDashboard.Repository.Top5ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Top5ProductsService {

    @Autowired
    private Top5ProductsRepository repository;

    public List<Object[]> fetchTop5Products(Top5ProductsRequest request) {
        return repository.getTop5Products(
                request.getTransactionYear(),
                request.getTransactionMonth(),
                request.getTransactionMonthWeek()
        );
    }
}
