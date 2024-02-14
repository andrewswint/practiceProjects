package studentDatabaseApp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 500;
	private static int id = 1000;

//	Constructor: Prompt user to enter name and year
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter students first name: ");
		this.firstName = sc.nextLine();

		System.out.println("Enter students last name: ");
		this.lastName = sc.nextLine();

		System.out.println("1-Freshmen\n2-Sophmore\n3-Junior\n4-Senior\nEnter student year: ");
		this.gradeYear = sc.nextInt();

		System.out.println(firstName + " " + lastName + " " + gradeYear);

		setStudentId();
		System.out.println("Student ID is: " + studentId);
	}

//	Generate an ID
	private void setStudentId() {
		id++;
		this.studentId = gradeYear + "" + id;
	}

//	Enroll in courses

//	View balance

//	Pay tuition

//	Show status

}
