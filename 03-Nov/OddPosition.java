/*
 * Q.3 we need to print the elements of the array which are present in odd positions. This can be accomplished by looping through the array and printing the elements of an array by incrementing i by 2 till the end of the array is reached.
 */
package Lab.java;

public class OddPosition {
	public static void main(String[] args) {   
      int [] arr = new int [] {1, 2, 3, 4, 5};//Initialize array            
  for (int i = 0; i < arr.length; i = i+2) { //Loop through the array by incrementing value of i by 2
     System.out.println("Elements of given array present on odd position: "+ arr[i]);
               
        }    
    }  	

}
