package io.yovelas.io.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(CopyFile(sc.next(),sc.next()));
    }
    public static boolean CopyFile(String inputfile1,String outputfile1) throws Exception {
        File inputfile = new File(inputfile1);
        File outputfile = new File(outputfile1);

        if (inputfile.exists() && inputfile.isFile() ) {
            System.out.println("�ļ����ڣ�����Ŀ¼");
        }else {
            System.out.println("�ļ������ڣ��˳�");
            return false;
        }

        FileInputStream fis = new FileInputStream(inputfile);
        FileOutputStream fos = new FileOutputStream(outputfile);
        int readchar;
        while((readchar=fis.read()) != -1) {
            fos.write(readchar);
        }
        return true;
    }
}
