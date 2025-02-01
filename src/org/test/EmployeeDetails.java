package org.test;


public class EmployeeDetails  extends CompanyDetails {
	 public void empId() {
		System.out.println("Employee id is 100");
	}
	 public void empName() {
		 System.out.println("Employee name is Arun");
		
	}
	 public static void main(String[] args) {
		 EmployeeDetails e = new EmployeeDetails();
	e.empId();
    e.empName();
    e.CompId();
	e.CompName();
	 }
}


