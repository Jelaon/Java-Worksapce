package com.kh.chap02_objecktArray.run;

import com.kh.chap02_objecktArray.model.vo.Phone;

public class ObjectArrayRun {
	public static void main(String[] args) {
		Phone[] arr = new Phone[3];
		
		arr[0] = new Phone();
		arr[0].setName("아이폰");
		arr[0].setSeries("12");
		arr[0].setBrand("애플");
		arr[0].setPrice(1000000);
		
		arr[1] = new Phone("아이폰","13","애플",150000000);
		
		arr[2] = new Phone("갤럭시","zplip4","삼성",135000000);
		
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].information());
			sum += arr[i].getPrice();
			
		}
		System.out.println(sum);
		System.out.println("평균가격"+sum/arr.length);
	}

}
