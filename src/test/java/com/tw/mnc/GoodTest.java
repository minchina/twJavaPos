package com.tw.mnc;

import com.tw.mnc.promotions.Discount;
import com.tw.mnc.promotions.SecondHalf;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by minchina on 14-12-19.
 */
public class GoodTest {
    @Test
    public void should_create_a_good(){

        Good good = new Good.Builder().barcode("ITEM000001").name("apple").price(40).promotion(new Discount(40)).build();
        assertThat(good.barcode,is("ITEM000001"));
        assertThat(good.name,is("apple"));
        assertThat(good.promotionList.size(),is(1));
        assertThat(good.price,is(40.0));

    }

    @Test
    public void should_add_success_more_than_1_promotion(){
        Good good = new Good.Builder().name("pear").price(40).promotion(new Discount(40),new SecondHalf()).build();
        assertThat(good.name,is("pear"));
        assertThat(good.promotionList.size(),is(2));
    }
}
