package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	public void inputMenu() {
		// 삼각형과 사각형을 선택하게 하는 메서드
		System.out.println("==== 도형 프로그램 ====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int a = sc.nextInt();
		switch(a) {
		case 3 : 
			triangleMenu();
			break;
		case 4 : 
			squareMenu();
			break;
		case 9 : 
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			inputMenu();
		}
	}
	public void triangleMenu() {
		// 삼각형 메뉴 출력 메서드
		System.out.println("====삼각형====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int a =sc.nextInt();
		sc.nextLine();
		switch(a) {
		case 1: 
			
			System.out.print("높이 :");
			double height = sc.nextDouble();
			System.out.print("너비 :");
			double width = sc.nextDouble();
			System.out.println("삼각형 면적 : "+tc.calcArea(height, width));
			triangleMenu();
		case 2:
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.nextLine();
			tc.paintColor(color);
			System.out.println("색이 수정되었습니다.");
			triangleMenu();
		case 3:
			printInformation(3);
			triangleMenu();
		case 9: 
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
		}

	}
	public void squareMenu() {
		// 사각형 메뉴 출력 메서드
		System.out.println("====사각형====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int a =sc.nextInt();
		sc.nextLine();
//		switch(a) {
//		case 1: 

	}
	public void inputSize(int type, int menuNum) {
		//너비와 높이를 받아 요청사항을 처리하거나 색깔을 받아 요청사항을 처리하는 메소드
		if(menuNum ==2 && menuNum == 3) {
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.nextLine();
			tc.paintColor(color);
			System.out.println("색이 수정되었습니다.");
		}else {
			
			
		}
			

	}
	public void printInformation(int type) {
		//매개변수에 따라 삼각형/사각형의 정보를 출력하는 메소드
		if(type == 3) {
			System.out.println(tc.print());
		}else {
			System.out.println(scr.print());
		}

	}


}
