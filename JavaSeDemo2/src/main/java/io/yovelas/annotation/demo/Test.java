package io.yovelas.annotation.demo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setUsername("aabc");
        user.setPassword("abc");

        query(user);

    }

    private static void query(User user) {
        Class<User> userClass = User.class;
        Table declaredAnnotation = userClass.getDeclaredAnnotation(Table.class);
        String value = declaredAnnotation.value();

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("select * from ");
        stringBuffer.append(value);
        stringBuffer.append(" where 1=1");

        Field[] fields = userClass.getDeclaredFields();
        user.getUsername();
        for (Field field : fields) {
            System.out.println(field.getName());

            try {
                System.out.println(user.getClass().getFields().length);
            } catch (Exception e) {
                e.printStackTrace();
            }

            Annotation column = field.getAnnotation(Column.class);
            System.out.println(column);
}

        System.out.println(stringBuffer);



    }
}
