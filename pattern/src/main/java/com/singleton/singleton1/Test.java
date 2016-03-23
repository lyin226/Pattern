package com.singleton.singleton1;

public class Test {
	
	public static void main(String[] args){
		Singleton single=Singleton.getInstance();
		Singleton single1=Singleton.getInstance();
		if(single==single1){
			System.out.println("是同一个实例");
		}
		else{
			System.out.println("不是同一个实例");
		}
		
	}

}
