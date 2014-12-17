package com.tw.mnc.utility;

/**
 * Created by minchina on 14-12-17.
 */
//这个类是用来处理itemlist中的条目的
public class Item {
    public String barcode;
    public float price;
    public Item(String barcode,float price){
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
