package com.Iterator;

import java.util.List;
/**
 * 迭代器模式 具体的容器角色
 * @author admin
 *
 */
public class ConcreteAggregate implements Aggregate {
     private List<Object> list;
 
     public ConcreteAggregate(List<Object> list) {
         this.list = list;
 
     }
 
     public void add(Object obj) {
         list.add(obj);
 
     }
 
     public Iterator iterator() {
         // TODO Auto-generated method stub
      return  new ConcreteIterator(list);
     }
 
     public void remove(Object obj) {
         list.remove(obj);
 
     }
 
 }