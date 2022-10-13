package Lab.java;

public class Employee {
		int employeeId;
		String employeeName;
		String employeeAddress;
		long employeePhone;
		double basicSalary;
		final double specialAllowance=150.59;
	    final double hra=1050.50;
		
		 Employee(int Id,String Name,String Address,long Phone){ 
			this.employeeId=Id;
			this.employeeName=Name;
			this.employeeAddress=Address;
			this.employeePhone=Phone;
		}
		
		void calculateSalary () {
			double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100); 
			System.out.println(salary);
		}
		
		void calculateTransportAllowance () {
			 double transportAllowance = 10*basicSalary/100;
			 System.out.println("Transport allowance of Trainee is: "+transportAllowance+"Rs");
		}

}
