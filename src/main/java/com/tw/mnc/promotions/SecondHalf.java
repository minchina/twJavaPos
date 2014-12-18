package com.tw.mnc.promotions;

import sun.applet.Main;

/**
 * Created by minchina on 14-12-17.
 */
public class SecondHalf extends promition {
    private int num;

    public SecondHalf(int num){
        this.num = num;
    }

    public double getPromotionPrice(double price){

        return price*num-Math.floor(num / 2)*(price/2);
    }
}
