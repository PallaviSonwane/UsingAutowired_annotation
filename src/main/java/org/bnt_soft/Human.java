package org.bnt_soft;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
    private Heart heart;

    public Human (){
        System.out.println("i'm default constructor");
    }
   
    public Human(Heart heart) {
        this.heart = heart;
        System.out.println("i'm parameterised constructor");
    }
    @Autowired
    public void setHeart(Heart heart) {
        this.heart = heart;
        System.out.println("im setter method");
    }
    public void startpump(){
        if(heart!=null){

            heart.pump();
        }else{
            System.out.println("your not alive..");
        }
    }


}
