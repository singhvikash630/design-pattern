package com.jspider.jdbc.solidprinciple;

/*class can only dependent on interfaces not on concrete class*/
class MacBook {
	private WiredKeyboard keyboard;
	private WiredMouse mouse;

	public MacBook() {
		super();
		this.keyboard = new WiredKeyboard();// MacBook is dependent on concrete classes that is WiredKeyboard and
											// WiredMouse.now suppose i have add blutooth keyboard and mouse then design
											// will break
		this.mouse = new WiredMouse();
	}
}

public class DependencyInversion {

}

//Do like below
class MacBook1 {
	private Keyboard keyboard;
	private Mouse mouse;

	public MacBook1(Keyboard keyboard, Mouse mouse) {
		super();
		this.keyboard = keyboard;
		this.mouse = mouse;
	}
}
