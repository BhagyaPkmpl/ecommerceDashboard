package com.ecommerceDashboard.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class PaymentMethodRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Object[]> getPaymentMethodStats(
            String paymentMethod,
            String country,
            String productCategory,
            Double purchaseAmountFrom,
            Double purchaseAmountTo,
            LocalDateTime transactionDateFrom,
            LocalDateTime transactionDateTo) {

        Query query = entityManager.createNativeQuery("EXEC PaymentMethodTransactions1 " +
                "@Payment_Method = :paymentMethod, " +
                "@Country = :country, " +
                "@Product_Category = :productCategory, " +
                "@Purchase_AmountFrom = :amountFrom, " +
                "@Purchase_AmountTo = :amountTo, " +
                "@Transaction_Date_From = :dateFrom, " +
                "@Transaction_Date_To = :dateTo");

        query.setParameter("paymentMethod", paymentMethod);
        query.setParameter("country", country);
        query.setParameter("productCategory", productCategory);
        query.setParameter("amountFrom", purchaseAmountFrom);
        query.setParameter("amountTo", purchaseAmountTo);
        query.setParameter("dateFrom", transactionDateFrom);
        query.setParameter("dateTo", transactionDateTo);

        return query.getResultList();
    }

}

