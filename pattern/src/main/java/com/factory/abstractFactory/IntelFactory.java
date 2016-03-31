package com.factory.abstractFactory;

public class IntelFactory implements AbstractFactory {

    public Cpu createCpu() {
        return new IntelCpu(755);
    }
    public Mainboard createMainboard() {
        // TODO Auto-generated method stub
        return new IntelMainboard(755);
    }

}