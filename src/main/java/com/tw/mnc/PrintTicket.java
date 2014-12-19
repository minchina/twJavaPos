package com.tw.mnc;

import java.util.List;

/**
 * Created by minchina on 14-12-18.
 */
public class PrintTicket {
    Cart cart;


    public PrintTicket(Cart cart){
        this.cart = cart;

    }

    public void printInformation(){
        printSubtotal();
        printPrice();
    }

    public void printSubtotal(){
        System.out.println("购物明细（数量 单价 小计）");
        for(GoodItem item:cart.goodItemList){
            System.out.println(item.good.getName()+"   "+ item.getNum()+"   "+(int)item.good.getPrice()+"   "+(int)item.getItemPromotionPrice());
        }
    }


    public void printPrice(){
        System.out.println("总计金额（优惠前  优惠后  优惠差价）");
        System.out.println(((int)cart.getTotalPromotionPrice())
                +"   "+(int)cart.getTotalPrice()+"   "
                +(int)cart.getTotalPromotionPrice()+"    "+
                (int)(cart.getTotalPrice()-cart.getTotalPromotionPrice()));
    }
}
