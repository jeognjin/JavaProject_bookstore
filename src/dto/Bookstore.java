package dto;

public class Bookstore {
	
	// field
	private int bookNo;
	private int price;
	private int pubNo;
	private String title;
	

	public Bookstore() {
	}

	//constructor
	public Bookstore(int bookNo, int price, int pubNo, String title) {
		super();
		this.bookNo = bookNo;
		this.price = price;
		this.pubNo = pubNo;
		this.title = title;
	}

	//getter & setter
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


	public int getPubNo() {
		return pubNo;
	}


	public void setPubNo(int pubNo) {
		this.pubNo = pubNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	//toString
	@Override
	public String toString() {
		return "Bookstore [bookNo=" + bookNo + ", price=" + price + ", pubNo=" + pubNo + ", title=" + title + "]";
	}

	

	// field
	private int bookNo;
	private int price;
	private int pubNo;
	private String title;


	public Bookstore() {
	}

	//constructor
	public Bookstore(int bookNo, int price, int pubNo, String title) {
		super();
		this.bookNo = bookNo;
		this.price = price;
		this.pubNo = pubNo;
		this.title = title;
	}

	//getter & setter
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


	public int getPubNo() {
		return pubNo;
	}


	public void setPubNo(int pubNo) {
		this.pubNo = pubNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

	//toString
	@Override
	public String toString() {
		return "Bookstore [bookNo=" + bookNo + ", price=" + price + ", pubNo=" + pubNo + ", title=" + title + "]";
	}


	
}