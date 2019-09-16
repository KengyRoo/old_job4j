package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args){
        Student student = new Student();
        student.setFio("Aleksandr Kostyuk Urievich");
        student.setGroup("25A19");
        student.setEnrollment(new Date());

        System.out.println(student.getFio() + " group: " + student.getGroup() + " enrollement " + student.getEnrollment());

    }

}
