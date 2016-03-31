package com.factory.factory;
public class Test {
    public static void main(String[] args) {
        VehicleFactory factory = new BroomFactory();
        Moveable m = factory.create();
        m.run();
        
        VehicleFactory factorycopy = new PlaneFactory();
        Moveable mn = factorycopy.create();
        mn.run();
    }
}