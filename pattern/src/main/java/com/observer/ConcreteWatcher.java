package com.observer;
//具体的观察者
public class ConcreteWatcher implements Watcher{
	public void update(String str){
		System.out.println(str);
	}
	

}
