package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PhoneApp {

	public static void main(String[] args) throws IOException{
		
		InputStream is = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(is, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		while(true) {
			String str = br.readLine();
			if(str==null) {
				break;
			}
			String[] info = str.split(",");
			String name = info[0];
			String hp = info[1];
			String company = info[2];
						
			System.out.println("이름 : "+name);
			System.out.println("핸드폰 : "+hp);
			System.out.println("회사 : "+company);

		}
		
		br.close();
		
		


	}

}
