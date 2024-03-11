package com.jspider.spring.creational.prototypedesignpattern;

public class Book {
	private int bid;
	private String nname;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getNname() {
		return nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", nname=" + nname + "]";
	}
}
