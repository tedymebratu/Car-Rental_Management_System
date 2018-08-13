package mum.swe.CRMSSpringApp.service;

import mum.swe.CRMSSpringApp.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {
    List<Car> findAll();

    Car save(Car car);

    Car findById(Long id);

    void delete(Long id);
//	 void updateCar(Car oldCar, Car newCar);
}
