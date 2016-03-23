package com.singleton.Singleton2;

//懒汉式单例  同步机制 线程安全
public class Singleton {
	private static Singleton single=null;
	private Singleton(){}
	public static synchronized Singleton getInstance(){
		if(single==null){
			single=new Singleton();
		}
		return single;
	}
}