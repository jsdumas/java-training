package io.jsd.training.java.memorymanagement.escapingreferences.bookcatalog;

public class Book implements BookReadOnly {
	private int id;
	private String title;
	private String author;
	private Price price;
	
	/* (non-Javadoc)
	 * @see io.jsd.training.java.memorymanagement.escapingreferences.bookcatalog.BookReadOnly#getId()
	 */
	@Override
	public int getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see io.jsd.training.java.memorymanagement.escapingreferences.bookcatalog.BookReadOnly#getTitle()
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/* (non-Javadoc)
	 * @see io.jsd.training.java.memorymanagement.escapingreferences.bookcatalog.BookReadOnly#getAuthor()
	 */
	@Override
	public String getAuthor() {
		return author;
	}

	public Book(int id, String title, String author, Double price) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = new Price(price);
	}
	
	/* (non-Javadoc)
	 * @see io.jsd.training.java.memorymanagement.escapingreferences.bookcatalog.BookReadOnly#toString()
	 */
	@Override
	public String toString() {
		return title + " by " + author;
	}
	
	/* (non-Javadoc)
	 * @see io.jsd.training.java.memorymanagement.escapingreferences.bookcatalog.BookReadOnly#getPrice()
	 */
	@Override
	public Price getPrice() {
		return this.price;
	}
	
	//TODO: check if Price is immutable
	public void setPrice(Double price) {
		this.price = new Price(price);
	}
	
}
