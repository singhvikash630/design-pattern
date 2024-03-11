package com.jspider.spring.creational.abstractfactorydesignpattern1;



public class IOSFactory implements AbstractFactoryOS{

    @Override
    public OS createOS() {
        return new IOS();
    }

   

    

}
