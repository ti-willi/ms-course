package com.tiwilli.hrpayroll.services;

import com.tiwilli.hrpayroll.dto.PaymentDTO;
import com.tiwilli.hrpayroll.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class PaymentService {

    @Value("${hr-worker.host}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;

    public PaymentDTO getPayment(long workerId, int days) {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", String.valueOf(workerId));

        String url = workerHost + "/workers/{id}";

        Worker worker = restTemplate.getForObject(url, Worker.class, uriVariables);

        return new PaymentDTO(Objects.requireNonNull(worker).getName(), worker.getDailyIncome(), days);
    }

}
