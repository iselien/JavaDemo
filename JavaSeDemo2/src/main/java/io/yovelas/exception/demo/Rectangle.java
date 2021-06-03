package io.yovelas.exception.demo;

public class Rectangle implements Area{
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void area() {
        if(x <= 0 || y <= 0){
            throw new AreaException("数值错误");
        }
        System.out.printf("长方形：长%c，宽%c，面积%c\n", x, y, x*y);
    }
}
