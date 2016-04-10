package com.decorator;
public class Change implements TheGreatestSage {
    private TheGreatestSage sage;
    
    public Change(TheGreatestSage sage){
        this.sage = sage;
    }

    public void move() {
        // 代码
        sage.move();
    }
}