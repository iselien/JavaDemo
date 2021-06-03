package io.yovelas.example.manger;

import io.yovelas.example.manger.entity.Request;

public class GeneralManager extends Manager{

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    void requestManager(Request request) {
        if(request.getRequestType().equals("请假")){
            System.out.println(name + ":" + request);
        }else if(request.getRequestType().equals("加薪") && request.getNumber() <= 500){
            System.out.println(name + ":" + request);
        }else if(request.getRequestType().equals("加薪") && request.getNumber() > 500){
            System.out.println(name + ":" + request + "再说吧");
        }else if(manage != null){
            manage.requestManager(request);
        }
    }

}
