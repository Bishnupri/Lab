package Lab.java;

public class Employee1 {
	 

			public static void main(String[] args) {
				Manager mg =new Manager(126534,"Sandip","BBSR" , 273589, 65025);	
				System.out.print("Manager "+mg.employeeName+"'s salary is: ");
				mg.calculateSalary();	//calling a method
				mg.calculateTransportAllowance();
				Trainee tr=new Trainee(29846,"Twinkle","Delhi india", 442085, 55000);	
				System.out.print("Trainee "+tr.employeeName+"'s salary is: ");
			    tr.calculateSalary();
			    tr.calculateTransportAllowance();
			}

}
