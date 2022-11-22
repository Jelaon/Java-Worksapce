package com.kh.chap01_oneVsmany.run;

import java.awt.print.Book;
import java.util.Scanner;

public class ObjectArrayRun {
	public static void main(String[] args) {
		Book [] arr = new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		//3개의 전체 도서정보를 입력받은 후 각 객체배열의 인덱스에 해당객체를 생성하기.
		
		for(int i =0; i < arr.length; i++) {
			System.out.println("제목: ");
			String title = sc.nextLine();
			System.out.println("저자: ");
			String author = sc.nextLine();
			System.out.println("가격: ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.println("출판사: ");
			String publisher = sc.nextLine();
			
			arr[i] = new Book(title, author, price, publisher);
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].information());
		}
		
		//사용자에게 검색 할 도서 제목을 입력받아 각 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을 알려주는 메서드
		
		System.out.println("검색할 책 제목: ");
		String searchTitle = sc.nextLine();
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].getTitle.equals(searchTitle)) {
				System.out.println(arr[i].getPrice());
			}
		}
	}

}
