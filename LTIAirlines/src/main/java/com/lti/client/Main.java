package com.lti.client;

import com.lti.models.Flight;

public class Main {

	public static void main(String[] args) {
		//Flight f= new Flight(1001,"Mumbai","Delhi");
     // System.out.println(f.getFlightId()+" "+f.getSource()+" "+f.getDestination());
	
      //TEST DATA
      int num1=10; int num2=30;
      
      if(add(num1,num2)==40) {
    	  System.out.println("Test passed!");
      }
      else {
    	  System.out.println("Test failed!");
      }
	}
	
	public static int add(int n1,int n2) {
	return n1+n2;
     }
	
	public static boolean compare(int n1,int n2) {
		if(n1==n2) {
			return true;
		}
		return false;		
	}
	
}