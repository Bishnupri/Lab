/*
 * Q.1   Write a Java program to test if an array contains a specific value
 */
package Lab.java;

public class Specificvalue {
 public static boolean contains(int[] b, int c) {
	 for (int n : b) {
	 if (c == n) {
	  return true;
 }
	 }
  return false;
  }
  public static void main(String[] args) {
    int[] a = {1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456};
     System.out.println(contains(a, 2013));
     System.out.println(contains(a, 2015));
  }


}
