package com.zack.design.pattern.Factory.main;

import com.zack.design.pattern.Factory.model.Honda;
import com.zack.design.pattern.Factory.model.Nexus;
import com.zack.design.pattern.Factory.model.Toyota;
import com.zack.design.pattern.Factory.service.Car;

public class CarFactory {

    public void viewCar(String carType) {
        Car car;
        if (carType.equalsIgnoreCase("HONDA")) {
            car = new Honda();
            car.view();
        } else if (carType.equalsIgnoreCase("NEXUS")) {
            car = new Nexus();
            car.view();
        } else if (carType.equalsIgnoreCase("TOYOTA")) {
            car = new Toyota();
            car.view();
        }
    }
}
