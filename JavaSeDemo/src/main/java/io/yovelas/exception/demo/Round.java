package io.yovelas.exception.demo;

/**
 * @Classname Round
 * @Description TODO
 * @Date 2020/9/24 14:24
 * @Created by dykew
 */

public class Round implements Area{

    /* 半径 */
    private int r;

    public Round(int r) {
        this.r = r;
    }

    @Override
    public void area() {
        if(r <= 0){
            throw new AreaException("数值错误");
        }
        System.out.printf("圆形：半径%d，面积%f\n", r, Math.PI * r *r);
    }
}
