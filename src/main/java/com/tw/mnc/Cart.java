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

        updateTotalPrice();
        updatePromotionPrice();
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }

    public double getTotalPromotionPrice(){
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
        printSubtotal();
        printPrice();
    }

    public void printSubtotal(){
        System.out.println("购物明细（数量 单价 小计）");
        for(GoodItem item:goodItemList){
            System.out.println(item.good.getName()+"   "+ item.getNum()+"   "+item.good.getPrice()+"   "+item.getItemPrice());
        }
    }


    public void printPrice(){
        System.out.println("总计金额（优惠前  优惠后  优惠差价）");
        System.out.println((getTotalPromotionPrice())
                +"   "+getTotalPrice()+"   "
                +getTotalPromotionPrice()+"    "+
                (getTotalPrice()-getTotalPromotionPrice()));
    }

}
