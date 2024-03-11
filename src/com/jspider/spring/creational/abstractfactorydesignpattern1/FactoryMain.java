package com.jspider.spring.creational.abstractfactorydesignpattern1;

//client application not able to see the implementation class
public class FactoryMain {

    public static void main(String[] args) {

        FactoryOS factory=new FactoryOS();
        OS obj1=factory.getInstance(new WindowsFactory());
        obj1.spec();
        OS obj2=factory.getInstance(new IOSFactory());
        obj2.spec();
        OS obj3=factory.getInstance(new AndroidFactory());
        obj3.spec();
    }

}
