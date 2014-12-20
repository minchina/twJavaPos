package com.tw.mnc;

import com.tw.mnc.promotions.Promotion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minchina on 14-12-17.
 */
public class Good{
    public String barcode;
    public double price;
    public String name;
    public List<Promotion> promotionList = new ArrayList<>();

    public double getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }

    public static class Builder {
        public String barcode = null;
        public double price = 0;
        public String name = null;
        public List<Promotion> promotionList = new ArrayList<>();


        public Builder barcode(String val){
            this.barcode = val;
            return this;
        }

        public Builder price(double val){
            this.price = val;
            return this;
        }

        public Builder name(String val){
            this.name = val;
            return this;
        }

        public Builder promotion(Promotion ...promotions){
            for (Promotion promotion : promotions){
                this.promotionList.add(promotion);
            }
            return this;
        }

        public Good build(){
            return new Good(this);
        }

    }

    private Good(Builder builder){
        barcode = builder.barcode;
        price = builder.price;
        name = builder.name;
        promotionList = builder.promotionList;
    }
}
