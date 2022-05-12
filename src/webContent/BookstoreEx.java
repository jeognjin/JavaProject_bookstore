package webContent;

import java.util.Scanner;

import dto.Bookstore;

public class BookstoreEx {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int select;
		boolean run = true;
		Bookstore bookstore = null;
		int result = 0;
		int bookNo = 0;
		
		while (run) {

			System.out.println("===============Bookstore===============");
			System.out.println("  1.등록하기 | 2.삭제하기 | 3.정보수정 | 4.종료");
			System.out.println("=======================================");

			System.out.println("선택 >>> ");
			select = Integer.parseInt(sc.nextLine());

			switch (select) {
			case 1:
				bookstore = inputBookInfo();
				result = BookstoreController.regist(bookstore);
				if (result > 0) {
					System.out.println(bookstore.getTitle()+"등록 완료");
				} else {
					System.out.println("등록 실패. 관리자에게 문의하세요.");
				}
				break;
			case 2:
				System.out.println("삭제할 도서의 번호를 입력하세요.");
				bookNo = Integer.parseInt(sc.nextLine());
				result = BookstoreController.deleteInfo(bookNo);
				if(result > 0) {
					System.out.println(bookNo+"번 도서정보가 삭제되었습니다.");
				}else {
					System.out.println("삭제 실패. 관리자에게 문의하세요.");
				}
				break;
			case 3:
				System.out.println("수정을 원하는 도서의 번호를 입력하세요.");
				bookNo = Integer.parseInt(sc.nextLine());
				bookstore = inputBookInfo(bookNo);
				
				result = BookstoreController.update(bookstore);
				if (result > 0) {
					System.out.println(bookstore.getTitle()+"수정 완료.");
				} else {
					System.out.println("수정 실패. 관리자에게 문의하세요.");
				}
				break;
			case 4:
				System.out.println("프로그램이 종료됩니다.");
				run = false;
				break;
			default:
				break;
			}

		}

	}
}
