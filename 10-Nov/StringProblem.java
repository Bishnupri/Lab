package Lab.java;

public class StringProblem {
	 //main class
		public static void main(String[] args) 
	{
			//problem statement 1
	System.out.println("----------Problem 1------------");
	String s="Welcome to Java World"; //object of String buffer class
	System.out.println(s.charAt(5)); // prints the character present at index 5
	System.out.println(s.compareTo("Welcome")); //compares the String' s' with "Welcome"
	System.out.println(s.concat("Let us learn")); //prints Welcome to Java WorldLet us learn
	System.out.println(s.indexOf("a")); //prints 12
	System.out.println(s.replaceAll("a","e")); //prints Welcome to Jeve World
	System.out.println(s.substring(4, 10)); //prints ome to
	System.out.println(s.toLowerCase()); //prints the text in lower case-->welcome to java world
	//problem statement 2
			System.out.println("----------Problem 2------------");
			StringBuffer sb=new StringBuffer("This is StringBuffer"); 
			System.out.println(sb.append("This is a sample program")); //This is StringBufferThis is a sample program
			System.out.println(sb.insert(21,"Object")); //This is StringBufferTObjecthis is a sample program
			System.out.println(sb.replace(14, 20, "Builder"));//replace  buffer to builder
			System.out.println(sb.reverse()); //reverse
		
	}

}
