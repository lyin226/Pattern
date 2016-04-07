package com.State;
public class ConcreteStateB implements State {

    public void handle(String sampleParameter) {
        
        System.out.println("这里是状态B:" + sampleParameter);
    }

}