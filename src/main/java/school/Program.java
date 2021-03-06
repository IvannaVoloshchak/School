package school;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Date birthday1 = stringToDate("2002-04-02");
        Date birthday2 = stringToDate("2002- 07-12");//date by using method
//       Date birthday3 = new Date(2001, 8, 10);// date by using java constructor
        Date birthday3 = stringToDate("2001-08-10");

        Student st1 = new Student("Mark", "Spenser", birthday1, Sex.male);
        Student st2 = new Student("Kate", "Morton", birthday2, Sex.female);
        // school.Student st3 = new school.Student("Ben", "Smith", new Date(2001, 8, 10), school.Sex.male);// using java constructor
        Student st3 = new Student("Ben", "Smith", birthday3, Sex.male);
        StudentClass studentClass1 = new StudentClass("A", 11);
        st1.setCopybook(10);
        st2.setCopybook(12);
        st3.setCopybook(13);
        // int result = st1.compareTo(st2);  //sorted by comparable checking results for two students
        //System.out.println(result);

        studentClass1.add(st1);
        studentClass1.add(st2);
        studentClass1.add(st3);

         System.out.println("\n" + studentClass1.studentList.get(1));
         System.out.println(studentClass1);

//        school.StudentComparator studentComparator = new school.StudentComparator(); //sorted by comparator checking results for two students
//        int result = studentComparator.compare(st1, st2);
//        System.out.println(result);

        Date birthday11 = stringToDate("2003-06-29");
        Date birthday12 = stringToDate("2001-04-9");
        Date birthday13 = stringToDate("2002-05-23");
        Date birthday14 = stringToDate("2002-06-11");

        StudentClass studentClass2 = new StudentClass("B", 11);
        Student st11 = new Student("Lee", "Stevenson", birthday11, Sex.male);
        Student st12 = new Student("Molly", "Longl", birthday12, Sex.female);
        Student st13 = new Student("Olivia", "Owen", birthday13, Sex.female);
        Student st14 = new Student("David", "Zmiya", birthday14, Sex.male);
        studentClass2.add(st11);
        studentClass2.add(st12);
        studentClass2.add(st13);
        studentClass2.add(st14);
        // System.out.println(studentClass2.studentList.get(1));


        List<Student> studentList1 = new ArrayList<>(); // sorting students usuing Comparable
        for (Student student : studentClass1.studentList) {
            studentList1.add(student);
        }
        Collections.sort(studentList1);
         System.out.println("\n" + studentList1);


        for (Student student : studentClass1.studentList) { // sorting using Comparator
            studentList1.add(student);
        }
        Collections.sort(studentList1, new StudentComparator());
        //System.out.println("\n" + studentList1);


        for (Student student : studentClass1.studentList) {//choose that students whom born after 2001-11-01
            if (student.birthday.after(stringToDate("2001-11-01"))) {
                studentList1.add(student);
            }
        } //System.out.println(studentList1);


        List<Student> studentList2 = new ArrayList<>();// choose that student which born after 2003-01-01
        for (Student student : studentClass2.studentList) {
            if (student.birthday.after(stringToDate("2003-01-01"))) {
                studentList2.add(student);
            }
        }// System.out.println("\n"+ studentList2);
    }


    public static Date stringToDate(String s) {//method which make type Date - String
        Date date = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date = dateFormat.parse(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }
}



