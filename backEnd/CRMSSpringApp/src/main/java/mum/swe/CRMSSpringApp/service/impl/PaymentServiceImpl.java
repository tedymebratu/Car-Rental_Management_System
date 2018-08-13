package mum.swe.CRMSSpringApp.service.impl;

import mum.swe.CRMSSpringApp.model.Payment;
import mum.swe.CRMSSpringApp.repository.PaymentRepository;
import mum.swe.CRMSSpringApp.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public Optional<Payment> findById(Long id) {

        return this.paymentRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        paymentRepository.delete(this.findById(id).get());
    }


}

