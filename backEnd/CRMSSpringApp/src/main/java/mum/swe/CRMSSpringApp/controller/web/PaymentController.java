package mum.swe.CRMSSpringApp.controller.web;


import mum.swe.CRMSSpringApp.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaymentController {
    @Autowired
    private PaymentService paymentServiceg;

    @RequestMapping(value = "/payment/{id}", method = RequestMethod.GET)
    public ModelAndView view(@PathVariable Long id, Model model) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("payment", paymentServiceg.findById(id).get());
        modelAndView.setViewName("payment/show");

        return modelAndView;
    }


}

