import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyFile {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Copy file from %s to %s? (y/n) : ", args[0], args[1]);
        String action = sc.next();
        switch (action){
            case "y":
                System.out.println("y");
                CopyFile(args[0],args[1]);
                break;
            case "n":
                System.out.println("Exit!!!");
                System.exit(0);
                break;
        }
    }

    public static boolean CopyFile(String inputfile1,String outputfile1) throws Exception {
        File inputfile = new File(inputfile1);
        File outputfile = new File(outputfile1);

        if (!inputfile.exists() | !inputfile.isFile() ) {
            System.out.println("文件不存在");
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
