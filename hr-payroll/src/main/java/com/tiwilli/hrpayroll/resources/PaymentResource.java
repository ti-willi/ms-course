package com.tiwilli.hrpayroll.resources;

import com.tiwilli.hrpayroll.dto.PaymentDTO;
import com.tiwilli.hrpayroll.entities.Payment;
import com.tiwilli.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    @Autowired
    private PaymentService service;

    @GetMapping(value = "/{workerId}/days/{days}")
    public ResponseEntity<PaymentDTO> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
        PaymentDTO obj = service.getPayment(workerId, days);
        return ResponseEntity.ok(obj);
    }
}
