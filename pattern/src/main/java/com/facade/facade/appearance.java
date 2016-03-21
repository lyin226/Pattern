package com.facade.facade;

//通过一个外观类调用方法
public class appearance {
	private operation add;
	private operation sub;
	private operation div;
	private operation mul;
	public appearance(){
		add=new add();
		sub=new sub();
		div=new div();
		mul=new mul();
	}
	public void add(){
		add.operation();
	}
	public void sub(){
		sub.operation();
	}
	public void div(){
		div.operation();
	}
	public void mul(){
		mul.operation();
	}

}
