package dto;

public class Bookstore {
	
	// field
	private int bookNo;
	private int price;
	private String title;
	private String publisher_name;
	

	public Bookstore() {
	}


	public Bookstore(int bookNo, int price, String title, String publisher_name) {
		super();
		this.bookNo = bookNo;
		this.price = price;
		this.title = title;
		this.publisher_name = publisher_name;
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


	public String getPublisher_name() {
		return publisher_name;
	}


	public void setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
	}


	@Override
	public String toString() {
		return "Bookstore [bookNo=" + bookNo + ", price=" + price + ", title=" + title + ", publisher_name="
				+ publisher_name + "]";
	}


	
	
}