package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;
import com.lti.models.Flight;

public class TestCase1 {
        
 @Test
 public void testAdd() {
	 //test data
	 int num1=10;int num2=10;
	 
	 assertEquals(20,Main.add(num1, num2));
 }
 
 @Test
 public void testNums() {
	 int num1=10;int num2=20;
	// assertTrue(Main.compare(num1, num2));
	 
	 assertFalse(Main.compare(num1, num2));
 }
 
 @Test
 public void testObjects() {
	 Flight f1=new Flight(1001,"Mumbai","Delhi");
	Flight f2=new Flight(1001,"Mumbai","Delhi");  //though have same values but different references so unequal
	 //Flight f2=f1;
	  Flight f3=null;
	  
  	  assertSame("Objects are not same",f1,f2);
	 //assertEquals("Objects are not equal",f1, f2);
     assertNotNull(f3);
 }
	
}
