package com.jspider.spring.behavioral.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Subject{
    private List<Mail> allMail;
    private List<Observer> Observers;
    public PostOffice() {
        allMail=new ArrayList<>();
        Observers=new ArrayList<>();
    }
    public void addMail(Mail m) {
        allMail.add(m);
        notifyObserver();
    }
    public List<Mail> getAllMail() {
        return allMail;
        
    }
    
    @Override
    public void attachObserver(Observer o) {
        Observers.add(o);
        
    }
    @Override
    public void dettachObserver(Observer o) {
        Observers.remove(o);
        
    }
    @Override
    public void notifyObserver() {
       for (int i = 0; i < Observers.size(); i++) {
           Observers.get(i).update(this);
    }
        
    }


}
