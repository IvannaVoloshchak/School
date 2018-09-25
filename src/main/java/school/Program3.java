package school;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.*;

public class Program3 {
    public static Logger consLogger = Logger.getLogger("CONS");

    public static void main(String[] args) {

//        Map<Integer, String> hashmap = new HashMap<>();
//        hashmap.put(0, "Mark Spenser");
//        hashmap.put(1, "Kate Morton");
//        hashmap.put(2, "Ben Smith");
//        hashmap.put(3, "Molly Longl");
//        hashmap.put(4, "Olivia Owen");
//        hashmap.put(5, "David Zmiya");
//        System.out.println(hashmap);

        Map<Integer, Student> hashmap1 = new HashMap<>();
        Student st1 = new Student("Mark", "Spenser", stringToDate("2002-04-02"), Sex.male);
        Student st2 = new Student("Kate", "Morton", stringToDate("2002- 07-12"), Sex.female);
        Student st3 = new Student("Ben", "Smith", stringToDate("2001-08-10"), Sex.male);
        Student st4 = new Student("Lee", "Stevenson", stringToDate("2003-06-29"), Sex.male);
        Student st5 = new Student("Molly", "Longl", stringToDate("2001-04-9"), Sex.female);
        Student st6 = new Student("Olivia", "Owen", stringToDate("2002-05-23"), Sex.female);
        Student st7 = new Student("David", "Zmiya", stringToDate("2002-06-11"), Sex.male);
        hashmap1.put(0, st1);
        hashmap1.put(1, st2);
        hashmap1.put(2, st3);
        hashmap1.put(3, st4);
        hashmap1.put(4, st5);
        hashmap1.put(5, st6);
        hashmap1.put(6, st7);
        //  consLogger.info (hashmap1);
        // consLogger.info (hashmap1.get(5));

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(st1);
        studentList1.add(st2);

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(st3);
        studentList2.add(st4);
        List<Student> studentList3 = new ArrayList<>();
        studentList3.add(st5);
        studentList3.add(st6);
        studentList3.add(st7);
        Map<String, List<Student>> hashmap2 = new HashMap<>();
        hashmap2.put("0", studentList1);
        hashmap2.put("1", studentList2);
        hashmap2.put("2", studentList3);
        List<Student> s = hashmap2.get("1");
       // consLogger.info(hashmap2);
       // consLogger.info(s);

        Map<StudentClass, List<Student>> hashmap3 = new HashMap<>();
        StudentClass studentClass1 = new StudentClass("A", 10);
        StudentClass studentClass2 = new StudentClass("A", 11);
        StudentClass studentClass3 = new StudentClass("B", 11);
        hashmap3.put(studentClass1,studentList1);
        hashmap3.put(studentClass2,studentList2);
        hashmap3.put(studentClass3,studentList3);
        consLogger.info(hashmap3);
        List<Student> students = hashmap3.get(studentClass1);
        consLogger.info(students);

    }


    public static Date stringToDate(String s) {
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
