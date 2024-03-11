package com.jspider.spring.creational.singletondesignpattern;

public class SingletonEagerMain {

	public static void main(String[] args)
	{
		EagerSingleton instance1=EagerSingleton.getInstance();
		instance1.method();
		EagerSingleton instance2=EagerSingleton.getInstance();
		instance2.method();
		EagerSingleton instance3=EagerSingleton.getInstance();
		instance3.method();
		
	}

}
