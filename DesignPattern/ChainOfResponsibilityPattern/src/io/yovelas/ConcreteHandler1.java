package io.yovelas;

public class ConcreteHandler1 extends Handler {

    @Override
    public void handlerRequest(int request) {
        if(request >= 0 && request < 10){
            System.out.println("处理请求,onConcreteHandler1:" + request);
        }else if(handler != null){
            handler.handlerRequest(request);
        }
    }
}
