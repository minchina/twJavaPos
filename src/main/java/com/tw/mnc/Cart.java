package com.tw.mnc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minchina on 14-12-17.
 */
public class Cart {
    private List<GoodItem> goodItemList = new ArrayList<>();

    public void add(GoodItem goodItem){
        goodItemList.add(goodItem);
    }

    public int numOf(GoodItem goodItem){
        return goodItem.getNum();
    }
}
