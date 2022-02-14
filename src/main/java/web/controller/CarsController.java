package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;
import web.services.CarServiceImpl;

@Controller
public class CarsController {
    @Autowired
    private CarService carService;
    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model){
        if(count==null){
            model.addAttribute("cars", carService.getCars());
        } else {
            model.addAttribute("cars", carService.getCars(count));
        }
        return "cars/cars";
    }


}
