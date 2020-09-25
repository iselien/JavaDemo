package io.yovelas.io.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteFull{
	public static void main(String[] args) throws Exception {
		for(;true;){
			System.out.println(CopyFile("E:\\aa.txt","E:\\aa.zip"));
		}
		
	}
	public static boolean CopyFile(String inputfile1,String outputfile1) throws Exception {
		File inputfile = new File(inputfile1);
		File outputfile = new File(outputfile1);

		FileInputStream fis = new FileInputStream(inputfile);
		FileOutputStream fos = new FileOutputStream(outputfile,true);
		int length;
		byte[] b = new byte[10240000];
		while((length=fis.read(b)) != -1) {
			fos.write(b,0,length);
		}
		return true;
	}
}