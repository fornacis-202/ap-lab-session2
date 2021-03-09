package com.company;
/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 * @author Mohammad Ali
 * @version 0.0 */
public class Student {
    //student's first name
    private String firstName;
    //student's last name
    private String lastName;
    //student's ID
    private String id;
    //studen's mark
    private double mark;

    /**
     * create a student with name and id
     * @param fName first name of the student
     * @param lName last name of the student
     * @param Sid ID of the student
     * */
    public Student(String fName , String lName, String Sid){
        firstName=fName;
        lastName=lName;
        id=Sid;
        mark=0;

    }

    /**
     * get the first name of student
     * @return  firstName field
     */
    public String getFirstName() {
        return firstName;

    }
    /**
     * get the last name of student
     * @return  lastName field
     */
    public String getLastName() {
        return lastName;

    }
    /**
     * get the ID of student
     * @return  ID field
     */
    public String getId() {
        return id;

    }
    /**
     * get the first name of student
     * @return  firstName field
     */
    public double getMark() {
        return mark;

    }
    /**
     * @param fName set first name of a student
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }
    /**
     * @param lName set first name of a student
     */
    public void setLastName(String lName) {
        lastName = lName;
    }
    /**
     * @param sId set ID name of a student
     */
    public void setId(String sId) {
        id = sId;
    }
    /**
     * @param sMark set the mark of a student
     */
    public void setMark(double sMark) {
        mark = sMark;
    }

    /**
     * Print the student’s full name , ID number and mark to the output terminal.
     */
    public void print() {
        System.out.println(firstName + " " + lastName + ", student ID: " + id + ", mark: " + mark);
    }



}
