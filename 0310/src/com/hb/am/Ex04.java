package com.hb.am;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ex04 {
	public static void main(String[] args) {
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			URL myurl = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			
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
