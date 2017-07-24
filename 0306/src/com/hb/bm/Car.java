package com.hb.bm;

import java.util.*;

// �������� ����, �Һ�
// ���� list�� ����Ǿ��ٰ� �Ǹŵȴ�.
public class Car {
	private List<String> carList = null ;
	public Car(){
		carList = new ArrayList<>();
	}
	
	public String getCar(){
		String carName = null ;
		switch ((int)(Math.random()*3)){
		case 0 : carName = "Ferrari"; break;
		case 1 : carName = "Lamborghini"; break;
		case 2 : carName = "Bugatti"; break;
		}
		return carName;
	}
	
	// ����� �� ����Ʈ�� ����
	public synchronized void push(String car){
		carList.add(car);
		System.out.println("���� ����������ϴ�: " + car);
		if(carList.size()==5){
			notify();
		}
	}
	
	// �Һ�
	public synchronized void pop(){
		String carName = null;
		if(carList.size()==0){
			System.out.println("���� �����ϴ�. ����ϼ���");
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}else{
			carName = carList.remove(carList.size()-1);
			System.out.println("������ �� : " + carName);
		}
	}
}






























