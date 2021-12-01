package B14_MiniProject.controllers;

import B14_MiniProject.models.Student;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

    public void sortByName(List<Student> list) {

        Collections.sort(
                list,
                (s1, s2) -> s1.getName().compareTo(s2.getName())
        );

    }

    public void sortById(List<Student> list) {

        Collections.sort(
                list,
                (s1, s2) -> Integer.compare(s1.getId(), s2.getId())
        );

    }

    public Student findByName(List<Student> list, String name) {

        for (Student s: list) {

            if (s.getName().equals(name)) {
                return s;
            }
        }

        return null;
    }

    public Student findById(List<Student> list, int id) {

        for (Student s: list) {

            if (s.getId() == id) {
                return s;
            }
        }

        return null;
    }

    public void addStudent(List<Student> list, Scanner sc) {

        list.add(new Student().input(sc));
    }

    public void editStudent(List<Student> list, Scanner sc) {

        System.out.println("Enter id: ");

        int id = sc.nextInt();
        sc.nextLine();// ignore new line

        Student student = findById(list, id);
        student.edit(sc);
    }

    public void deleteStudent(List<Student> list, Scanner sc) {

        System.out.println("Enter id: ");

        int id = sc.nextInt();
        sc.nextLine();

        Student student = findById(list, id);
        list.remove(student);
    }


}


/*
-- add():
-- edit():
-- delete():
-- sortStudentsByName()
-- sortStudentsByGPA()
-- ...
*/

/*
-- GPA: diem TB
--
*/