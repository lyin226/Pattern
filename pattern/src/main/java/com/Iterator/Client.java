package com.Iterator;
import java.util.ArrayList;
import java.util.List;
/**
 * 迭代器模式客户端测试
 * @author admin
 *
 */
public class Client{
public static void main(String[] args) {
	List<Object> list = new ArrayList<Object>();
	         list.add("a");
	         list.add("b");
	         list.add("c");
	         Aggregate aggregate = new ConcreteAggregate(list);
	         Iterator iterator = aggregate.iterator();
	 
	        while (iterator.hasNext()) {
	             String o = (String) iterator.next();
	             System.out.println(o);
	        }
	 }
  }