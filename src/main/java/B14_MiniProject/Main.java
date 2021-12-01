package B14_MiniProject;

import B14_MiniProject.controllers.StudentManager;
import B14_MiniProject.models.Student;
import B14_MiniProject.services.StudentDataService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        StudentDataService service = new StudentDataService();

        List<Student> students = service.read("./resources/student-input.txt");

//        for (int i = 0; i < students.size(); ++i) {
//
//            System.out.println(students.get(i));
//        }

        // write to file "./resources/student-output.txt"
//        service.write("./resources/student-output.txt", students);

        StudentManager mng = new StudentManager();
        //mng.sortByName(students);
        // mng.sortById(students);
//        for (int i = 0; i < students.size(); ++i) {
//
//            System.out.println(students.get(i));
//        }
        //Student findByName = mng.findByName(students, "Nguyen Van A");

        Student findById = mng.findById(students, 1003);

        System.out.println(findById);

    }

}

/*
-- class Student: name, id, phone, address, ... + methods
-- ArrayList<Student> => sort, search, add, delete, update, ...
*/
/*
-- B1: Class
-- B2: array (list) of students
-- B3: logic
*/