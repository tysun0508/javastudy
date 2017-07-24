package com.hb.fm;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

// °´Ã¼ Á÷·ÄÈ­
public class TestMemberVO implements Serializable{
	private int idx;
	private String id, password, phone;
	
	public TestMemberVO() {}
	public TestMemberVO(int idx, String id, String password, String phone) {
	super();
	this.idx = idx;
	this.id = id;
	this.password = password;
	this.phone = phone;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
