import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Student {
    private String name;

    public static void main(String[] args) {
        Set<String> students = new HashSet<String>(1000);
        String student="hoa";
        String student1="ha";
        String student2="hob";
        String student3="hoo";
        String student4="aaa";

        students.add(student4);
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println(students);
        Set<String> studentSet=new TreeSet<String>(students);
        System.out.println(studentSet);
    }
}
