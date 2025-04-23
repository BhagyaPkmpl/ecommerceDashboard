package com.ecommerceDashboard.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public class CountryPurchaseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Object[]> getCountryPurchaseStats(
            String paymentMethod,
            String productCategory,
            LocalDateTime dateFrom,
            LocalDateTime dateTo) {

        Query query = entityManager.createNativeQuery("EXEC CountriesPurchaseAmountFilterBy " +
                "@Payment_Method = :paymentMethod, " +
                "@Product_Category = :productCategory, " +
                "@Transaction_Date_From = :dateFrom, " +
                "@Transaction_Date_To = :dateTo");

        query.setParameter("paymentMethod", paymentMethod);
        query.setParameter("productCategory", productCategory);
        query.setParameter("dateFrom", dateFrom);
        query.setParameter("dateTo", dateTo);

        return query.getResultList();
    }
}