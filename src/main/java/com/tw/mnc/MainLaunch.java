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

        cart.add(1,apple);
        cart.add(4,strawberry);

        cart.printTicket();

    }
}