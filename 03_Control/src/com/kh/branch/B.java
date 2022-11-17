package com.kh.branch;

public class B {
	public void method3() {
		// 2단 ~ 9단까지 출력
		// 4의 배수단 빼고 출력(continue문 사용)
		
		for(int i=2; i<=9; i++) {
			if(i % 4 == 0) {
				continue;
			}
			for(int j=1; j<=9; j++) {
				System.out.printf("%d X %d = %d \n", i, j, (i*j));
				
			}
		}
	}

}
