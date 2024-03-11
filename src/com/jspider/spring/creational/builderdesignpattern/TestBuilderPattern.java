package com.jspider.spring.creational.builderdesignpattern;

public class TestBuilderPattern {

	public static void main(String[] args) {

		Phone phone = new PhoneBuilder().setBattery(1).setOs("ios").getPhone();
		System.out.println(phone);
	}

}
