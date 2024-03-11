package com.jspider.spring.creational.singletondesignpattern;

public class EagerSingleton {
	private static final EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
		System.out.println("create the singleton object");
	}

	public synchronized static EagerSingleton getInstance() {
		return instance;
	}

	void method() {
		System.out.println("inside eager method()");
	}
}
