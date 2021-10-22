package comparable_and_omparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Kien", 30, "HT"));
        studentList.add(new Student("Anh", 25, "HN"));
        studentList.add(new Student("Bao", 27, "PT"));
        studentList.add(new Student("Hong", 29, "QN"));

        for(Student student : studentList){
            System.out.println(student);
        }
        System.out.println("______________________");

        Collections.sort(studentList);
        System.out.println("So sanh theo tên:");
        for(Student student : studentList){
            System.out.println(student);
        }
        System.out.println("______________________");

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student student : studentList){
            System.out.println(student.toString());
        }
        System.out.println("______________________");
    }
}
