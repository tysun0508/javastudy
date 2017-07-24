package com.hb.am;

import java.io.Serializable;

import org.omg.CORBA.TRANSIENT;

// �ϳ��� ��ü�� ������ ������ �ִ� Ŭ����
// ��ü����ȭ�� �ϱ� ���ؼ� Serializable �������̽��� ��� ����
// ��� ��������� ��ü ����ȭ ����� �ȴ�.
public class Ex01_vo implements Serializable{
	private String name;
	private int age;
	private String addr;
	private boolean gender;
	
	public Ex01_vo() {}
	
	public Ex01_vo(String name, int age, String addr, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	
}
