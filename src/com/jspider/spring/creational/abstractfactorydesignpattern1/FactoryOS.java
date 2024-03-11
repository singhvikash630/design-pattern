package com.jspider.spring.creational.abstractfactorydesignpattern1;

public class FactoryOS {
	public OS getInstance(AbstractFactoryOS abstractFactoryOS) {
		return abstractFactoryOS.createOS();
	}
}
