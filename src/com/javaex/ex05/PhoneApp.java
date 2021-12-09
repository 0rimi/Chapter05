package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException{
		
		InputStream is = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(is, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		
		
		List<Person> fList = new ArrayList<Person>();
		
		while(true) {
			String str = br.readLine();
			if(str==null) {
				break;
			}
			String[] info = str.split(",");
			String name = info[0];
			String hp = info[1];
			String company = info[2];
						
			Person f = new Person(name,hp,company);
			fList.add(f);
						
		}
		

		br.close();
		
		//출력해보기
		for( Person f : fList ) {
			f.print();
		}
					

	}

}
