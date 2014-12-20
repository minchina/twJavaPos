package com.tw.mnc;

import com.tw.mnc.promotions.Discount;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by minchina on 14-12-19.
 */
public class GoodTest {
    @Test
    public void should_add_promotion_to_good(){
        Good good = new Good("ITEM000001",40);
        Discount discount = new Discount(50);

        good.addPromotion(discount);

        assertThat(good.promotionList.size(),is(1));
    }
}
