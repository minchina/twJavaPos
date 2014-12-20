package com.tw.mnc;

import org.junit.Test;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

/**
 * Created by minchina on 14-12-19.
 */
public class PrintTest {
    @Test
    public void should_println_subtotal(){
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        Cart cart = new Cart();
        Good good = new Good("ITEM000001",50);
        cart.add(4,good);

        cart.printTicket();

        assertEquals("购物明细（数量 单价 小计）\nITEM1   4   50   200\n总计金额（优惠前  优惠后  优惠差价）\n200   200   200    0\n",
                os.toString());
    }
}
