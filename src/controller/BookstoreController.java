package controller;

public class BookstoreController {
	
	//싱글톤
	private static BookstoreController instance;
	
	private BookstoreController() {}
	
	public static BookstoreController getInstance() {
		if(instance == null) {
			instance = new BookstoreController(); 
		}
		return instance;
	} 
}
