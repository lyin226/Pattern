package com.State;
public class ConcreteStateA implements State {


    public void handle(String sampleParameter) {
        
        System.out.println("这里是状态A" + sampleParameter);
    }

}