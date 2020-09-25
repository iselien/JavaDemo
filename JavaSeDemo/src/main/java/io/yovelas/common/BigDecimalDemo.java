package io.yovelas.common;

/**
 * @Classname BigDecimalDemo
 * @Description TODO
 * @Date 2020/9/25 16:40
 * @Created by dykew
 */

public class BigDecimalDemo {

    public static void main(String[] args) {
        /**
         * 由于在运算的时候，float类型和double很容易丢失精度，所以，为了能精确的表示，计算浮点数，Java提供了BigDecimal不可变的，任意精度的有符号十进制数
         */

        // BigDecimal(String val)

        // add(BigDecimal augend) 加
        // subtract(BigDecimal subtrahend) 减
        // multiply(BigDecimal multiplicand) 乘
        // divide(BigDecimal divisor) 除法(当除不尽时，此方法会抛出异常)
        // divide(BigDecimal divisor, int scale, int roundingMode) 除法(指定精度，指定舍入模式)
    }
}
