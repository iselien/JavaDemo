package io.yovelas.io.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {
	
	public static void main(String[] args) {
		File file = new File("E:\\xmind-8-update8-windows.zip");
		for(;true;) {
			readFile(file);
		}
		
//		writeFile(file);
	}
	
	public static void readFile(File file) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			BufferedInputStream sis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\abc.txt",true));
			byte[] b = new byte[10240];
			int length = -1;
			while((length=sis.read(b)) != -1) {
				bos.write(b,0,length);
			}
			System.out.println("ccccc");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis != null)
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void writeFile(File file) {
		try {
			FileOutputStream fos = new FileOutputStream(file,true);
			fos.write(new String("I will out your File ").getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

