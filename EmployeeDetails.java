package week2day3ass;

public class EmployeeDetails {
	 
	public void employeeName(String empName, int empId)
     {
  	   System.out.println(empName+empId);
     }
     public void employeeAddress(String empAddress)
     {
  	   System.out.println(empAddress);
     }
     public void employeeSalary(double empSalary)
     {
  	   System.out.println(empSalary);
     }
     public void employeeMobileNumber(long mobNum)
     {
  	   System.out.println(mobNum);
     }
     public static void main(String[] args) {
	 EmployeeDetails emp = new EmployeeDetails();
	 emp.employeeName("hariharan", 22);
	 emp.employeeAddress("salem");
	 emp.employeeSalary(4500.34);
	 emp.employeeMobileNumber(763452678);
		
	}
}
