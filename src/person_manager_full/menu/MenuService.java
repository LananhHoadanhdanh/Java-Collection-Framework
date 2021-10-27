package person_manager_full.menu;

import person_manager_full.model.Person;
import person_manager_full.model.Student;
import person_manager_full.model.Teacher;
import person_manager_full.service.impl.PersonServiceImpl;
import person_manager_full.service.impl.StudentServiceImpl;
import person_manager_full.service.impl.TeacherServiceImpl;

import java.util.Scanner;

public class MenuService {
    PersonServiceImpl personService = new PersonServiceImpl();
    public void showMenu() {
        System.out.println("Menu");
        System.out.println("1. Thêm người vào danh sách");
        System.out.println("2. In danh sách");
        System.out.println("3. Xóa thành viên trong danh sách");
        System.out.println("4. Sửa thành viên trong danh sách");
        System.out.println("5. Tìm kiếm thành viên theo tên");
        System.out.println("6. Sắp xếp danh sách theo điểm tăng dần");
        System.out.println("7. Sắp xếp danh sách theo điểm giảm dần");
        System.out.println("8. Tính tổng điểm");
        System.out.println("0. Kết thúc chương trình");
        System.out.println("Vui lòng lựa chọn: ");
    }
    public void addObject() {
        int option = -1;
        while (option != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập tùy chọn: ");
            System.out.println("1. Thêm học sinh");
            System.out.println("2. Thêm giáo viên");
            System.out.println("0. Hoạt động khác");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    personService.add(StudentServiceImpl.createStudent());
                    break;
                case 2:
                    personService.add(TeacherServiceImpl.createTeacher());
                    break;
                case 0:
                    System.out.println("Mời thực hiện những hành động tiếp theo.");
                    break;
                default:
                    System.out.println("Không có tùy chọn!");
            }
        }
    }

    public void printObject() {
        personService.print();
    }
    public void deleteObject() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id của học sinh cần xóa: ");
        int deleteId = scanner.nextInt();
        personService.deleteById(deleteId);
    }
    public void editObject() {
        System.out.print("Nhập id của thành viên cần sửa: ");
        Scanner scanner = new Scanner(System.in);
        int editId = scanner.nextInt();
        int index = personService.findIndexById(editId);
        if (index != -1) {
            if (personService.getElement(index) instanceof Teacher) {
                personService.editById(editId, TeacherServiceImpl.createTeacher());
            }
            if (personService.getElement(index) instanceof Student) {
                personService.editById(editId, StudentServiceImpl.createStudent());
            }
        } else {
            System.out.println("Không có học sinh tương ứng với id này.");
        }
    }
    public void findObject() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên cần tìm kiếm: ");
        String nameFind = scanner.nextLine();
        personService.findByName(nameFind);
    }
}
