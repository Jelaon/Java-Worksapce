package com.kh;

public class CastingPractice3 {
	public void method() {
		int a = 10;
		int b = 4;
		float c = 3.0f;
		double d = 2.5;
		char ch = 'A';
		System.out.println( a-b-b); // 2
		System.out.println((int) d ); // 2
		System.out.println( ); // 10.0
		System.out.println((float)a ); // 10.0
		System.out.println((float)a/b); // 2.5
		System.out.println((float)d ); // 2.5
		System.out.println( c); // 3
		System.out.println(a/c ); // 3
		System.out.println( a/c );// 3.3333333
		System.out.println((float)a/c ); // 3.3333333333333335
		System.out.println( ch ); // 'A'
		System.out.println( (int) ch ); // 65
		System.out.println( ch + a ); // 75
		System.out.println( (char)ch + a ); // 'K'
}}
	