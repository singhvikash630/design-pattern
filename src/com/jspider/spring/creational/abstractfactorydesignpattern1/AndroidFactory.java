package com.jspider.spring.creational.abstractfactorydesignpattern1;

public class AndroidFactory implements AbstractFactoryOS {

	@Override
	public OS createOS() {

		return new Android();
	}

}
