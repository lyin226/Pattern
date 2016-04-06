package com.Template.template;
public class Coffee extends Beverage{  
	  
    @Override  
    public void addCoundiments() {  
        System.out.println("添加糖和牛奶");   }  
  
    @Override  
    public void brew() {  
        System.out.println("用水冲咖啡");  
    }  
      
    /** 
     * 有的客人不喜欢加配料 
     */  
    @Override  
    public boolean hook() {  
        return false;  
    }  
      
    /*@Override 
    public void hook() { 
        System.out.println("再来一杯"); 
    } 
*/  
}  