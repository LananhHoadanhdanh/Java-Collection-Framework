package person_manager_full;

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

    public void sortIncrease() {
        StudentServiceImpl student2 = createStudentList(personService);
        student2.sortIncrease();
        student2.print();

    }
    public void sortDecrease() {
        StudentServiceImpl student3 = createStudentList(personService);
        student3.sortDecrease();
        student3.print();

    }
    public int getSumScore() {
        StudentServiceImpl student1 = createStudentList(personService);
        return  student1.getSumScore();
    }

    public void menuOption() {
        int choice = -1;
        while (choice != 0) {
            showMenu();
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        addObject();
                        break;
                    case 2:
                        printProject();
                        break;
                    case 3:
                        deleteProject();
                        break;
                    case 4:
                        editProject();
                        break;
                    case 5:
                        findObject();
                        break;
                    case 6:
                        sortIncrease();
                        break;
                    case 7:
                        sortDecrease();
                        break;
                    case 8:
                        System.out.println("Tổng điểm: " + getSumScore());
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Không có tùy chọn!");
            }
        }
    }
}
