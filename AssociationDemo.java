import java.util.Scanner;

class SmartCard
{
	int emp_idn;
	public void MarkAttendance(Employee e)
	{
		emp_idn=e.getEmpId();
		System.out.println("Employee "+emp_idn+" is marked present");
	}

	public int getEmpIdn(Employee e)
	{
		return e.empid;
	}
}

class Employee
{
	int empid;
	
	Employee()
	{
		System.out.println("enter employeet id");
		Scanner sc=new Scanner(System.in);
		this.empid=sc.nextInt();
	}

	int getEmpId()
	{
		return empid;
	}

	public void Login(SmartCard sc)
	{
		int eid=sc.getEmpIdn(this);
		System.out.println("Login Successful for employee "+eid);
	}
}

public class AssociationDemo
{
	public static void main(String args[])
	{
		System.out.println("***ASSOCIATION BETWEEN EMPLOYEE AND SMARTCARD***");

		Employee e=new Employee();
		System.out.println("NEW EMPLOYEE IS CREATED");
		SmartCard scd=new SmartCard();
		scd.MarkAttendance(e);
		e.Login(scd);
	}
}