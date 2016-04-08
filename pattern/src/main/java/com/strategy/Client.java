package com.strategy;

public class Client {
	public static void main(String args[]){
		Context context = new Context(new StrategyA());
		System.out.println("选择策略模式的使用");
		context.operate();
		
	}

}
