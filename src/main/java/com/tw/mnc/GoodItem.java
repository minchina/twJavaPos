package com.tw.mnc;

import com.tw.mnc.promotions.SecondHalf;

/**
 * Created by minchina on 14-12-17.
 */
public class GoodItem{
    public int num;
    public Good good;
    public double promotionPrice;

    public GoodItem(int num,Good good){
        this.good = good;
        this.num = num;
        this.promotionPrice = 0;
    }

    public double getItemPrice(){
        return good.getPrice()*num;
    }

    public double getItemPromotionPrice(){
        SecondHalf secondHalf = new SecondHalf(num);
        this.promotionPrice = secondHalf.getPromotionPrice(good.getPrice());
        return this.promotionPrice;
    }

    public int getNum(){
        return num;
    }
}
