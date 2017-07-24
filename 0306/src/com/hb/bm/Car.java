package com.hb.bm;

import java.util.*;

// 차에대한 생산, 소비
// 차는 list에 저장되었다가 판매된다.
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
	
	// 생산된 차 리스트에 저장
	public synchronized void push(String car){
		carList.add(car);
		System.out.println("차가 만들어졌습니다: " + car);
		if(carList.size()==5){
			notify();
		}
	}
	
	// 소비
	public synchronized void pop(){
		String carName = null;
		if(carList.size()==0){
			System.out.println("차가 없습니다. 대기하세요");
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}else{
			carName = carList.remove(carList.size()-1);
			System.out.println("구입한 차 : " + carName);
		}
	}
}






























