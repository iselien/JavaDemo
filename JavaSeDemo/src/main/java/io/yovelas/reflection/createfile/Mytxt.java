package io.yovelas.reflection.createfile;

import java.io.File;
import java.io.IOException;

public class Mytxt {
    public static void myCreate() throws IOException {
        System.out.println("exection");

        File file = new File("E:\\myhello.txt");
//        System.out.println(file.mkdir());
        System.out.println(file.createNewFile());
        System.out.println(file.canExecute());

    }

    public static void main(String[] args) throws IOException {
        myCreate();
    }
}
