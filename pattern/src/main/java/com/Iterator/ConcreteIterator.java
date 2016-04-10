package com.Iterator;
import java.util.List;
/**
 * 具体的迭代器实现
 * @author admin
 *
 */
class ConcreteIterator implements Iterator {
     private List<Object> list;
     private int cursor = 0;// 当前游标位置
 
     public ConcreteIterator(List<Object> list) {
         this.list = list;
     }
 
     public boolean hasNext() {
         // TODO Auto-generated method stub
         return !(cursor == list.size());
     }
 
     public Object next() {
         // TODO Auto-generated method stub
         Object obj = null;
         if (hasNext()) {
             obj = list.get(cursor++);
         }
         return obj;
     }
 }
 