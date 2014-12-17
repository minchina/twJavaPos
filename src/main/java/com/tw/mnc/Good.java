package com.tw.mnc;

/**
 * Created by minchina on 14-12-17.
 */
public class Good{
    private String barcode;
    private float price;

    public Good(String barcode,float price){
        this.barcode = barcode;
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }

    public float getPrice() {
        return price;
    }
}
