package mum.swe.CRMSSpringApp.controller.web;

import mum.swe.CRMSSpringApp.model.Car;
import mum.swe.CRMSSpringApp.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/mycars", method = RequestMethod.GET)
    public ModelAndView cars() {
        List<Car> cars = carService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("cars", cars);
        modelAndView.setViewName("car/list");
        return modelAndView;
    }

    @RequestMapping(value = "/mycar", method = RequestMethod.GET)
    public String create(Model model) {
        model.addAttribute("car", new Car());
        return "car/edit";
    }

    @RequestMapping(value = "/mycar", method = RequestMethod.POST)
    public String edit(@Valid @ModelAttribute("car") Car car,
                       BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("errors", result.getAllErrors());
            return "car/edit";
        }
        car = carService.save(car);
        return "redirect:/cars";
    }

    @RequestMapping(value = "/mycar/{id}", method = RequestMethod.GET)
    public String view(@PathVariable Long id, Model model) {
        model.addAttribute("car", carService.findById(id));
        return "car/edit";
    }

    @RequestMapping(value = "/mycar/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable Long id, Model model) {
        carService.delete(id);
        return "redirect:/mycars";
    }
}
