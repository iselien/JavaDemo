package io.yovelas.io.demo;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;

public class Demo {
	public static void main(String[] args) throws IOException {
//		File file = new File("E:\\aa\\bb");
//		System.out.println(file.mkdirs());
//		file.isFile();
//		
//		System.out.println(file.exists() ? (file.isFile() ? "锟侥硷拷" : file.isDirectory() ? "目录" : "null") :  "锟斤拷" );
//		
//		if(file.exists()) {
//			if(file.isDirectory()) {
//				File f_file = file.getAbsoluteFile();
//				File z_file = new File(f_file,"aa.txt");
//				System.out.println(z_file.createNewFile());
//			}else {
//				System.out.println("锟斤拷锟角革拷锟侥硷拷");
//			}
//		}
//		
//		File file2 = new File(file,"bb.txt");
//		file2.createNewFile();
//		System.out.println(file2.length());
//		System.out.println(file2.lastModified());

		
		File file = new File("E:\\aa\\bb\\aa.txt");
		System.out.println(file.length());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.exists());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.getParent());

		
		
		File file2 = new File("E:\\aa");
		File[] file1 = File.listRoots();
		for(Object o : file2.list()) {
			System.out.println(o);
		}
		
		System.out.println("-----------------");
		
		for(String s : file2.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith(".md");
			}
		})) {
			System.out.println(s);
		}
		de(file2);
				
	}
	
	public static void de(File file) {
		
		if(file.delete()) {
			
		}
	}
	
}
