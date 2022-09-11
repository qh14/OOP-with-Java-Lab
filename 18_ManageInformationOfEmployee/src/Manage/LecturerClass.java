/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage;

/**
 *
 * @author admin
 */
public class LecturerClass extends Employee{
    protected int teachingHours;

    public LecturerClass() {
    }

    public LecturerClass(int teachingHours) {
        this.teachingHours = teachingHours;
    }

    public LecturerClass(int teachingHours, String id, String name, double salary) {
        super(id, name, salary);
        this.teachingHours = teachingHours;
    }

    public int getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(int teachingHours) {
        this.teachingHours = teachingHours;
    }
    public void input(){
        super.input();
        System.out.print("Enter teaching hours : ");
        teachingHours = Validation.checkInputInt();
    }
    @Override
    double calsalary() {
        return teachingHours*250000;
    }
    
}
