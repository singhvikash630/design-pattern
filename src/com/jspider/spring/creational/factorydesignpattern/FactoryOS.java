package com.jspider.spring.creational.factorydesignpattern;

public class FactoryOS {
    public OS getInstance(String str){
        if(str.equals("open")){
            return new Android();
        }
		else if (str.equals("closed")) {
            return new IOS();
        }
        else{
            return new Windows();
        }

    }
}
