package com.factory;
public class Client { 
    public static void main(String[] args) { 
      //创建一个具体工厂 
      Factory factory = new ConcreteFactory(); 
      //根据参数中具体产品的.class名称来决定创建的产品类型 
      IProduct product01 = factory.createProduct(ConcreteProductA.class); 
      IProduct product02 = factory.createProduct(ConcreteProductB.class); 
        
      product01.method01(); 
      product01.method02(); 
      product02.method01(); 
      product02.method02(); 
    } 
}