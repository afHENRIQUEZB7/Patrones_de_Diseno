package com.FactoryMethod.normalFactory.models;

import com.FactoryMethod.normalFactory.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void start() {
        System.out.println("--> Run Truck !!");
    }

    @Override
    public void stop() {
        System.out.println("--> Stop Truck !!");
    }
}
