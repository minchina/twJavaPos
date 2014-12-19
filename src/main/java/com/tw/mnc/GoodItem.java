package com.tw.mnc;


import com.tw.mnc.promotions.Promotion;

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
        this.promotionPrice = good.getPrice() * num;
    }

    public double getItemPrice(){
        return good.getPrice()*num;
    }

    public double getItemPromotionPrice(){
        return promotionPrice;
    }

    public void updateItemPromotionPrice(){
        for (Promotion promotion:good.promotionList){
            this.promotionPrice = promotion.getPromotionPrice(num,promotionPrice);
        }
    }

    public int getNum(){
        return num;
    }
}
