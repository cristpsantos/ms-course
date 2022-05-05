package com.pontescr.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pontescr.hrpayroll.entities.Payment;
import com.pontescr.hrpayroll.entities.Worker;
import com.pontescr.hrpayroll.feignclients.WorkerFeignClients;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClients workerFeignClients;
	
	public Payment getPayment(Long workerId, Integer days) {
			
		Worker worker = workerFeignClients.findById(workerId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
