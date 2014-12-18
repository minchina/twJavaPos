package com.tw.mnc;

import java.util.List;

/**
 * Created by minchina on 14-12-18.
 */
public class PrintTicket {
    private List<GoodItem> goodItemList;
    Cart cart;


    public PrintTicket(List<GoodItem> goodItems,Cart cart){
        this.goodItemList=goodItems;
        this.cart = cart;

    }

    public void printInformation(){
        printSubtotal();
        printPrice();
    }

    public void printSubtotal(){
        System.out.println("购物明细（数量 单价 小计）");
        for(GoodItem item:goodItemList){
            System.out.println(item.good.getName()+"   "+ item.getNum()+"   "+item.good.getPrice()+"   "+item.promotionPrice);
        }
    }


    public void printPrice(){
        System.out.println("总计金额（优惠前  优惠后  优惠差价）");
        System.out.println((cart.getTotalPromotionPrice())
                +"   "+cart.getTotalPrice()+"   "
                +cart.getTotalPromotionPrice()+"    "+
                (cart.getTotalPrice()-cart.getTotalPromotionPrice()));
    }
}
