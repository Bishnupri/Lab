package Lab.java;

 class Manager extends Employee{
	
		Manager(int id,String Name,String Address,long phone, double salary) {
			super(id,Name,Address,phone);
			this.basicSalary=salary;
		}
		 void calculateTransportAllowance () {
			double transportAllowance = 15*basicSalary /100;
			 System.out.println("Transport allowance of Manager is: "+transportAllowance+"Rs");	
		}
 }
		 


			 
