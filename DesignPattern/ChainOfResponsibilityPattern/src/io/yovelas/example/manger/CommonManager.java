package io.yovelas.example.manger;

import io.yovelas.example.manger.entity.Request;

/**
 * 普通管理者
 */
public class CommonManager extends Manager{

    public CommonManager(String name) {
        super(name);
    }

    @Override
    void requestManager(Request request) {
        if(request.getRequestType().equals("请假") && request.getNumber() <= 2){
            System.out.println(name + ":" + request);
        }else if(manage != null){
            manage.requestManager(request);
        }
    }
}
