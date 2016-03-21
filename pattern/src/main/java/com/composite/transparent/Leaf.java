package com.novel.composite.transparent;

public class Leaf extends Component{
	public String name;
	public Leaf(String name){
		this.name=name;
	}
	public void print() {
			System.out.println("  "+name);
		}
}
