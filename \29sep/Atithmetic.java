//A class named Arithmetic with a method named add that takes integers as parameters and returns an integer denoting their sum.
//A class named Adder that inherits from a superclass named Arithmetic

package com.java;

public class Atithmetic {
	public static void main(String[] args) {
        
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        System.out.print(a.add(2, 2) + " " + a.add(2, 3) + " " + a.add(2, 4) + "\n");
    }
}

class Arithmetic {

    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {

}



