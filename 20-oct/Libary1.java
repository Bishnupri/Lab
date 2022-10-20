package Lab.java;

public class Libary1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libary obj1=new Libary();  //obj 1
		Libary obj2=new Libary();  //obj 2
		obj1.addBook(150, "Math", "Twinkle");
		obj2.addBook(180, "English", "Sandip");
		
		obj1.dispenseBook("Math");
		obj2.dispenseBook("English");
		
	}

}
