package com.javaex.ex03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		/*
		bw.write("내 영원이 돼줘");
		bw.newLine();
		bw.write("내 이름 불러줘");
		bw.newLine();
		bw.write("Run Away, Run Away, Run Away with me");
		bw.newLine();
		bw.write("세상의 끝에서");
		bw.newLine();
		bw.write("Forever together");
		bw.newLine();
		bw.write("Run Away, baby 내게 대답해줘.");
		*/
		
		bw.close();
	}

}
