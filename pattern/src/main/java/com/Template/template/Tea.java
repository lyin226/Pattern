package com.Template.template;
public class Tea extends Beverage{  
	  
    @Override  
    public void addCoundiments() {  
        System.out.println("添加蜂蜜");  
    }  
    @Override  
    public void brew() {  
        System.out.println("用水冲茶");  
    }  
  
}  