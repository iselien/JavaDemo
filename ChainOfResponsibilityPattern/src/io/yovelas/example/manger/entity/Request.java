package io.yovelas.example.manger.entity;

public class Request {

    private String requestType;
    private String requestContent;
    private int number;

    public Request() {
    }

    public Request(String requestType, String requestContent, int number) {
        this.requestType = requestType;
        this.requestContent = requestContent;
        this.number = number;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestType='" + requestType + '\'' +
                ", requestContent='" + requestContent + '\'' +
                ", number=" + number +
                '}';
    }
}
