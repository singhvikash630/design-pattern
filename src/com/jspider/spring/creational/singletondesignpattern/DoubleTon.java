package com.jspider.spring.creational.singletondesignpattern;
class Test{
    private static Test t1;
    private static Test t2;
    private Test() {

    }
    public static Test getInstance() {
        if (t1==null) {
            t1=new Test();
            return t1;
        } else if(t2==null) {
            t2=new Test();
            return t2;
        }else {
            if (Math.random() < 0.5) {
                return t1;
            } else {
                return t2;
            }
        }

    }
}
public class DoubleTon {

    public static void main(String[] args) {
        

    }

}
