package com.singleton.Singleton5;

//饿汉式单例
public class Singleton {
	private Singleton(){};
	private static final Singleton single= new Singleton();
	public static Singleton getInstance(){
		return single;
	}
}
