package com.singleton.singleton1;

//懒汉式单例
public class Singleton {
	private static Singleton single=null;
	private Singleton(){}
	public static Singleton getInstance(){
		if(single==null){
			single=new Singleton();
		}
		return single;
	}
}
