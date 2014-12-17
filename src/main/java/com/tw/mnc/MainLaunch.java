package com.tw.mnc;

import com.tw.mnc.utility.Parser;

/**
 * Created by minchina on 14-12-17.
 */
public class MainLaunch {
    public static void main(String[] args){
        Good apple = new Good("ITEM000001",40);
        Good strawberry = new Good("ITEM000003",50);

        Cart cart = new Cart();

        cart.add(new GoodItem(9,apple));
        cart.add(new GoodItem(2,strawberry));

        System.out.println(cart.getTotalPrice());

    }
}
