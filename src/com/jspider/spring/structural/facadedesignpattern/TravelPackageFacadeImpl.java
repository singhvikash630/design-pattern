package com.jspider.spring.structural.facadedesignpattern;

public class TravelPackageFacadeImpl implements TravelPackageFacade{

    @Override
    public void book() {
        TransferBooking transferBooking=new TransferBookingImpl();
        transferBooking.book();
        
        FlightBooking flightBooking=new FlightBookingImpl();
        flightBooking.book();
        
        HotelBooking hotelBooking=new HotelBookingImpl();
        hotelBooking.book();
        
        
        System.out.println("Travel package booked successsfully");
        
    }

}
