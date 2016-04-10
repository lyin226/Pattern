package com.decorator;
public class Client {

    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        TheGreatestSage bird = new Bird(sage);
        TheGreatestSage fish = new Fish(sage);
        sage.move();
        bird.move();
        fish.move();
        // 第一种写法
       // TheGreatestSage bird = new Bird(sage);
       // TheGreatestSage fish = new Fish(sage);
        // 第二种写法
        //TheGreatestSage fish = new Fish(new Bird(sage));
       // fish.move(); 
      //  bird.move();
    }

}