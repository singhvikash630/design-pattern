package com.jspider.spring.creational.singletondesignpattern;

public class SingletonLazyMain {

	public static void main(String[] args) 
	{
		LazySingleton instance1=LazySingleton.getInstance();
		instance1.method();
		LazySingleton instance2=LazySingleton.getInstance();
		instance2.method();
		LazySingleton instance3=LazySingleton.getInstance();
		instance3.method();
		
		
	}

}
