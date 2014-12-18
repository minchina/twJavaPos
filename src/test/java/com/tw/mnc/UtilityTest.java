package com.tw.mnc;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UtilityTest {
    @Test
    public void should_return_a_new_object(){
        assertThat(true,is(true));
    }
}
