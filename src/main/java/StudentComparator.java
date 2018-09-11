import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
//    @Override
//    public int compare( Student student1, Student student2){
//        return student1.getFirstName().compareTo(student2.getFirstName());
//    }

    @Override
    public int compare(Student student1, Student student2) {
       int copybook1= student1.getCopybook();
       int copybook2= student2.getCopybook();
        if (copybook1==copybook2){
            return 0;
        }else if(copybook1>copybook2){
            return 1;
        }else {
            return -1;
        }
    }
}
