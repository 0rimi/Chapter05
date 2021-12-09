package com.javaex.ex06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		
		
		//스캐너로 값 입력받기, 난 두개만 추가받을게..
		Scanner sc = new Scanner(System.in);
		System.out.println("사원을 더 입력해주세요.(종료:/q)");
		System.out.print(">>");
		
		while(true) {
			String typing = sc.nextLine();
			if(typing.equals("/q")){
				break;
			}			
			String[] finfo = typing.split(",");
			
			Person f = new Person(finfo[0],finfo[1],finfo[2]);
			fList.add(f);
		}
				
		sc.close();
		
		/*리스트에 추가할값
		최수빈,010-2000-1205,02-2019-0304
		최연준,010-1999-0913,02-2019-0304
		/q
		*/
	
		/*실험출력 1, 2
		for( Person f : fList ) {
			System.out.println(f.info());
		}
		for( Person f : fList) {
			f.print();
		}		
		*/
		
		//쓰기
		Writer wr = new FileWriter("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(wr);
		
		for(int i=0; i<fList.size(); i++) {
			bw.write(fList.get(i).info());
			bw.newLine();
		}
		
		System.out.println("파일이 작성되었습니다.");
	
		bw.close();
		
	

		
		

	}

}
