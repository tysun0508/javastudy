package com.hb.bm;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		/*
		Rect r = new Rect();
		Circle c = new Circle();
		
		System.out.print("1.�� 2.�簢�� >>");
		int res = scan.nextInt() ;
		
		switch (res) {
		case 1: c.draw(); break;

		case 2: r.draw(); break;
		}*/
		
		//���� ���ε�(����ڵ�)
		Shape shape = null ;
		System.out.print("1.�� 2.�簢�� >>");
		int res = scan.nextInt() ;
		
		switch (res) {
		case 1: shape = new Circle(); break;

		case 2: shape = new Rect(); break;
		}
		shape.draw();
		
		shape.move(100, 200); 
		
	}
	
}
