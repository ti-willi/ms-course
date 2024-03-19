package com.tiwilli.hrpayroll.dto;

import com.tiwilli.hrpayroll.entities.Payment;

public class PaymentDTO {

    private String name;
    private Double dailyIncome;
    private Integer days;

    public PaymentDTO() {
    }

    public PaymentDTO(String name, Double dailyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public PaymentDTO(Payment entity) {
        name = entity.getName();
        dailyIncome = entity.getDailyIncome();
        days = entity.getDays();
    }

    public String getName() {
        return name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public Integer getDays() {
        return days;
    }

    public double getTotal() {
        return days * dailyIncome;
    }
}