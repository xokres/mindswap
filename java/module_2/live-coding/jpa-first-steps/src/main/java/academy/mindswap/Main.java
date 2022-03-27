package academy.mindswap;

import academy.mindswap.services.StudentService;

public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.printStudentById(1);


        studentService.printAllStudents();
        studentService.createOrUpdateStudent(2, "John", 4);
        studentService.printAllStudents();
    }
}
