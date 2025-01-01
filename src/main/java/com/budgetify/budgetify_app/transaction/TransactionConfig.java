package com.budgetify.budgetify_app.transaction;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class TransactionConfig {

    @Bean
    CommandLineRunner commandLineRunner(TransactionRepository repository) {
        return args -> {
            Transaction McDonalds = new Transaction( 
                    new BigDecimal("31.03"),
                    "McDonalds",
                    "Expense",
                    LocalDate.of(2024, Month.JANUARY, 5)
            );

            Transaction Spotify = new Transaction(
                    new BigDecimal("11.99"),
                    "Spotify",
                    "Expense",
                    LocalDate.of(2024, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(McDonalds, Spotify)
            );
        };
    }
}
