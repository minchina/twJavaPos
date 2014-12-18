package com.tw.mnc;

import com.tw.mnc.promotions.Discount;
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
        this.promotionPrice = good.getPrice();
    }

    public boolean isPromotionFor(Good good,String promotionRule){
        return true;
    }

    public double getItemPrice(){
        return good.getPrice()*num;
    }

    public double getItemPromotionPrice(){
        return promotionPrice;
    }

    public void updateItemPromotionPrice(){
        if (isPromotionFor(good,"second_half")){
            SecondHalf secondHalf = new SecondHalf(num);
            this.promotionPrice = secondHalf.getPromotionPrice(promotionPrice);
        }

        if (isPromotionFor(good,"rating")){
            Discount discount = new Discount(80);
            this.promotionPrice = discount.getPromotionPrice(promotionPrice);
        }
    }

    public int getNum(){
        return num;
    }
}
