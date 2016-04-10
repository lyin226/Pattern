package com.visitor;
public class Draw implements Service {
    public void accept(Visitor visitor) {
         visitor.process(this);
 
     }
 }