package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException, IOException {
        // write your code here
        System.out.println("adf");

        Class clazz = Class.forName("com.company.Student");
        System.out.println(clazz.getConstructor(int.class,java.lang.String.class).newInstance(1,"fa"));


        System.out.println(clazz.getFields());

        Field id = clazz.getDeclaredField("id");


        Student student = (Student) clazz.newInstance();
        id.setAccessible(true);
        id.set(student,3);


        System.out.println(clazz.getMethod("show").invoke(student));

        System.out.println(student);

        Properties properties = new Properties();
        properties.load(Main.class.getResourceAsStream("pro.propertype"));
        System.out.println(properties.get("Class"));

        Class aClass = Class.forName((String)properties.get("Class"));
        System.out.println(aClass.newInstance());

        Method show = aClass.getMethod("show");
        System.out.println(show);

    }
}
