package io.yovelas.pattern.demo6;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
//        new ProxySubject(new SubjectImpl()).visit();
        SubjectImpl subject = new SubjectImpl();
        Subject o = (Subject)Proxy.newProxyInstance(subject.getClass().getClassLoader(), new Class[]{Subject.class}, new DynamicProxy(subject));
        o.visit();
    }
}
