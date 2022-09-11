/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskManagementExercise;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class TaskManage {

    ArrayList<Task> list = new ArrayList<>();
    public static int idTask = 1;

    public void addTask() {
        //TaskTypeID, Requirement Name, Date, Plan From,Plan To, Assignee, Expert
        System.out.println("------------Add Task---------------");

        System.out.print("Requirement Name: ");
        String name = Validation.checkInputString();
        System.out.print("Task Type: ");
        int typeId = Validation.checkInputIntLimit(1, 4);
        System.out.print("Date : ");
        String date = Validation.checkDateFormat();
        double planFrom = 0;
        double planTo = 0;
        while (!Validation.checkPlan(planFrom, planTo)) {
            System.out.print("From : ");
            planFrom = Validation.checkPlan();
            System.out.print("To : ");
            planTo = Validation.checkPlan();
        }
        System.out.print("Assignee : ");
        String assignee = Validation.checkInputString();

        System.out.print("Expert : ");
        String expert = Validation.checkInputString();
        Task newTask = new Task(idTask, typeId, name, date, planFrom, planTo, assignee, expert);
        list.add(newTask);
        idTask++;
        System.out.println("Sucessful.");
    }

    public int searchTask(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTaskID() == id) {
                return i;
            }

        }

        return -1;
    }

    public void deleteTask() {
        System.out.println("---------Del Task------");
        System.out.print("ID : ");
        int id = Validation.checkInputInt();
        int search = searchTask(id);
        if (search == -1) {
            System.out.println("Can't find id.");
            return;
        } else {
            list.remove(search);
        }
        System.out.println("Sucessful.");
    }

    public String getTaskType(int id) {
        String[] taskType = {"Code", "Test", "Design", "Review"};
        return taskType[id - 1];
    }

    public void displayTask() {
        if (list.isEmpty()) {
            System.out.println("List Empty");
            return;
        }
        System.out.println("----------------------------------------- Task ---------------------------------------");
        System.out.printf("%-5s%-15s%-15s%-15s%-15s%-15s%-15s\n", "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-5s%-15s%-15s%-15s%-15.1f%-15s%-15s\n", list.get(i).getTaskID(), list.get(i).getRequirementName(), getTaskType(list.get(i).getTaskTypeID()), list.get(i).getDate(), list.get(i).getPlanTo() - list.get(i).getPlanFrom(), list.get(i).getAssignee(), list.get(i).getExpert());
        }
    }
}
