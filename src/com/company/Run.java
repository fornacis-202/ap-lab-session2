package com.company;

public class Run {
    public static void main(String[] args) {
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");

        std1.print();
        std1.setMark(15);
        std1.print();


        std2.print();
        std2.setMark(11);
        std2.print();

        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();

        Lab lab1=new Lab(5,"saturday");
        lab1.enrollStudent(std1);
        lab1.enrollStudent(std2);
        lab1.enrollStudent(std3);
        lab1.calculateAvg();
        lab1.print();

        University aut=new University("amirkabir",10);
        Lab lab2=new Lab(5,"sunday");
        lab2.enrollStudent(std2);
        lab2.enrollStudent(std3);
        lab2.enrollStudent(std1);
        lab2.calculateAvg();


        aut.enrollLabs(lab1);
        aut.enrollLabs(lab2);

        aut.print();

    }
}
