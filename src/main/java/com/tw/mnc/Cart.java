package com.tw.mnc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minchina on 14-12-17.
 */
public class Cart {

    public List<GoodItem> goodItemList = new ArrayList<>();

    public void add(int num,Good good){

        GoodItem goodItem = new GoodItem(num,good);
        goodItemList.add(goodItem);
        goodItem.updateItemPromotionPrice();
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (GoodItem goodItem : goodItemList) {
            totalPrice += goodItem.getItemPrice();
        }
        return totalPrice;
    }

    public double getTotalPromotionPrice(){
        double promotionPrice = 0;
        for (GoodItem goodItem : goodItemList){
            promotionPrice += goodItem.getItemPromotionPrice();
        }
        return promotionPrice;

    }
//以下为打印bill
    public void printTicket(){
        new PrintTicket(this).printInformation();

    }
}
