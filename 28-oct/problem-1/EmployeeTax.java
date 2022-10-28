package Lab.java;

public class EmployeeTax {

	public static void main(String[] args) {
		TaxCalculator obj1 = new TaxCalculator(30000,true);
		System.out.println("Test case 1");
		obj1.calculateTax();
		obj1.deductTax();
		obj1.validateSalary();
		TaxCalculator obj2 = new TaxCalculator(257000,true);
		System.out.println("Test case 2");

		obj2.calculateTax();
		obj2.deductTax();
		obj2.validateSalary();

		
	}
}