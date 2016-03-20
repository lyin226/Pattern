package com.novel.composite.security;

//叶子节点  输出一个商品
public class Leaf implements Component {

	private String name;
	public Leaf(String name){
		this.name=name;
	}
	public void print() {
		System.out.println("  "+name);
	}
}
