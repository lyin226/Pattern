package com.singleton.Singleton4;
//内部类的实现方式
public class Singleton {
	private static class internal {
		private static Singleton single=new Singleton();
	}
	private Singleton(){}
	public static final Singleton  getInstance(){
		return internal.single;
	}
}
