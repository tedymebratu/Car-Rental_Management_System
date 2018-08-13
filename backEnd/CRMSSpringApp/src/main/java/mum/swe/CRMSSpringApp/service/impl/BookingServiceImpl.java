package mum.swe.CRMSSpringApp.service.impl;

import mum.swe.CRMSSpringApp.model.Booking;
import mum.swe.CRMSSpringApp.repository.BookingRepository;
import mum.swe.CRMSSpringApp.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("bookingService")
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking save(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Optional<Booking> findById(Long id) {

        return bookingRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        bookingRepository.deleteById(id);
    }


}

