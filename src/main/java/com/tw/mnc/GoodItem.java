package com.tw.mnc;

/**
 * Created by minchina on 14-12-17.
 */
public class GoodItem{
    public int num;
    public Good good;

    public GoodItem(int num,Good good){
        this.good = good;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
