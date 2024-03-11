package com.jspider.spring.structural.proxydesignpattern;

public class NetworkSettings {
    public ISP getInternet() {        
        return new InternetProxy();
    }
    public ISP getISP() {        
        return new Vodafone();
    }

}
