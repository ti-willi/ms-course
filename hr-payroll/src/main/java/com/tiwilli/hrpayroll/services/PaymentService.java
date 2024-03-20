package com.tiwilli.hrpayroll.services;

import com.tiwilli.hrpayroll.dto.PaymentDTO;
import com.tiwilli.hrpayroll.dto.WorkerDTO;
import com.tiwilli.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public PaymentDTO getPayment(long workerId, int days) {

        WorkerDTO worker = workerFeignClient.findById(workerId).getBody();

        return new PaymentDTO(Objects.requireNonNull(worker).getName(), worker.getDailyIncome(), days);
    }

}
