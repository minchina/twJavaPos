package com.tw.mnc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minchina on 14-12-17.
 */
public class Cart {

    private List<GoodItem> goodItemList = new ArrayList<>();
    private float totalPrice;

    public void add(int num,Good good){
        GoodItem goodItem = new GoodItem(num,good);
        goodItemList.add(goodItem);
        updateTotalPrice();
    }

    public float getTotalPrice(){
        return this.totalPrice;
    }

    public void updateTotalPrice(){
        float totalPrice = 0;
        for (GoodItem goodItem : goodItemList) {
            totalPrice += goodItem.getItemPrice();
        }
        this.totalPrice = totalPrice;
    }

    public void printTicket(){
        printTitle();
        printSubtotal();
        printPriceTitle();
        printPrice();
    }

    public void printTitle(){
        System.out.println("购物明细（数量 单价 小计）");

    }

    public void printSubtotal(){
        for(GoodItem item:goodItemList){
            System.out.println(item.good.getName()+"   "+ item.getNum()+"   "+item.good.getPrice()+"   "+item.getItemPrice());
        }
    }

    public void printPriceTitle(){
        System.out.println("总计金额（优惠前  优惠后  优惠差价）");
    }

    public void printPrice(){
        System.out.println(totalPrice);
    }
}
