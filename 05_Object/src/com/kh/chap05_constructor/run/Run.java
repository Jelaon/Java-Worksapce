package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User user1 = new User();
		//Scanner sc = new Scanner(System.in);
		User user2 = new User("syj","123123","장서영");
		
		System.out.println(user2.information());
	}

}
