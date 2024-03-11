package com.jspider.spring.creational.prototypedesignpattern;
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs=new BookShop();
        bs.setShopName("bikaner");
        bs.loadData();
        bs.getBooks().remove(3);
        System.out.println(bs);
        
        BookShop bs1=bs.clone();
        bs1.setShopName("Haldiram");      
        System.out.println(bs1);
    }
    
    
}
