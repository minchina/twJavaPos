package com.tw.mnc;

/**
 * Created by minchina on 14-12-17.
 */
public class Good{
    private String barcode;
    private float price;
    private String name;

    public Good(String barcode,float price){
        this.barcode = barcode;
        this.price = price;
        this.name = barcode.substring(0,4)+barcode.substring(barcode.length()-1);
    }

    public String getBarcode() {
        return barcode;
    }

    public float getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }
}
