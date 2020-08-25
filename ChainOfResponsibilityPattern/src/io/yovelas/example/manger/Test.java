package io.yovelas.example.manger;

import io.yovelas.example.manger.entity.Request;

public class Test {

    public static void main(String[] args) {
        System.out.println("hhhh");

        CommonManager cm = new CommonManager("经理");
        MajordomoManager md = new MajordomoManager("总监");
        GeneralManager gm = new GeneralManager("总经理");


        cm.setManage(md);
        md.setManage(gm);
        Request request = new Request();
        request.setNumber(922);
        request.setRequestType("加薪");
        request.setRequestContent("多给点呗");
        cm.requestManager(request);
    }
}
