package com.tw.mnc.promotions;

/**
 * Created by minchina on 14-12-17.
 */
public class SecondHalf extends Promotion {

    public SecondHalf(){
        super("second_half");
    }

    public double getPromotionPrice(int num, double subtotal){
        double secondHalfAmount = Math.floor(num / 2);
        return subtotal - secondHalfAmount * halfPrice(num, subtotal);
    }

    private double halfPrice(int num, double subtotal) {
        return (subtotal/num/2);
    }
}
