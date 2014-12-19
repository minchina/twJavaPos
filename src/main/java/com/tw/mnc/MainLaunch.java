package com.tw.mnc;

import com.tw.mnc.promotions.Discount;
import com.tw.mnc.promotions.SecondHalf;
import com.tw.mnc.utility.Parser;


public class MainLaunch {
    public static void main(String[] args){
        Good apple = new Good("ITEM000001",40);
        Good strawberry = new Good("ITEM000003",50);
        Good pear = new Good("ITEM000005",60);

        Cart cart = new Cart();

        apple.addPromotion(new SecondHalf());
        strawberry.addPromotion(new SecondHalf());

        apple.addPromotion(new Discount(75));
        pear.addPromotion(new Discount(90));


        cart.add(5,apple);
        cart.add(2,strawberry);
        cart.add(4,pear);

        cart.printTicket();

    }
}