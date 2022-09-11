/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageStudentPackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Validation {
    public static Scanner sc = new Scanner(System.in);

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number integer : ");
                System.out.println("Enter again : ");
            }
        }
    }

    public static int checkInputIntLimit(int a, int b) {
        while (true) {
            int num = Validation.checkInputInt();
            if (num >= a && num <= b) {
                return num;
            } else {
                System.out.print("Please only " + a + " to " + b + ":");
            }
        }
    }

    public static boolean checkCourseExist(ArrayList<Student> ls, String id, String studentName, String semester, String courseName) {
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getID())
                    && studentName.equalsIgnoreCase(student.getStudentName())
                    && semester.equalsIgnoreCase(student.getSemester())
                    && courseName.equalsIgnoreCase(student.getCourseName())) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkStudentExist(ArrayList<Student> ls, String id, String studentName) {
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getID()) && !studentName.equalsIgnoreCase(student.getStudentName())) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkCourseNameExist(ArrayList<String> ls, String studentName) {
        for (String l : ls) {
             if (studentName.equalsIgnoreCase(l)) {
                return false;
            }
        }
        return true;
    }
    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.println("Enter again : ");
            } else {
                return result;
            }
        }
    }

    public static boolean checkYN() {
        while (true) {
            String res = checkInputString();
            if (res.equalsIgnoreCase("Y")) {
                return true;
            }
            if (res.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.println("Enter again");
        }
    }

    public static String checkInputCourse() {

        while (true) {
            String result = checkInputString();

            if (result.equalsIgnoreCase("java")
                    || result.equalsIgnoreCase(".net")
                    || result.equalsIgnoreCase("c/c++")) {
                return result;
            }
            System.err.println("There are only three courses: Java, .Net, C/C++");
            System.out.print("Enter again: ");
        }
    }
    public static boolean checkInputUD() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("U")) {
                return true;
            }
            if (result.equalsIgnoreCase("D")) {
                return false;
            }
            System.err.println("Please input u/U or d/D.");
            System.out.print("Enter again: ");
        }
    }
    public static boolean checkExist(ArrayList<Report> list, String name,String course, int total) {
        for (Report report : list) {
            if (name.equalsIgnoreCase(report.getStudentName()) && course.equalsIgnoreCase(report.getCourseName())) {
                return false;
            }
        }
        return true;
    }

}
