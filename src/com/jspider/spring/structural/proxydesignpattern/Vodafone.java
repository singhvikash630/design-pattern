package com.jspider.spring.structural.proxydesignpattern;

public class Vodafone implements ISP{

    @Override
    public String getResource(String site) {
        switch (site) {
            case "www.google.com":
                return "GOOOOOOOOOLE";
            case "www.yahoo.com":
                return "YAHOOOOO";
            default:
                return "no resource found";
        }

    }

}
