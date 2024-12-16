package com.budgetify.budgetify_app.transaction;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class TransactionService {
    public List<Transaction> getTransactions() {
        return List.of(
                new Transaction(
                        1L,
                        new BigDecimal("31.03"),
                        "McDonalds",
                        "Expense",
                        LocalDate.of(2024, Month.JANUARY, 5)
                )
        );
    }
}
