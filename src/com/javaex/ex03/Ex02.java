package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException{

		Reader fr = new FileReader("C:\\javaStudy\\file\\song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) { //문자열이니까 데이터형태는 주소
			String data = br.readLine();
			if(data==null) {
				break;
			}
			System.out.println(data);
		}
		
		
		br.close();
		
	}

}
