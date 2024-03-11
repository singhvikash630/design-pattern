package com.jspider.spring.structural.facadedesignpattern;

public class FacadeClient {

    public static void main(String[] args) {
        TravelPackageFacade travelPackageFacade=new TravelPackageFacadeImpl();
        travelPackageFacade.book();
    }

}
