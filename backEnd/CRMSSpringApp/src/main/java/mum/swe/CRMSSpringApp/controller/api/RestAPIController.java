package mum.swe.CRMSSpringApp.controller.api;

import mum.swe.CRMSSpringApp.model.Car;
import mum.swe.CRMSSpringApp.model.Category;
import mum.swe.CRMSSpringApp.service.CarService;
import mum.swe.CRMSSpringApp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestAPIController {
    @Autowired
    private CarService carService;

    @Autowired
    private CategoryService categoryService;

    // Car

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Car> getAllCars() {
        return carService.findAll();
    }

    @PostMapping(value = "/cars")
    public Car addCar(@RequestBody Car car) {
        return carService.save(car);
    }

    @GetMapping(value = "/cars/{id}")
    public @ResponseBody
    Car findCarById(@PathVariable Long id) {
        return carService.findById(id);
    }

    @DeleteMapping(value = "/cars/{id}")
    public @ResponseBody
    boolean deleteCar(@PathVariable Long id) {
        carService.delete(id);
        return true;
    }

    // Category

    @RequestMapping(value = "/categories")
    @ResponseBody
    public List<Category> getAllCategories() {
        return categoryService.findAll();
    }
	
	/*	@PutMapping(value = "/updatecar/{id}")
	public boolean updateCar(@PathVariable Long id, @RequestBody Car newCar) {
		Car oldCar = carService.findById(id);
		carService.updateCar(oldCar, newCar);
		return true;
	}*/
}
