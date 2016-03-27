package com.proxy;
//代理类
public class proxy implements traffic{
	private real rl=new real();
	public void traffic(){
		doBefore();
		rl.traffic();
		doAfter();
	}
	public void doBefore(){
		System.out.println("前置处理");
	}
	public void doAfter(){
		System.out.println("后置处理");
	}

}
