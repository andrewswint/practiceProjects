package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {

//		Ask how many students we want to add
		System.out.print("Enter number of students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		Student[] students = new Student[numOfStudents];

//		Create n number of students
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].showInfo());

		}

	}

}
