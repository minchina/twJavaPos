package com.tw.mnc;

import com.tw.mnc.promotions.Discount;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by minchina on 14-12-19.
 */
public class GoodItemTest {
    @Test
    public void should_compute_promotion_price_after_add_goods(){
        Good good = new Good.Builder().barcode("ITEM000001").price(40).promotion(new Discount(40)).build();
        GoodItem goodItem = new GoodItem(1,good);

        goodItem.updateItemPromotionPrice();

        assertThat(goodItem.promotionPrice,is(16.0));
    }
}