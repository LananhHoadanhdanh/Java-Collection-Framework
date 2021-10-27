package person_manager_full.menu;

import person_manager_full.model.Student;
import person_manager_full.service.impl.PersonServiceImpl;
import person_manager_full.service.impl.StudentServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuStudent extends MenuService {

    public StudentServiceImpl createStudentList(PersonServiceImpl personService) {
        StudentServiceImpl studentService1 = new StudentServiceImpl();
        ArrayList<Student> studentService2 = new ArrayList<>();
        for (int i = 0; i < personService.size(); i++) {
            if (personService.getPersonList().get(i) instanceof Student){
                Student student = (Student) personService.getPersonList().get(i);
                studentService2.add(student);
            }
        }
        studentService1.setStudentList(studentService2);
        return studentService1;
    }

    public void sortIncreaseStudent() {
        StudentServiceImpl student2 = createStudentList(personService);
        student2.sortIncrease();
        student2.print();

    }
    public void sortDecreaseStudent() {
        StudentServiceImpl student3 = createStudentList(personService);
        student3.sortDecrease();
        student3.print();

    }
    public int getSumScoreStudent() {
        StudentServiceImpl student1 = createStudentList(personService);
        return  student1.getSumScore();
    }
    public void menuOption() {
        int choice = -1;
        while (true) {
            showMenu();
            Scanner scanner = new Scanner(System.in);
            try {
                choice = scanner.nextInt();
            } catch (Exception ignored) {
                System.out.println("Nhập số!");
            }
                switch (choice) {
                    case 1:
                        addObject();
                        break;
                    case 2:
                        printObject();
                        break;
                    case 3:
                        deleteObject();
                        break;
                    case 4:
                        editObject();
                        break;
                    case 5:
                        findObject();
                        break;
                    case 6:
                        sortIncreaseStudent();
                        break;
                    case 7:
                        sortDecreaseStudent();
                        break;
                    case 8:
                        System.out.println("Tổng điểm: " + getSumScoreStudent());
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Không có tùy chọn!");
                }
        }
    }
}
