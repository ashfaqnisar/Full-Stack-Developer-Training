package com.cts.rainbowjewellers.test;

import com.cts.rainbowjewellers.service.RainbowJewellersService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RainbowJewellersParameterizedTest {
    private double gram, expectedPrice;
    private RainbowJewellersService service;

    public RainbowJewellersParameterizedTest(double gram, double expectedPrice) {
        this.gram = gram;
        this.expectedPrice = expectedPrice;
    }

    @Before
    public void init() {
        service = new RainbowJewellersService();
    }


    @Parameterized.Parameters
    public static Collection inputValues() {
        return Arrays.asList(new Object[][]{
                {-1, -5041.85},
                {0, 0},
                {9.6, 48401.76},
                {24.5, 123525.325},
                {56, 282343.6},
        });
    }

    @Test
    public void testCalculateGoldPrice() {
        Assert.assertEquals(expectedPrice, service.calculategoldprice(gram), 0.0);
        System.out.println(expectedPrice + " = " + service.calculategoldprice(gram));
    }

}
