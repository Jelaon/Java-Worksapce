package A;

import java.util.Scanner;

public class F {
	public void count() {
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.print("숫자입력:");
		int a = sc.nextInt();
		if(a == 6) {
			break;
		}else { 
			System.out.println("브레이크아님");
		}
		
	}
	System.out.println("프로그램 종료");
}
}


