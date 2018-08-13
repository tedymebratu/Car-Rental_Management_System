package mum.swe.CRMSSpringApp.service;

import mum.swe.CRMSSpringApp.model.Payment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PaymentService {
    List<Payment> findAll();

    Payment save(Payment payment);

    Optional<Payment> findById(Long id);

    void delete(Long id);
//	 void updateCar(Car oldCar, Car newCar);
}
