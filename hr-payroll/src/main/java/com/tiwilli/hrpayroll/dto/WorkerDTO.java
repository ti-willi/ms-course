package com.tiwilli.hrpayroll.dto;

import com.tiwilli.hrpayroll.entities.Worker;

public class WorkerDTO {

    private Long id;
    private String name;
    private Double dailyIncome;

    public WorkerDTO(Long id, String name, Double dailyIncome) {
        this.id = id;
        this.name = name;
        this.dailyIncome = dailyIncome;
    }

    public WorkerDTO(Worker entity) {
        id = entity.getId();
        name = entity.getName();
        dailyIncome = entity.getDailyIncome();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }
}
