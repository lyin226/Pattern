package com.novel.composite.transparent;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	//用于管理树枝节点多个对象
	private List<Component> product=new ArrayList<Component>();
	//对象名字
	private String name ;
	public Composite(String name){
		this.name=name;
	}
	//购物车加入一个商品
	public void addComponent(Component testComp){
		product.add(testComp);
	}
	//购物车移除一个商品
	public void removeComponent(int index){
		product.remove(index);
	}
	public void print() {
		System.out.println("  "+name);
		if(this.product!=null){
			for(Component testComp:product){
				System.out.println();//下一行
				testComp.print();
			}
		}
	}
	

}
