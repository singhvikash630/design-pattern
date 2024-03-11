package com.jspider.spring.behavioral.observerdesignpattern;

public interface Subject {
    public void attachObserver(Observer o);
    public void dettachObserver(Observer o);
    public void notifyObserver();
}
