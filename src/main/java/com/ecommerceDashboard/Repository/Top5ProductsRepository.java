package com.ecommerceDashboard.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Top5ProductsRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Object[]> getTop5Products(Integer year, Integer month, Integer week) {
        Query query = entityManager.createNativeQuery(
                "EXEC Top5ProductsS " +
                        "@TransactionYear = :year, " +
                        "@TransactionMonth = :month, " +
                        "@TransactionMonthWeek = :week"
        );

        query.setParameter("year", year);
        query.setParameter("month", month);
        query.setParameter("week", week);

        return query.getResultList();
    }
}
