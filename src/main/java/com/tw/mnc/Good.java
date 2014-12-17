package com.tw.mnc;

/**
 * Created by minchina on 14-12-17.
 */
public class Good{
    public String barcode;
    private double price;
    private String name;


    public Good(String barcode,double price){
        this.barcode = barcode;
        this.price = price;
        this.name = barcode.substring(0,4)+barcode.substring(barcode.length()-1);
    }

    public double getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }
}
