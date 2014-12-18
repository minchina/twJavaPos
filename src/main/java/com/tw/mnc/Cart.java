package com.tw.mnc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minchina on 14-12-17.
 */
public class Cart {

    private List<GoodItem> goodItemList = new ArrayList<>();
    private double totalPrice;
    private double totalPromotionPrice;

    public void add(int num,Good good){

        GoodItem goodItem = new GoodItem(num,good);
        goodItemList.add(goodItem);
        goodItem.updateItemPromotionPrice();
    }

    public double getTotalPrice(){
        updateTotalPrice();
        return this.totalPrice;
    }

    public double getTotalPromotionPrice(){
        updatePromotionPrice();
        return this.totalPromotionPrice;
    }

    public void updateTotalPrice(){
        double totalPrice = 0;
        for (GoodItem goodItem : goodItemList) {
            totalPrice += goodItem.getItemPrice();
        }
        this.totalPrice = totalPrice;
    }

    public void updatePromotionPrice(){
        double promotionPrice = 0;
        for (GoodItem goodItem : goodItemList){
            promotionPrice += goodItem.getItemPromotionPrice();
        }
        this.totalPromotionPrice = promotionPrice;

    }

//以下为打印bill
    public void printTicket(){
        new PrintTicket(goodItemList,this).printInformation();

    }
}
