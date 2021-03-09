package com.company;

public class University {
    String uName;
    Lab labs[];
    int currentSize;
    int capacity;

    /**
     * @author Mohammad Ali
     * @param name name of the university
     * @param labCap max number of labs/classe
     */
    public University(String name, int labCap){
        uName=name;
        labs = new Lab[labCap];
        currentSize=0;
        capacity=labCap;
    }

    /**
     * add a new lab/class to the university
     * @param lab1 the lab/class we want to add
     */

    public void enrollLabs(Lab lab1){
        if(currentSize<capacity){
            labs[currentSize]=lab1;
            currentSize++;
        }else
            System.out.println("university is full!");
    }

    /**
     *
     * @return array of labs
     */

    public Lab[] getLabs() {
        return labs;
    }

    /**
     *
     * @param labs the labs in the university
     */
    public void setLabs(Lab[] labs) {
        this.labs = labs;
    }

    /**
     * printing the details of the university
     */
    public void print(){
        System.out.println("University name : "+uName+"  ,number of labs: "+currentSize);
        for (int i=0; i<currentSize;i++)
            labs[i].print();
    }
}
