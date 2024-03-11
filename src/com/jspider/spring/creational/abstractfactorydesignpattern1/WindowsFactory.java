package com.jspider.spring.creational.abstractfactorydesignpattern1;

public class WindowsFactory implements AbstractFactoryOS {

	@Override
	public OS createOS() {
		return new Windows();
	}

}
