package person_manager_full.service.impl;

import person_manager_full.model.Person;
import person_manager_full.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentServiceImpl extends PersonServiceImpl {
    private ArrayList<Student> studentList;
    private int sum = 0;

    public StudentServiceImpl() {
        this.studentList = new ArrayList<>();
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public int getSumScore() {
        for (int i = 0; i < studentList.size(); i++) {
            sum += studentList.get(i).getAverageScore();
        }
        return sum;
    }

    public void sortIncrease() {
        studentList.sort((p1, p2) -> p1.getAverageScore() - p2.getAverageScore());
    }

    public void sortDecrease() {
        studentList.sort((p1, p2) -> p2.getAverageScore() - p1.getAverageScore());
    }


    @Override
    public void print() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
        System.out.println("___________________________");
    }

    public Person getElement(int index) {
        return studentList.get(index);
    }

    public static Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        int averageScore = scanner.nextInt();
        return new Student(name, age, averageScore);
    }
}
