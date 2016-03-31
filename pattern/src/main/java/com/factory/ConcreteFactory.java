package com.factory;
class ConcreteFactory extends Factory { 
    public <T extends IProduct> T createProduct(Class<T> c) { 
      T product = null; 
      try { 
        product = (T) Class.forName(c.getName()).newInstance(); 
      } catch (Exception e) { 
        e.printStackTrace(); 
      } 
      return product; 
    } 
  } 