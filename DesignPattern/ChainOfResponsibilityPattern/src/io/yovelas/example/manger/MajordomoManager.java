package io.yovelas.example.manger;

import io.yovelas.example.manger.entity.Request;

public class MajordomoManager extends Manager{

    public MajordomoManager(String name) {
        super(name);
    }

    @Override
    void requestManager(Request request) {
        if(request.getRequestType().equals("请假") && request.getNumber() <= 5){
            System.out.println(name + ":" + request);
        }else if(manage != null){
            manage.requestManager(request);
        }
    }

}
