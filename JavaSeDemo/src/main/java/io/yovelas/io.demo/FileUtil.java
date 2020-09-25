package io.yovelas.io.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {


    /**
     * ����һ���ļ�·���ַ��������ļ�����ת��Ϊ�ַ���
     *
     * @param filePath
     * @return
     */
    public String readFileToString(String filePath) {

        FileReader fr = null;
        try {
            fr = new FileReader(new File(filePath));
            char[] cbuf = new char[1024];
            int len;
            String str = "";
            while ((len = fr.read(cbuf)) != -1) {
                str = new String(cbuf, 0, len);
            }
            return str;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {

            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return null;
    }

    /**
     * ���뽫��������ԭ�ļ�·���ַ����ͱ���������·���ַ����������ɹ�����true��ʧ��false
     *
     * @param InputFile
     * @param OutputFile
     * @return
     */
    public static boolean copyFile(String InputFile, String OutputFile) {
        File inputfile = new File(InputFile);
        File outputfile = new File(OutputFile);
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {

            fis = new FileInputStream(inputfile);
            fos = new FileOutputStream(outputfile);

            if (inputfile.exists() && inputfile.isFile()) {
                System.out.println("�ļ����ڣ�����Ŀ¼");
            } else {
                System.out.println("�ļ������ڣ��˳�");
                return false;
            }

            byte[] arr = new byte[1024];
            while ((fis.read(arr)) != -1) {
                fos.write(arr);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (fos != null)
                    fos.close();
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        return true;
    }

    /**
     *  find all file
     * @param file
     */
    public void findFile(File file) {
        findFile(file, 0);
    }

    public void findFile(File file, int index) {
        for (int i = 0; i < index; i++) {
            System.out.print("--");
        }
        if (!file.exists())
            return;
        System.out.print(file.getName() + "\n");

        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                findFile(f, index + 1);
            }
        }

    }

    /**
     *  delete all file
     * @param file
     * @return
     */
    public boolean delAndMkFile(File file) {
        if (delFile(file)) {
            file.mkdirs();
            return true;
        }
        return false;
    }

    private boolean delFile(File file) {
        for (; file.listFiles() != null;) {
            privateDelFile(file);
        }
        return true;
    }

    private void privateDelFile(File file) {
        if (!file.exists())
            return;
        if (file.delete())
            System.err.println(file + "���ɹ�ɾ��");
        else {
            for (File f : file.listFiles()) {
                privateDelFile(f);
            }
        }
    }

    public static void main(String[] args) {
        FileUtil input = new FileUtil();
//		System.out.println(input.readFileToString("C:\\Users\\y\\Desktop\\Demo1.java"));
//		System.out.println(copyFile("E:\\aa.txt", "E:\\aaa.txt") ? "�����ɹ�" : "����ʧ��");
//		input.delAndMkFile(new File("E:\\aa"));
//		input.findFile(new File("E:\\aa"));
    }


}
