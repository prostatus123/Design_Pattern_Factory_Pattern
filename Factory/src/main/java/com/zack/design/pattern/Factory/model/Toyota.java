package com.zack.design.pattern.Factory.model;

import com.zack.design.pattern.Factory.service.Car;

public class Toyota implements Car {

    @Override
    public void view() {
        System.out.println("Toyota");
    }
}
