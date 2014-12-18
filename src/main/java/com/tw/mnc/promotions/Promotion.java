package com.tw.mnc.promotions;

/**
 * Created by minchina on 14-12-17.
 */
abstract public class Promotion {
    public String type="noType";


    public Promotion(String type){
        this.type = type;
    }

    abstract public double getPromotionPrice(int num,double price);
}
