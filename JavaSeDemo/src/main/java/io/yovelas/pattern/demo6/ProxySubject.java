package io.yovelas.pattern.demo6;

public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void visit() {
        System.out.println("log:run visit method before");
        subject.visit();
        System.out.println("log:run visit method after");
    }
}
