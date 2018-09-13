package school;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Program2 {
    public static Logger consLogger = Logger.getLogger("CONS");

    public static void main(String[] args) {
        String log4jConfPath = "C:\\Users\\User\\Project\\src\\main\\resources\\log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        Student st1 = new Student("Mark", "Spenser", stringToDate("2002-04-02"), Sex.male);
        Student st2 = new Student("Kate", "Morton", stringToDate("2002- 07-12"), Sex.female);
        Student st3 = new Student("Ben", "Smith", stringToDate("2001-08-10"), Sex.male);
        Student st4 = new Student("Lee", "Stevenson", stringToDate("2003-06-29"), Sex.male);
        Student st5 = new Student("Molly", "Longl", stringToDate("2001-04-9"), Sex.female);
        Student st6 = new Student("Olivia", "Owen", stringToDate("2002-05-23"), Sex.female);
        Student st7 = new Student("David", "Zmiya", stringToDate("2002-06-11"), Sex.male);
        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        studentList.add(st6);
        studentList.add(st7);
        consLogger.info ( studentList);


        Student st11 = new Student("Mark", "Spenser", stringToDate("2002-04-02"), Sex.male);
        Student st12 = new Student("Kate", "Morton", stringToDate("2002- 07-12"), Sex.female);
        Student st13 = new Student("Ben", "Smith", stringToDate("2001-08-10"), Sex.male);
        Student st14 = new Student("Lee", "Stevenson", stringToDate("2003-06-29"), Sex.male);
        Student st15 = new Student("Molly", "Longl", stringToDate("2001-04-9"), Sex.female);
        Student st16 = new Student("Olivia", "Owen", stringToDate("2002-05-23"), Sex.female);
        Student st17 = new Student("David", "Zmiya", stringToDate("2002-06-11"), Sex.male);
        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(st11);
        studentList2.add(st12);
        studentList2.add(st13);
        studentList2.add(st14);
        studentList2.add(st15);
        studentList2.add(st16);
        studentList2.add(st17);
        List<Student> studentList1 = new ArrayList<>(studentList);
        Collections.sort(studentList1);
        Collections.sort(studentList2);
        for (int i = 0; i < studentList.size(); i++) {
            if (!studentList.get(i).equals(studentList1.get(i))) {
                consLogger.warn(" Lists are not equals");
                break;
            }
        }
        consLogger.info(studentList1);
//        System.out.println("\n" + studentList1);
//        System.out.println(" Oldest student " + studentList1.get(0));
//        System.out.println("Youngest  student " + studentList1.get(studentList.size()-1));

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


