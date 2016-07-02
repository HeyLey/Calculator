package ru.compscicenter.java2015.calculator;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    public static final double DELTA = 1E-8;
    Calculator calculator;
    
    
    @Before
    public void getInstance() throws ClassNotFoundException, IOException, IllegalAccessException, InstantiationException {
        Properties prop = new Properties();
        prop.load(CalculatorTest.class.getClassLoader().getResourceAsStream("build.properties"));
        Locale.setDefault(Locale.US);
        calculator = (Calculator) CalculatorTest.class.getClassLoader().loadClass(prop.getProperty("IMPLEMENTATION_CLASS")).newInstance();
    }


    @Test
    public void testZero() {
        assertEquals(0, calculator.calculate(Long.toString(0)), DELTA);
    }


}