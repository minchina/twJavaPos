package com.tw.mnc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minchina on 14-12-17.
 */
public class Cart {
    private List<GoodItem> goodItemList = new ArrayList<>();
    private float totalPrice;
    public void add(GoodItem goodItem){
        goodItemList.add(goodItem);
    }

    public int numOf(GoodItem goodItem){
        return goodItem.getNum();
    }

    public float getTotalPrice(){
        float totalPrice = 0;
        for (GoodItem goodItem : goodItemList) {
            totalPrice += goodItem.getItemPrice();
        }
        this.totalPrice = totalPrice;
        return this.totalPrice;
    }
}
