package B14_MiniProject.controllers;

import B14_MiniProject.models.Student;
import java.util.Collections;
import java.util.List;

public class StudentManager {

    public List<Student> sortByName(List<Student> list) {

        Collections.sort(
                list,
                (Student s1, Student s2) -> {
                    return s1.getName().compareTo(s2.getName());
                });

        return list;
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