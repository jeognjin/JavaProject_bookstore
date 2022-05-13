package dto;

public class Bookstore {
	
	// field
	private int bookNo;
	private int price;
	private String title;
	private String publisherName;
	

	public Bookstore() {
	}


	public Bookstore(int bookNo, int price, String title, String publisherName) {
		super();
		this.bookNo = bookNo;
		this.price = price;
		this.title = title;
		this.publisherName = publisherName;
	}


	public int getBookNo() {
		return bookNo;
	}


	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getPublisherName() {
		return publisherName;
	}


	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}


	@Override
	public String toString() {
		return "Bookstore [bookNo=" + bookNo + ", price=" + price + ", title=" + title + ", publisherName="
				+ publisherName + "]";
	}


	
	
}