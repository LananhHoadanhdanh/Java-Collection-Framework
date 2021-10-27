package bai_TH_Product;

import bai_TH_Product.service.impl.ProductService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductService productList = new ProductService();
        while(true) {
            int choice = -1;
            Scanner scanner = new Scanner(System.in);
            try {
            System.out.println("Menu");
            System.out.println("1. Thêm phần tử vào danh sách");
            System.out.println("2. In danh sách");
            System.out.println("3. Xóa phần tử trong danh sách");
            System.out.println("4. Sửa phần tử trong danh sách");
            System.out.println("5. Tìm kiếm phần tử theo tên");
            System.out.println("6. Sắp xếp danh sách theo giá tăng dần");
            System.out.println("7. Sắp xếp danh sách theo giá giảm dần");
            System.out.println("0. Kết thúc chương trình");
            System.out.println("Vui lòng lựa chọn: ");
            choice = scanner.nextInt();
            } catch (Exception ignored) {
                System.out.println("Nhập số!");
            }
            switch (choice) {
                case 1:
                    productList.add(productList.createProduct());
                    break;
                case 2:
                    productList.print();
                    break;
                case 3:
                    System.out.print("Nhập id của sản phẩm cần xóa:");
                    int deleteId = scanner.nextInt();
                    productList.deleteById(deleteId);
                    break;
                case 4:
                    System.out.print("Nhập id của sản phẩm cần sửa: ");
                    int editId = scanner.nextInt();
                    if (productList.findIndexById(editId) != -1) {
                        productList.editById(editId, productList.createProduct());
                    } else {
                        System.out.println("Không có sản phẩm tương ứng với id này.");
                    }
                    break;
                case 5:
                    System.out.print("Nhập tên cần tìm kiếm: ");
                    String nameFind = scanner.nextLine();
                    productList.findByName(nameFind);
                    break;
                case 6:
                    productList.sortIncrease();
                    System.out.println("Danh sách đã được sắp xếp theo giá tăng dần.");
                    break;
                case 7:
                    productList.sortDecrease();
                    System.out.println("Danh sách đã được sắp xếp theo giá giảm dần.");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có tùy chọn!");
            }
        }
    }
}
