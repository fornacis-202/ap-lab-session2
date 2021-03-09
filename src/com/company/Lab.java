package com.company;

public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    /**
     *
     * @param cap capacity of the lab
     * @param d day of the lab
     */

    public Lab(int cap, String d) {
        capacity=cap;
        students=new Student[cap];
        day=d;
        currentSize=0;
        avg=0;
    }

    /**
     * adding a student to the lab
     * @param std student we want to add
     */

    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");

        }
    }

    /**
     * printing labs detail
     */
    public void print() {
        System.out.println("lab day: " + getDay()+ " , lab average: "+ getAvg());
        for(int i= 0; i<currentSize;i++){
           students[i].print();
        }
    }

    /**
     *
     * @return array of the student
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * setting student of the lab using an array
     * @param students array of the student
     */
    public void setStudents(Student[] students) {
        this.students=students;
    }

    /**
     *
     * @return average of lab
     */
    public double getAvg() {
        return avg;
    }

    /**
     * calculating the average of the student
     */
    public void calculateAvg() {
        for(int i= 0; i<currentSize;i++){
            avg+=(students[i].getMark()/currentSize);
        }
    }

    /**
     *
     * @return day of the lab
     */
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day=day;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity=capacity;
    }

}
