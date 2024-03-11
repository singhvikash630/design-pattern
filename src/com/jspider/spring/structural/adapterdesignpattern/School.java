package com.jspider.spring.structural.adapterdesignpattern;

public class School {

    public static void main(String[] args) {
        PenAdapter adapter=new PenAdapter();
        AssignmentWork aw=new AssignmentWork();
        aw.setPen(adapter);
        aw.writeAssignment("i am bit tried to write an assignment");

    }

}
