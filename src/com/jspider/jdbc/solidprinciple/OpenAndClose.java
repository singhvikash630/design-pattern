package com.jspider.jdbc.solidprinciple;

//open for extension and close for modification

public class OpenAndClose {
//below code are already running on production
	private int invoice;

	public void saveToDB(int invoice) {
		// save to DB
	}

	// now i am adding extra functionality in the same class this is not right way
	public void saveToFile(int invoice) {
		// save to file
	}

}

//below is the right way
interface InvoiceDao {
	public void save(int invoice);
}

class DatabaseInvoiceDao implements InvoiceDao {

	@Override
	public void save(int invoice) {
		// save to DB
	}
}

class FileInvoiceDao implements InvoiceDao {

	@Override
	public void save(int invoice) {
		// save to file
	}
}
