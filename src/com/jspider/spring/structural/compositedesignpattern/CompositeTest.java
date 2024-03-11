package com.jspider.spring.structural.compositedesignpattern;

public class CompositeTest {

    public static void main(String[] args) {
       Component hd=new Leaf(4000, "HDD");
       Component mouse=new Leaf(500, "mouse");
       Component monitor=new Leaf(8000, "monitor");
       Component ram=new Leaf(3000, "ram");
       Component cpu=new Leaf(9000, "cpu");
       
       Composite ph=new Composite("Peri");
       Composite cabinet=new Composite("Cabinet");
       Composite mb=new Composite("MB");
       Composite computer=new Composite("Computer");
       
       mb.addComponent(ram);
       mb.addComponent(cpu);
       
       ph.addComponent(mouse);
       ph.addComponent(monitor);
       
       cabinet.addComponent(hd);
       cabinet.addComponent(mb);
       
       computer.addComponent(ph);
       computer.addComponent(cabinet);
       
      ram.showPrice();
       ph.showPrice();
       
       computer.showPrice();
    }

}
