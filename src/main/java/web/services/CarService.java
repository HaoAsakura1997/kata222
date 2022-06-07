package web.services;

import web.models.Car;

import java.util.*;

public class CarService {
    public List<Car> getCarList() {
        Car car1 = new Car("Mercedes", "A", 10_000_000);
        Car car2 = new Car("BMW", "X6", 5_000_000);
        Car car3 = new Car("Lada", "Priora", 1_200_000);
        Car car4 = new Car("Aston Martin", "DB9", 22_000_000);
        Car car5 = new Car("Toyota", "Crown", 5_000_000);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        return carList;
    }

}
