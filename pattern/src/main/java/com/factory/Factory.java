package com.factory;
// 抽象的工厂类，定义了其子类必须实现的createProduct()方法 
abstract class Factory { 
  //运用了Java 中的泛型和反射技术 
  public abstract <T extends IProduct> T createProduct(Class<T> c); 
} 