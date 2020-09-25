package io.yovelas.pattern.demo4;

public class WindowsFactory implements AbstractFactory{

    public Button createButton(){
       return new WindowsButton();
    }
    public Text createText(){
       return new WindowsText();
    }

}
