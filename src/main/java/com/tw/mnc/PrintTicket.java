package com.tw.mnc;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by minchina on 14-12-18.
 */
public class PrintTicket {
    public PrintStream out = System.out;

    Cart cart;


    public PrintTicket(Cart cart){
        this.cart = cart;

    }

    public void printInformation(){
        printSubtotal(out);
        printPrice(out);
    }

    public void printSubtotal(PrintStream out){
        out.println("购物明细（数量 单价 小计）");
        for(GoodItem item:cart.goodItemList){
            out.println(item.good.getName()+"   "+ item.getNum()+"   "+(int)item.good.getPrice()+"   "+(int)item.getItemPromotionPrice());
        }
    }


    public void printPrice(PrintStream out){
        out.println("总计金额（优惠前  优惠后  优惠差价）");
        out.println(((int)cart.getTotalPromotionPrice())
                +"   "+(int)cart.getTotalPrice()+"   "
                +(int)cart.getTotalPromotionPrice()+"    "+
                (int)(cart.getTotalPrice()-cart.getTotalPromotionPrice()));
    }
}
