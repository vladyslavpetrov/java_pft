package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {
    @Test
    public void testIsPrimeTrue(){
        Assert.assertTrue(Prime.isPrime(Integer.MAX_VALUE));
    }

    @Test(enabled = false)
    public void testIsPrimeLongTrue(){
        long n = Integer.MAX_VALUE;
        Assert.assertTrue(Prime.isPrime(n));
    }

    @Test
    public void testIsPrimeFastTrue(){
        Assert.assertTrue(Prime.isPrimeFast(Integer.MAX_VALUE));
    }

    @Test
    public void testIsPrimeFalse(){
        Assert.assertFalse(Prime.isPrime(Integer.MAX_VALUE - 2));
    }
}
