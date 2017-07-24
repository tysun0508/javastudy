package com.hb.am;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ex03 {
	public static void main(String[] args) {
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			URL myurl = new URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");			
			
			URLConnection conn = myurl.openConnection();
			
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
			
			String msg = null;
			while((msg=br.readLine()) != null){
				System.out.println(msg);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
