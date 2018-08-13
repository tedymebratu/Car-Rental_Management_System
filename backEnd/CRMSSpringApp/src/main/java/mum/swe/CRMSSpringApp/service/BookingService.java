package mum.swe.CRMSSpringApp.service;

import mum.swe.CRMSSpringApp.model.Booking;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookingService {
    List<Booking> findAll();

    Booking save(Booking booking);

    Optional<Booking> findById(Long id);

    void delete(Long id);
//	 void updateCar(Car oldCar, Car newCar);
}
