package com.hb.bm;

public abstract class Shape {
	private int x, y ;
	
	public void move(int x, int y){
		this.x = x ;
		this.y = y ;
		System.out.println(x + "��, " + y + "�� �̵�");
	}
	
	public abstract void draw() ;

}
