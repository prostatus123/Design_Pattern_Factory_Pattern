package com.zack.design.pattern.Factory.model;

import com.zack.design.pattern.Factory.main.CarFactory;

public class Boss {

    public void viewHonda() {
        Honda honda = new Honda();
        honda.view();
    }

    public void viewNexus() {
        Nexus nexus = new Nexus();
        nexus.view();
    }

    public void viewToyota(){
        Toyota toyota = new Toyota();
        toyota.view();
    }

    public void viewCar() {
        CarFactory carFactory = new CarFactory();
        carFactory.viewCar("HONDA");
        carFactory.viewCar("NEXUS");
        carFactory.viewCar("TOYOTA");
    }
}

