package classAndObject;
public class EmployeeDto {
	 private Long employeeId;
	private  String employeeName;
	private  static String employeeSalary;

	 public long  getEmployeeId()
	 {
		 return employeeId;
	 }
	 public void setEmployeeId(long employeeId )
	 {
		 this.employeeId=employeeId;
	 }
	 public String  getEmployeeName()
	 {
		 return employeeName;
	 }
	 public void setEmployeeName(String eName)
	 {
		 employeeName=eName;
	 }
	 public String getEmployeeSalary()
	 {
		 return employeeSalary;
	 }
	 public void setEmployeeSalary(String employeeSalary)
	 {
		 EmployeeDto.employeeSalary=employeeSalary;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
