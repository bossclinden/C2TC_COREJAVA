//Nested Interface
package com.tns.ifet.day5.nestedinterfaces;
public interface MyInterface 
{
	 void calculateArea();
	    interface MyInnerInterface
	    {
	       int  id = 20;
	       void print();     
	    }
}