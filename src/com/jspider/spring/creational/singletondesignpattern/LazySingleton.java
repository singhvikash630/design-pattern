package com.jspider.spring.creational.singletondesignpattern;

import javax.inject.Singleton;

@Singleton
public class LazySingleton {

	private static LazySingleton instance = null;

	private LazySingleton() {
		System.out.println("create the singleton object");
	}

	public synchronized static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}

	void method() {
		System.out.println("inside lazy method()");
	}

}
