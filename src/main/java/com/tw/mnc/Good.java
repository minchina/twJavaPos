package com.tw.mnc;

import com.tw.mnc.promotions.Promotion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minchina on 14-12-17.
 */
public class Good{
    public String barcode;
    private double price;
    private String name;
    public List<Promotion> promotionList = new ArrayList<>();


    public Good(String barcode,double price){
//        super("noType");
        this.barcode = barcode;
        this.price = price;
        this.name = barcode.substring(0,4)+barcode.substring(barcode.length()-1);
    }

    public void addPromotion(Promotion promotion){
        promotionList.add(promotion);
    }

    public double getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }
}
