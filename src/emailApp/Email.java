package emailApp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;

//	Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created for " + this.firstName + " " + this.lastName);

//		Call a method asking for a department
		this.department = setDepartment();
		System.out.println("Department set to " + this.department);
	}

//	Ask for the department
	private String setDepartment() {
		System.out.print(
				"Enter the department\n1 for sales\n2 for dev\n3 for accounting\n0 for none\nEnter department code: ");
		Scanner sc = new Scanner(System.in);
		int response = sc.nextInt();

		if (response == 1) {
			sc.close();
			return "Sales";
		} else if (response == 2) {
			sc.close();
			return "Development";
		} else if (response == 3) {
			sc.close();
			return "Accounting";
		} else if (response == 0) {
			sc.close();
			return "None";
		} else {
			sc.close();
			return "";
		}
	}

//	Generate a random password

//	Set the mailbox capacity

//	Set alternate email

//	Change password

}
