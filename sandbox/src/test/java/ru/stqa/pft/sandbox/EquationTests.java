package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTests {
    @Test
    public void testEquation(){
        Equation equation = new Equation(1.0, 4.0, 4.0);
        Assert.assertEquals(equation.getN(), 1);
    }

    @Test
    public void testEquation2(){
        Equation equation = new Equation(1, 1, 1);
        Assert.assertEquals(equation.getN(), 0);
    }

    @Test
    public void testEquation3(){
        Equation equation = new Equation(2, 6, 4);
        Assert.assertEquals(equation.getN(), 2);
    }
}

