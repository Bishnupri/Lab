/*Qus-2 :Write a java class to develop an employee class object & initialized the emp name & emp Id for 5 Emp. now write another class having name and from this class you have to create 5 employee objects but you are not allowed to use new keyword.
 * Write a java class to develop an employee class object & initialized the emp name & emp Id for 5 Emp.
 *  now write another class having name and from this class
 *  you have to create 5 employee objects but you are not allowed to use new keyword.
 */

package Lab.java;

public class Employee2 {
	static String empName;
	  static int empId;
		static void  empDetails(String name,int id) { 
			empName=name;
			empId=id;
			System.out.println(empName+" "+empId);
		}
	}
	 class EmployeeClass extends Employee2{
		 public static void main(String[] args) {
			 Employee2.empDetails("BIS", 54); 
			 Employee2.empDetails("SAN", 150); 
			 Employee2.empDetails("SID", 19); 
			 Employee2.empDetails("AYA", 25); 
			 Employee2.empDetails("ARY", 10); 
			 
			
		}
	 }


