package com.jspider.spring.structural.facadedesignpattern;

public class FlightBookingImpl implements FlightBooking{

    @Override
    public void book() {
        System.out.println("Flight booked successsfully");
        
    }

}
