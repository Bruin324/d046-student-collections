package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        for ( int i = 1; i <= 15; i++) {
            Student student = new Student();
            student.firstName = "Steve" + i;
            student.lastName = "Steverson" + i;
            student.id = i;
            student.grade = 1;
            studentList.add(student);
        }

        ArrayList<Teacher> teacherList = new ArrayList<>();

        for ( int i = 1; i <= 3; i++ ) {
            Teacher teacher = new Teacher();
            teacher.firstName = "Robert" + i;
            teacher.lastName = "Robertson" + i;
            teacher.id = i;
            teacher.grade = 1;
            teacherList.add(teacher);
        }

        Set<Student> studentSet1 = new HashSet<>();
        Set<Student> studentSet2 = new HashSet<>();
        Set<Student> studentSet3 = new HashSet<>();

// I did this here pretty much just to have a reason to use the ArrayList of students
        for (int i = 0; i < studentList.size(); i++) {
            switch (i) {
                case 0: case 1: case 2: case 3: case 4:
                    studentSet1.add(studentList.get(i));
                    break;
                case 5: case 6: case 7: case 8: case 9:
                    studentSet2.add(studentList.get(i));
                    break;
                case 10: case 11: case 12: case 13: case 14:
                    studentSet3.add(studentList.get(i));
                    break;
            }
        }

        Map<Teacher, Set> classes = new HashMap<>();

        classes.put(teacherList.get(0), studentSet1);
        classes.put(teacherList.get(1), studentSet2);
        classes.put(teacherList.get(2), studentSet3);

        System.out.println("The list of Teachers (Keys):");
        for (Teacher key : classes.keySet()) {
            System.out.println(key);
        }

        System.out.println("The list of Students (values):");
        for (Set value : classes.values()) {
            System.out.println(value);
        }

        System.out.println("The list of Classes (Entries):");
        for (Map.Entry entry : classes.entrySet()) {
            System.out.println(entry);
        }
    }
}
