package io.yovelas;

public class ConcreteHandler2 extends Handler {

    @Override
    public void handlerRequest(int request) {
        if(request >= 10 && request < 20){
            System.out.println("处理请求,onConcreteHandler2:" + request);
        }else if(handler != null){
            handler.handlerRequest(request);
        }
    }
}
