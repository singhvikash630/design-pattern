package com.jspider.jdbc.solidprinciple;

/*interface should not force to client to implement unnecessary functions*/
interface RestaurantEmployee {
	void washDishes();

	void serveCustomers();

	void cookFood();
}

class waiter implements RestaurantEmployee {
	/*
	 * waiter can only wash dishes and serve customers so here interface is forcing
	 * to implement all functionality. this is not the good design
	 */
	@Override
	public void washDishes() {
		// TODO Auto-generated method stub

	}

	@Override
	public void serveCustomers() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cookFood() {
		// TODO Auto-generated method stub

	}

}

public class InterfaceSeggregation {

}

/* Do like below make multiple interfaces based on task */
interface WaiterInterface {
	void washDishes();

	void serveCustomers();

}

interface ChefInterface {
	void cookFood();

}
