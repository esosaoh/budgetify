package com.budgetify.budgetify_app.transaction;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table
public class Transaction {
    @Id
    @SequenceGenerator(
            name = "transaction_sequence",
            sequenceName = "transaction_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "transaction_sequence"
    )

    private Long id;
    private BigDecimal amount;
    private String type;
    private String company;
    private LocalDate date;

    public Transaction() {
    }

    public Transaction(Long id, BigDecimal amount, String company, String type, LocalDate date) {
        this.id = id;
        this.date = date;
        this.company = company;
        this.type = type;
        this.amount = amount;
    }

    public Transaction(BigDecimal amount, String type, String company, LocalDate date) {
        this.amount = amount;
        this.type = type;
        this.company = company;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", company='" + company + '\'' +
                ", date=" + date +
                '}';
    }
}
