package com.jspider.spring.behavioral.observerdesignpattern;

public class ObserverTest {

    public static void main(String[] args) {
        PostOffice po=new PostOffice();
        Person person1=new Person("vikash");
        Person person2=new Person("sanu");
        Mail mail=new Mail("vikash","noida","I am fine");
        
        po.attachObserver(person1);
        po.attachObserver(person2);
        
        po.addMail(mail);
    }

}
