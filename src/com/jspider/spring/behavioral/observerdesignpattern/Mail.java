package com.jspider.spring.behavioral.observerdesignpattern;

public class Mail {
    String receiverName;
    String address;
    String content;
    public Mail(String receiverName, String address, String content) {
        super();
        this.receiverName = receiverName;
        this.address = address;
        this.content = content;
    }

}
