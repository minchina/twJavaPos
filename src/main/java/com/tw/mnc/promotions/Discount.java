package com.tw.mnc.promotions;

/**
 * Created by minchina on 14-12-18.
 */
public class Discount extends Promotion {
    public double rate;

    public Discount(int rate){
        super("discount");
        this.rate = rate;
    }

    public double getPromotionPrice(int num,double price){
        return price * (rate/100);
    }
}
