package com.visitor;

import java.util.ArrayList;
import java.util.List;
public class Client {
	 // 正常逻辑实现
	public static void main(String[] args){  
	Service service1 = new Saving();
	Service service2 = new Fund();
	Service service3 = new Draw();
	List<Service> ls = new ArrayList<Service>();
	ls.add(service1);
	ls.add(service2);
	ls.add(service3);
	for (Service service : ls) {
	  if (service instanceof Saving) {
	          System.out.println("存款");
	 } else if (service instanceof Fund) {
	       System.out.println("基金");
	} else if (service instanceof Draw) {
	     System.out.println("提款");
	 }
	 }
	         //上述的问题是随着业务量增大 代码维护量会非常的大 需要不断的去判断 
	         
	         //采用访问者模式解决
    Service saving = new Saving();
    Service fund = new Fund();
	Service draw = new Draw();
	Visitor visitor = new Visitor();
	saving.accept(visitor);
	fund.accept(visitor);
	draw.accept(visitor);
	 //上述中accept中实际上有观察者的影子 实际上 访问者我们也可以理解成一个对业务熟悉的观察者
	//他不断观察者是否有新的业务需求 有的话 进行相应的业务处理
   }
}