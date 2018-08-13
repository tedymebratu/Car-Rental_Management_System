package mum.swe.CRMSSpringApp.repository;

import mum.swe.CRMSSpringApp.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface CarRepository extends JpaRepository<Car, Serializable> {
//	void updateCar(Car oldCar, Car newCar);
}
