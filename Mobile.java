package org.coms;

public class Mobile {
    public static void main(String[] args){
       SimProvider pro=new SimProvider();
       Sim sim1=pro.getSim("Vodafone");
       sim1.call();
       sim1.data();
    }
}
