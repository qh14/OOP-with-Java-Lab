/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContactManagerProgram;

/**
 *
 * @author admin
 */
public class Contact {
     protected int ID ;
    protected String fullname;
    protected String group;
    protected String address;
    protected String phone;
    protected String lastName;
    protected String firstName;
    public Contact() {
    }

    public Contact(int ID, String fullname, String group, String address, String phone, String lastName, String firstName) {
        this.ID = ID;
        this.fullname = fullname;
        this.group = group;
        this.address = address;
        this.phone = phone;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Contact{" + "ID=" + ID + ", fullname=" + fullname + ", group=" + group + ", address=" + address + ", phone=" + phone + ", lastName=" + lastName + ", firstName=" + firstName + '}';
    }

    
    
    public void display(){
        System.out.printf("%5d%25s%20s%20s%20s%20s%20s\n",ID,fullname,firstName,lastName,group,address,phone);
    }
}
