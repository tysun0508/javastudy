package com.hb.am;
class TV 
{
	private int vol = 0 ;

	// setter
	public void setVol(int a){
		vol = a ;
	}
	
	// getter
	public int getVol(){
		return vol ;
	}

	// up (5 �̻��� �ȿö�)
	public void volUp(){
		vol++ ;
		if(vol==6) vol = 5 ;
	}

	// down ( 0 ���ϴ� ���ϴ� �ȳ�����)
	public void volDown(){
		vol-- ;
		if(vol==-1) vol = 0 ;
	}

}
