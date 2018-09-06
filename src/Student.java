
import java.util.Calendar;
import java.util.Date;

public class Student implements Comparable<Student> {
    String firstName;
    String lastName;
    Date birthday;
    Sex sex;
    int copybook;

    public int getCopybook() {
        return copybook;
    }

    public void setCopybook(int copybook) {
        this.copybook = copybook;
    }

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
                ", birthday=" + calendar.get(Calendar.YEAR) + "/" + calendar.get(Calendar.MONTH) + "/" + calendar.get(Calendar.DATE) +
                ", sex=" + sex + '\'' +
                ", copybook= " + copybook +
                '}';
    }

    //    @Override // compare by name
//    public int compareTo(Student student) {
//        return firstName.compareTo(student.firstName);
//        }
//    @Override  //compare by date
//    public int compareTo(Student student) {
//        return birthday.compareTo(student.birthday);
//    }
    @Override // compare by int variable
    public int compareTo(Student student) {
        if (copybook==student.copybook){
            return 0;
        }else if(copybook>student.copybook){
            return 1;
        }else {
            return -1;
        }
    }
}



