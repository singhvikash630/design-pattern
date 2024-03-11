package com.jspider.spring.creational.factorydesignpattern;

//client application not able to see the implementation class
public class FactoryMain {

    public static void main(String[] args) {

        FactoryOS factory=new FactoryOS();
        OS obj1=factory.getInstance("open");
        obj1.spec();
        OS obj2=factory.getInstance("closed");
        obj2.spec();
        OS obj3=factory.getInstance("aaaa");
        obj3.spec();
    }

}
