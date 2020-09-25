package io.yovelas.io.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("E:\\aa.txt");
//		String str = "you are the number one";
		ArrayList<String> list = new ArrayList();
		for(;true;) {
			
			String str = new Scanner(System.in).nextLine();
			
			
			if(str.equals("886")) {
				break;
			}
			list.add(str+"\r\n");
		}
		for(String s : list) {
			fos.write(s.getBytes());
		}
//		list.get(index)
//		byte[] b = str.getBytes();
//		fos.write(b);


	}
}
	