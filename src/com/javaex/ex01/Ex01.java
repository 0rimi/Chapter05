package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {
	
	public static void main(String[] args) throws IOException{
		//try catch 오류는 걍 던짐...
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteimg.jpg");
		
		byte[] buffer = new byte[1024];
		//1024byte짜리 쟁반.. 
		
		System.out.println("복사시작");
		while(true) {
			int data = in.read(buffer);
			if(data == -1) {
				System.out.println("복사완료" + data);
				break;
			}
			out.write(buffer);
		}
		
		in.close();
		out.close();
		
		
		/*작은 쟁반..
		System.out.println("복사시작~");
		while(true) {
			int data = in.read();
			if(data == -1) {
				System.out.println("복사끝!" + data);
				break;
			}
			out.write(data);
		}
		*/	
		
		
	}

}
