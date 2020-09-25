package io.yovelas.reflection.createfile;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

        Class clazz = Class.forName("com.company.createfile.Mytxt");
        System.out.println(clazz);
        Method myCreate = clazz.getMethod("myCreate");
        myCreate.invoke(clazz.newInstance());
    }
}
