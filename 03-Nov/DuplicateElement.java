/*
 * Q.2   Write a Java program to find the duplicate values of an array of integer values.
 */
package Lab.java;

public class DuplicateElement {
  public static void main(String[] args){ 
   int[] array = {5,2,7,7,5};
	 for (int i = 0; i < array.length-1; i++) {
	  for (int j = i+1; j < array.length; j++) {
		  if ((array[i] == array[j]) && (i != j)) {
              System.out.println("Duplicate Element : "+array[j]);		  
		  
	  }
	  }
  }
}
}
