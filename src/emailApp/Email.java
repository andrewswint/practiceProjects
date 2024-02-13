package emailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;

//	Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created for " + this.firstName + " " + this.lastName);

//		Call a method asking for a department
		this.department = setDepartment();
		System.out.println("Department set to " + this.department);
		
//		Call method to set random password
		this.password = randomPassword(8);
		System.out.println("Your password is : " + this.password);

//		Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + ".com";
		System.out.println("Your email is " + email);
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
			return "";
		} else {
			sc.close();
			return "";
		}
	}

//	Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDREFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			Random rand = new Random();

			// Generate random integers in range 0 to 999
			int random = rand.nextInt(passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}

//	Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

//	Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

//	Change password
	public void changePassword(String password) {
		this.password = password;
	}

}
