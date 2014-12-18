package com.tw.mnc.promotions;

/**
 * Created by minchina on 14-12-17.
 */
public class SecondHalf extends Promotion {

    public SecondHalf(){
        super("second_half");
    }

    public double getPromotionPrice(int num,double price){
        return price-Math.floor(num/2)*(price/num/2);
    }
}
