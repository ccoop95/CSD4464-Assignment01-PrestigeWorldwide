/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.prestigeworldwide;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0659824
 */
public class CSD4464Assignment1PrestigeWorldwideTest {
    
    public CSD4464Assignment1PrestigeWorldwideTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testEmptyStringShouldReturnEmptyString(){
        String testString = "";
        int testInt = 69;
        CSD4464Assignment1PrestigeWorldwide instance = new CSD4464Assignment1PrestigeWorldwide();
        String expResult = "";
        String result = instance.stringPower(testString, testInt);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLessThanOneShouldReturnNull(){
        String testString = "";
        int testInt = -1;
        CSD4464Assignment1PrestigeWorldwide instance = new CSD4464Assignment1PrestigeWorldwide();
        String expResult = null;
        String result = instance.stringPower(testString, testInt);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStringAndOneShouldReturnString(){
        String testString = "Hello World";
        int testInt = 1;
        CSD4464Assignment1PrestigeWorldwide instance = new CSD4464Assignment1PrestigeWorldwide();
        String expResult = "Hello World";
        String result = instance.stringPower(testString, testInt);
        assertEquals(expResult, result);
    }
    @Test
    public void testStringAndTwoShouldReturnStringDoubled(){
        String testString = "bob";
        int testInt = 2;
        CSD4464Assignment1PrestigeWorldwide instance = new CSD4464Assignment1PrestigeWorldwide();
        String expResult = "bobbob";
        String result = instance.stringPower(testString, testInt);
        assertEquals(expResult, result);
    }
    @Test
    public void testStringAndMoreThanOneShouldReturnStringManyTimes(){
        String testString = "a";
        int testInt = 6;
        CSD4464Assignment1PrestigeWorldwide instance = new CSD4464Assignment1PrestigeWorldwide();
        String expResult = "aaaaaa";
        String result = instance.stringPower(testString, testInt);
        assertEquals(expResult, result);
    }
}
