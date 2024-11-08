package com.tns.ifet.day7.extend;

public class ExtendingInterfaceDemo implements ChildInterface {
	// Override InterfaceOne method
	public void print() { 
		System.out.println("print method");
	}

	// Override ChildInterface method
	public void show() {
		System.out.println("show Method");
	}
	public static void main(String[] args) {
		ExtendingInterfaceDemo ei=new ExtendingInterfaceDemo();
		ei.print();
		ei.show();
	}
}

