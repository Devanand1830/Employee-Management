package finaldata;
import employeedetails.EmployeeDetails;

import maintaince.Data;
import java.util.Scanner;
public class FinalData {
public static void main(String args[])

{

	Scanner scan = new Scanner(System.in);
	System.out.println("ID :");

	    EmployeeDetails bcobj = new EmployeeDetails();

	bcobj.setEmployeeId(scan.nextInt());
	System.out.println("Fname :");
	bcobj.setFname(scan.next());
	System.out.println("Lname :");
	bcobj.setLname(scan.next());
	System.out.println("Email :");
	bcobj.setEmail(scan.next());
	
	System.out.println("Phone :");
	bcobj.setPhoneNumber(scan.next());

	int ans = Data.enterdata(bcobj);


System.out.println(ans);
}
}


