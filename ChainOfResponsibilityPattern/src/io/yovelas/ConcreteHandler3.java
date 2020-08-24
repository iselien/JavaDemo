package io.yovelas;

public class ConcreteHandler3 extends Handler {

    @Override
    public void handlerRequest(int request) {
        if(request >= 20 && request < 30){
            System.out.println("处理请求,onConcreteHandler3:" + request);
        }else if(handler != null){
            handler.handlerRequest(request);
        }
    }
}
