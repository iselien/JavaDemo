package io.yovelas.io.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileReaderDome {
	public static void main(String[] args) throws IOException {

			FileReader fr = new FileReader(new File("E://aa.txt"));
			FileWriter fw = new FileWriter(new File("E://1.txt"));
			PrintWriter pw = new PrintWriter(new File("E://2.txt"));
			char[] b = new char[1024];
			int lenght= -1;
			while((lenght=fr.read(b)) != -1) {
				fw.write(b,0,lenght);
			}
			pw.write('a');
			pw.write('a');
			pw.write('a');
			pw.write('a');
			pw.write('a');
			pw.write('a');
			pw.write('a');
			pw.write('a');
			pw.write('a');
			pw.write('a');
			pw.write('a');
			pw.write('a');
		
			pw.close();
			fr.close();
			fw.close();
	}
}
