package com.visitor;
class Fund implements Service {
     public void accept(Visitor visitor) {
         visitor.process(this);
 
     }
 }