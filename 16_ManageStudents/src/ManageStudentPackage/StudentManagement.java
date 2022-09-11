/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageStudentPackage;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author admin
 */
public class StudentManagement {

    ArrayList<Student> listStudents = new ArrayList<>();
    public void data(){
        listStudents.add(new Student("S11", "quang huy ", "4","Java"));
        listStudents.add(new Student("S15", "Nguyen Van C", "3","Java"));
        listStudents.add(new Student("S11", "quang huy ", "3","Java"));
        listStudents.add(new Student("S12", "Nguyen van B ", "1","C/C++"));
        listStudents.add(new Student("S12", "Nguyen van B ", "2","C/C++"));
        listStudents.add(new Student("S11", "quang huy ", "5",".Net"));
        listStudents.add(new Student("S15", "Nguyen Van C", "5",".Net"));
        listStudents.add(new Student("S15", "Nguyen Van C", "6",".Net"));
        
        
    }
    public int findStudent(String id) {
        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getID().equalsIgnoreCase(id)) {
                return i;
            }

        }
        return -1;
    }

    public void createStudent() {
        int count = 0;
        boolean YN = true;
        while (YN) {
            Student newStudent = new Student();
            System.out.print("Enter id: ");
            String id = Validation.checkInputString();
            System.out.print("Enter name student: ");
            String name = Validation.checkInputString();
            if (!Validation.checkStudentExist(listStudents, id, name)) {
                System.err.println("Id has exist student. ");
                continue;
            }
            System.out.print("Enter semester: ");
            String semester = Validation.checkInputString();
            System.out.print("Enter name course: ");
            String course = Validation.checkInputCourse();
            if (!Validation.checkCourseExist(listStudents, id, name, semester, course)) {
                System.out.println("Course Existed !");
                continue;
            } else {
                newStudent = new Student(id, name, semester, course);
                listStudents.add(newStudent);
                count++;
                System.out.println("Add student success.");
            }
            if (count > 2) {
                System.out.print("Do you want to continue (Y/N): ");
                YN = Validation.checkYN();
            }

        }
    }

    public void findAndSort() {
        int count = 1;
        if (listStudents.isEmpty()) {
            System.out.println("List Empty");
            return;
        }

        ArrayList<Student> listFindName = new ArrayList<>();
        listFindName = listStudentFindByName();
        if (listFindName.size() == 0) {
            System.out.println("Cann't find name");
            return;
        }
        Collections.sort(listFindName);
        System.out.printf("%-8s%-15s%-15s%-15s\n", "Number", "Student name", "semester", "Course Name");
        for (Student listStudent : listFindName) {

            System.out.printf("%-8d%-15s%-15s%-15s\n", count, listStudent.getStudentName(), listStudent.getSemester(), listStudent.getCourseName());
            count++;

        }
    }

    public ArrayList<Student> listStudentFindByName() {
        ArrayList<Student> listStudentFindByName = new ArrayList<>();
        System.out.print("Enter name to search: ");
        String name = Validation.checkInputString();
        for (Student student : listStudents) {
            if (student.getStudentName().toLowerCase().contains(name.toLowerCase())) {
                listStudentFindByName.add(student);
            }
        }
        return listStudentFindByName;
    }

    public void updateOrDelete() {
        if (listStudents.isEmpty()) {
            System.out.println("List Empty");
            return;
        }
        System.out.print("Enter id : ");
        String id = Validation.checkInputString();
        if (findStudent(id) == -1) {
            System.out.println("Can't find id.");
            return;
        }
        ArrayList<Integer> numberOfStudent = new ArrayList<>();
        for (Student listStudent : listStudents) {
            if (listStudent.getID().contains(id)) {
                numberOfStudent.add(listStudents.indexOf(listStudent));
            }
        }

        System.out.printf("%-8s%-15s%-15s%-15s\n", "Number", "Student name", "semester", "Course Name");

        for (Integer integer : numberOfStudent) {
            System.out.printf("%-8d%-15s%-15s%-15s\n", integer, listStudents.get(integer).getStudentName(), listStudents.get(integer).getSemester(), listStudents.get(integer).getCourseName());
        }
        System.out.println("Enter your choice : ");
        int userChoice = Validation.checkInputInt();
        System.out.print("Do you want to update (U) or delete (D) student: ");
        boolean choice = Validation.checkInputUD();
        if (choice) {
            System.out.println("Enter new student name : ");
            String name = Validation.checkInputString();
            for (Integer integer : numberOfStudent) {
                listStudents.get(integer).setStudentName(name);
            }
            System.out.println("Enter new semester : ");
            String newSemeter = Validation.checkInputString();
            listStudents.get(userChoice).setSemester(newSemeter);
            System.out.println("Enter new course name : ");
            String newCourseName = Validation.checkInputString();
            listStudents.get(userChoice).setCourseName(newCourseName);
            System.out.println("List of current student : ");
            for (Student listStudent : listStudents) {
                System.out.printf("%-15s%-15s%-15s\n", listStudent.getStudentName(), listStudent.getSemester(), listStudent.getCourseName());
            }
        } else {
            listStudents.remove(userChoice);
            System.out.println("Removed!");
            System.out.println("List of current student : ");
            for (Student listStudent : listStudents) {
                System.out.printf("%-15s%-15s%-15s\n", listStudent.getStudentName(), listStudent.getSemester(), listStudent.getCourseName());
            }
        }
    }

    public void report() {
        if (listStudents.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        ArrayList<Report> listReports = new ArrayList<>();
        int total;
        for (Student student : listStudents) {
            total = 0;
            String id = student.getID();
            String courseName = student.getCourseName();
            String studentName = student.getStudentName();
            for (Student studentCountTotal : listStudents) {
                if (id.equalsIgnoreCase(studentCountTotal.getID())
                        && courseName.equalsIgnoreCase(studentCountTotal.getCourseName())) {
                    total++;
                }
            }
            if (Validation.checkExist(listReports, studentName,
                    courseName, total)) {
                listReports.add(new Report(studentName, courseName, total));
            }
        }
        for (int i = 0; i < listReports.size(); i++) {
            System.out.printf("%-15s|%-10s|%-5d\n", listReports.get(i).getStudentName(),
                    listReports.get(i).getCourseName(), listReports.get(i).getTotalCourse());
        }
    }


}
