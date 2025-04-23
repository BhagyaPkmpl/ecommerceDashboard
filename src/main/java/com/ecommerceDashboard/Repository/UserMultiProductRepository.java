package com.ecommerceDashboard.Repository;

import com.ecommerceDashboard.DTO.UserMultipleProductFilterRequest;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserMultiProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Object[]> getUsersWithMultipleProducts(UserMultipleProductFilterRequest filter) {
        Query query = entityManager.createNativeQuery(
                "EXEC UsersWithPurchaseMultipleProducts " +
                        "@TransactionYear = :transactionYear, " +
                        "@TransactionMonth = :transactionMonth, " +
                        "@TransactionMonthWeek = :transactionMonthWeek, " +
                        "@Country = :country, " +
                        "@Age_From = :ageFrom, " +
                        "@Age_To = :ageTo");

        query.setParameter("transactionYear", filter.getTransactionYear());
        query.setParameter("transactionMonth", filter.getTransactionMonth());
        query.setParameter("transactionMonthWeek", filter.getTransactionMonthWeek());
        query.setParameter("country", filter.getCountry());
        query.setParameter("ageFrom", filter.getAgeFrom());
        query.setParameter("ageTo", filter.getAgeTo());

        return query.getResultList();
    }
}