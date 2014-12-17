package com.tw.mnc.utility;

import com.tw.mnc.Good;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minchina on 14-12-17.
 */
public class Parser {
    public static List<Good> parseCart(){
        String filePath = "/home/minchina/tw/POS_v1/src/test/java/FileSource/cart.txt";
        List<String> arrayCartList;
        arrayCartList = FileReader.readfilebyline(filePath);
        System.out.println(arrayCartList);
        return null;
    }

    public static float parsePrice(String goodBarcode){
        List<Item> itemList = new ArrayList<>();
        List<String> arrayItemList;
        String filePath = "/home/minchina/tw/POS_v1/src/test/java/FileSource/itemlist.txt";
        arrayItemList = FileReader.readfilebyline(filePath);

        for(String item : arrayItemList){
            String barcode = item.split(":")[0];
            float price =Float.valueOf(item.split(":")[1]);
            Item item_object = new Item(barcode,price);
            itemList.add(item_object);
        }

        for(Item item :itemList){
            if(item.barcode.equals(goodBarcode)){
                return item.price;
            }
        }
        return 0;
    }
}
