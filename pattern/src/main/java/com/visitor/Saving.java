package com.visitor;
public class Saving implements Service { 
     public void accept(Visitor visitor) {
         visitor.process(this);
 
     }
 }