package com.singleton.Singleton3;

//懒汉式单例 双重锁检查
public class Singleton {
	private static Singleton single=null;
	private Singleton(){}
	public static Singleton getInstance(){
		if(single==null){
			synchronized(Singleton.class){//类的反射 返回一个实例
				if(single==null){
					single=new Singleton();
				}
			}
		}
		return single;
	}
}