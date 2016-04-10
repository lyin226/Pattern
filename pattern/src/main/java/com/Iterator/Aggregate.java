package com.Iterator;
/**
 * 迭代器模式 容器角色
 * @author admin
 *
 */
public interface Aggregate { 
     public void add(Object obj);
     public void remove(Object obj);
     public Iterator iterator();
}