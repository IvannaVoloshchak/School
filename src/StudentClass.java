
import java.util.ArrayList;


import java.util.List;

public class StudentClass {
    String className;
    int number;

    List<Student> studentList = new ArrayList<>();

    void add(Student student) {
        studentList.add(student);
    }
    StudentClass(String className, int number){
    String cl=className;
    int num= number;
    }


    @Override
    public String toString() {
        return "StudentClass{" +
                "className='" + className + '\'' +
                ", number=" + number +
                ", studentList=" + studentList +
                '}';
    }
}



