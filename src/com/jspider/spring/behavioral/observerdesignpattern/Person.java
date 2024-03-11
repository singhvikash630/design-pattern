package com.jspider.spring.behavioral.observerdesignpattern;

import java.util.List;

public class Person implements Observer{
    String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    @Override
    public void update(Object o) {
        if (o instanceof PostOffice) {
            PostOffice po=(PostOffice)o;
            checkMail(po.getAllMail());
        }

    }

    private void checkMail(List<Mail> mail) {
        for (int i = 0; i < mail.size(); i++) {
            if (name.compareTo(mail.get(i).receiverName) == 0) {
                System.out.println(name+":"+mail.get(i).content);
            }
        }
    }

}
