package com.tw.mnc.promotions;

/**
 * Created by minchina on 14-12-18.
 */
public class Discount extends promition {
    public double rate;

    public Discount(int rate){
        this.rate = rate;
    }

    public Double getPromotionPrice(Double price){
        System.out.println(price * (rate/100));
        return price * (rate/100);
    }
}
