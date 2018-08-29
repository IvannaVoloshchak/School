
import java.util.Calendar;
import java.util.Date;

public class Student {

    String firstName;
    String lastName;
    Date birthday;
    Sex sex;


    Student(String fn, String ln, Date bd, Sex s) {
        firstName = fn;
        lastName = ln;
        birthday = bd;
        sex = s;
    }

    @Override
    public String toString() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(birthday);
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + calendar.get(Calendar.YEAR) + "/" +calendar.get(Calendar.MONTH) +"/" +calendar.get(Calendar.DATE)+
                ", sex=" + sex +
                '}';
    }



}

