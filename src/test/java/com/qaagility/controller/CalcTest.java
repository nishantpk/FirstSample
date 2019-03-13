package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagility.javaee.*;
 
public class CalcTest {

      public void testSlow() {
        System.out.println("slow");
      }

      public void testSlower() {
        System.out.println("slower");
      }

      public void testFast() {
        System.out.println("fast-updated");
      }

	@Test	
      public void testCalc() {
	Calcmul testcalmul = new Calcmul();
	Calculator testcaladd = new Calculator();
	System.out.println("Mul Started 1");   
        assertEquals(testcalmul.mul(), 18);
	System.out.println("Mul Started 2"); 
	assertEquals(testcalmul.mul(), 18);
	System.out.println("Addition Started");
	assertEquals(testcaladd.add(), 9);
	assertEquals(testcaladd.add(), 19);
      }

	@Test	
      public void testCalc1() {
        assertEquals("Result - Fail", 9, 9);
      }
	
	
    }
