/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskManagementExercise;

/**
 *
 * @author admin
 */
public class Task {
    //TaskTypeID, Requirement Name, Date, Plan From,Plan To, Assignee, Expert
    private int taskID;
    private int taskTypeID;
    private String requirementName;
    private String date;
    private double planFrom;
    private double planTo;
    private String Assignee;
    private String expert;

    public Task(int taskID, int taskTypeID, String requirementName, String date, double planFrom, double planTo, String Assignee, String expert) {
        this.taskID = taskID;
        this.taskTypeID = taskTypeID;
        this.requirementName = requirementName;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.Assignee = Assignee;
        this.expert = expert;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public int getTaskTypeID() {
        return taskTypeID;
    }

    public void setTaskTypeID(int taskTypeID) {
        this.taskTypeID = taskTypeID;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(double planFrom) {
        this.planFrom = planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public void setPlanTo(double planTo) {
        this.planTo = planTo;
    }

    public String getAssignee() {
        return Assignee;
    }

    public void setAssignee(String Assignee) {
        this.Assignee = Assignee;
    }

    public String getExpert() {
        return expert;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }

    @Override
    public String toString() {
        return "Task{" + "taskID=" + taskID + ", taskTypeID=" + taskTypeID + ", requirementName=" + requirementName + ", date=" + date + ", planFrom=" + planFrom + ", planTo=" + planTo + ", Assignee=" + Assignee + ", expert=" + expert + '}';
    }
    
}
