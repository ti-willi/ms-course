package com.tiwilli.hrpayroll.services;

import com.tiwilli.hrpayroll.dto.PaymentDTO;
import com.tiwilli.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDTO getPayment(long workerId, int days) {
        return new PaymentDTO("Bob", 200.0, days);
    }

}
