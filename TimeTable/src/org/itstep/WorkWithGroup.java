package org.itstep;

import java.util.ArrayList;

public class WorkWithGroup {

	public static void main(String[] args) {

		GroupOfStudents group = new GroupOfStudents();
		group.setName("ST20");

		for (int i = 0; i < 15; i++) {
			Student student = new Student(("ignatenko" + (i + 1)), ("myPass" + (i + 1)), "Alex", "Kiev");
			if (i > 8) {
				student.setCity("Ternopil");
			}

			group.addStudentToGroup(student);
		}

		System.out.println("My best group is " + group.getName());
		System.out.println("List of students:");

		if (!group.getStudents().isEmpty()) {
			for (Student student : group.getStudents()) {

				switch (student.getCity()) {
				
				case "Ternopil":
					System.out.println("Login: " + student.getLogin() + " Name: " + student.getName() + ". I'm from "
							+ student.getCity());
					break;

				case "Harkiv":
					System.out.println("Login: " + student.getLogin() + " Name: " + student.getName() + ". I'm from "
							+ student.getCity());
					break;

				case "Chernivtsi":
					System.out.println("Login: " + student.getLogin() + " Name: " + student.getName() + ". I'm from "
							+ student.getCity());
					break;

				default:
					System.out.println("I don't know where I from...");
					break;
				}
				
				
//				if (!student.getCity().equals("Kiev")) {
//					System.out.println("Login: " + student.getLogin() + " Name: " + student.getName() + ". I'm from "
//							+ student.getCity());
//
//				} else {
//					System.out.println("Login: " + student.getLogin() + " Name: " + student.getName() + ". I'm from "
//							+ student.getCity());
//				}

			}

		}

	}

}
