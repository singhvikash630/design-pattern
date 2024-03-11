package com.jspider.jdbc.solidprinciple;

//class should have only one responsibility but This class have 3 responsibilities so this is not right.
public class SingleResponsibility {

	private Marker marker;
	private int quantity;

	public SingleResponsibility(Marker marker, int quantity) {
		super();
		this.marker = marker;
		this.quantity = quantity;
	}

	public int calculateTotal() {
		int price = (marker.price) * this.quantity;
		return price;
	}

	public void printInvoice() {
		// print the invoice
	}

	public void dsaveToDB() {
		// save the data into DB
	}

}

//Below classes are only one responsibility

class InvoiceCalulate {
	private Marker marker;
	private int quantity;

	public InvoiceCalulate(Marker marker, int quantity) {
		super();
		this.marker = marker;
		this.quantity = quantity;
	}

	public int calculateTotal() {
		int price = (marker.price) * this.quantity;
		return price;
	}

}

class InvoicePrint {
	private Marker marker;
	private int quantity;

	public InvoicePrint(Marker marker, int quantity) {
		super();
		this.marker = marker;
		this.quantity = quantity;
	}

	public void printInvoice() {
		// print the invoice
	}

}

class InvoiceSave {
	private Marker marker;
	private int quantity;

	public InvoiceSave(Marker marker, int quantity) {
		super();
		this.marker = marker;
		this.quantity = quantity;
	}

	public void dsaveToDB() {
		// save the data into DB
	}
}
