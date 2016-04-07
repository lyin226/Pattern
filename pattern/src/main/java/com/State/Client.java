package com.State;
public class Client {

    public static void main(String[] args){
        //创建状态
        State state = new ConcreteStateB();
        //创建环境
        Context context = new Context();
        //将状态设置到环境中
        context.setState(state);
        //请求
        context.request("test");
        
        State stateB = new ConcreteStateA();
        Context contextB = new Context();
        contextB.setState(stateB);
        contextB.request("11111");
    }
}