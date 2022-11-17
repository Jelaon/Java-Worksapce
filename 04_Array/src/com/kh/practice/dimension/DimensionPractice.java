package com.kh.practice.dimension;

public class DimensionPractice {
	public void practice1() {
		String a [][] = new String[3][3];
		for(int i =0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.printf("(%d, %d)", i, j);
			}System.out.println();
		}
		
	}
	public void practice2() {
		int a [][] = new int[4][4];
		int b = 0;
		for(int i =0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = ++b;
				System.out.printf("%3d",a[i][j]);
				
			}System.out.println();
		
		}
	}
	public void practice3() {
		int a [][] = new int[4][4];
		int b = a.length*a[0].length;
		for(int i =0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				a[i][j] = b--;
				System.out.printf("%3d",a[i][j]);
				
			}System.out.println();
		
		}
	}
	public void practice4() {
		//int a [][] = new int[4][4];
		//for(int i =0; i < a.length; i++) {
		//	for(int j = 0; j < a[i].length; j++) {
				
		//	}
	//}
}}