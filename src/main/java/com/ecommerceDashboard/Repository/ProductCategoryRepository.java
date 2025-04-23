package com.ecommerceDashboard.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class ProductCategoryRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Object[]> getTop5CommonProductCategories(
            String country,
            Integer ageFrom,
            Integer ageTo,
            String paymentMethod,
            LocalDateTime transactionDateFrom,
            LocalDateTime transactionDateTo) {

        Query query = entityManager.createNativeQuery("EXEC Top5CommonProductCotegories " +
                "@Country = :country, " +
                "@Age_From = :ageFrom, " +
                "@Age_To = :ageTo, " +
                "@Payment_Method = :paymentMethod, " +
                "@Transaction_Date_From = :transactionDateFrom, " +
                "@Transaction_Date_To = :transactionDateTo");

        query.setParameter("country", country);
        query.setParameter("ageFrom", ageFrom);
        query.setParameter("ageTo", ageTo);
        query.setParameter("paymentMethod", paymentMethod);
        query.setParameter("transactionDateFrom", transactionDateFrom);
        query.setParameter("transactionDateTo", transactionDateTo);

        return query.getResultList();
    }
}
