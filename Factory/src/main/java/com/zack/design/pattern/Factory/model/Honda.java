package com.zack.design.pattern.Factory.model;

import com.zack.design.pattern.Factory.service.Car;

public class Honda implements Car {

    @Override
    public void view() {
        System.out.println("Honda");
    }
}
