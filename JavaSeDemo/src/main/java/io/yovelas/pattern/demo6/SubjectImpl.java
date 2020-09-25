package io.yovelas.pattern.demo6;

public class SubjectImpl implements Subject {
    @Override
    public void visit() {
        System.out.println("SubjectImpl.visit");
    }
}
