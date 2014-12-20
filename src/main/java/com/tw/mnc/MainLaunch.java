package com.tw.mnc;

import com.tw.mnc.promotions.Discount;
import com.tw.mnc.promotions.SecondHalf;
import com.tw.mnc.utility.Parser;


public class MainLaunch {
    public static void main(String[] args){

        Good apple = new Good.Builder().barcode("ITEM000001").name("apple").price(40).promotion(new SecondHalf(), new Discount(75)).build();
        Good strawberry = new Good.Builder().barcode("ITEM000001").name("strawberry").price(50).promotion(new SecondHalf()).build();
        Good pear = new Good.Builder().barcode("ITEM000001").name("pear").price(60).promotion(new Discount(90)).build();

        Cart cart = new Cart();



        cart.add(5,apple);
        cart.add(2,strawberry);
        cart.add(4,pear);

        cart.printTicket();

    }
}