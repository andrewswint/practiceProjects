package studentDatabaseApp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 500;
	private static int id = 1000;

//	Constructor: Prompt user to enter name and year
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter students first name: ");
		this.firstName = sc.nextLine();

		System.out.print("Enter students last name: ");
		this.lastName = sc.nextLine();

		System.out.print("1-Freshmen\n2-Sophmore\n3-Junior\n4-Senior\nEnter student year: ");
		this.gradeYear = sc.nextInt();

		setStudentId();
	}

//	Generate an ID
	private void setStudentId() {
		id++;
		this.studentId = gradeYear + "" + id;
	}

//	Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter crouse to enroll (Q to quit): ");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if (!course.equalsIgnoreCase("Q")) {
				this.courses = courses + "\n" + course;
				this.tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
		} while (true);
	}

//	View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}

//	Pay tuition
	public void payTuition() {
		System.out.println("Tuition balance is: $" + tuitionBalance);
		System.out.print("Enter your tuition payment amount: $");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		viewBalance();
	}

//	Show status
	public String showInfo() {
		return "First name: " + firstName + "\nLast name: " + lastName + "\nStudent ID: " + studentId
				+ "\nEnrolled in: " + courses + "\nTuition balance: $" + tuitionBalance;
	}

}
