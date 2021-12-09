package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		//문자를 읽을때 utf-8로 읽어서 깨지는것을 방지
		//int형식으로 먼저 읽음>inputreader로 한번더 읽고>버퍼로 로드.
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(in, "MS949");
		//MS949로 읽으세요!
		BufferedReader br = new BufferedReader(isr);
		
		while(true) {
			String str = br.readLine();
			if(str==null) {
				break;
			}
			System.out.println(str);
		}
		
		br.close();
		
	}

}
