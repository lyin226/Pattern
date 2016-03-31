package com.factory.factory;
//具体工厂
public class PlaneFactory extends VehicleFactory{
  public Moveable create() {
      return new Plane();
  }
}