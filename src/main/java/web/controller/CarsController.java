package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarService;
import web.services.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

     private CarService carService;

    public CarsController(CarService carService) {
        this.carService = new CarServiceImpl();
    }



    @GetMapping("/cars")
    public String tableOfCars (@RequestParam (value = "count", defaultValue = "0", required = false) String count,  Model model) {



        List<Car> cars = new ArrayList<>();
        int n = Integer.parseInt(count);

        if (n <= 0 || n >= 5) {
            model.addAttribute("cars",carService.getCarList());
            return "cars";
        } else {
            for (int i = 0; i < n; i++) {
                cars.add(carService.getCarList().get(i));
            }
            model.addAttribute("cars",cars);
            return "cars";
        }
    }

}
