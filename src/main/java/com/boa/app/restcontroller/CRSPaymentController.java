package com.boa.app.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.app.entity.Payment;

@RestController
@RequestMapping("/payment")
public class CRSPaymentController {
	
	@GetMapping("/status")
    public String getStatus() {
        return "CRS Payment Service is up and running!";
    }
	
	@PostMapping("/process")
    public String processPayment(@RequestBody Payment payment) {
        // Add your payment processing logic here
        return "Payment processed successfully for " + payment.getAmount();
    }

}
