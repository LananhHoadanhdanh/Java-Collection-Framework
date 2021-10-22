package bai_TH_Product.service.impl;

import bai_TH_Product.model.Product;
import bai_TH_Product.service.GeneralService;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService implements GeneralService<Product> {
    private ArrayList<Product> arrayList;

    public ProductService() {
        arrayList = new ArrayList<>();
    }

    public ProductService(ArrayList<Product> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public void print() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("___________________________");
    }

    @Override
    public void add(Product product) {
        arrayList.add(product);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void deleteById(int id) {
        if (findIndexById(id) != -1) {
            arrayList.remove(findIndexById(id));
        } else {
            System.out.println("Không có sản phẩm này");
        }

    }

    @Override
    public void editById(int id, Product product) {
        if (findIndexById(id) != -1) {
        arrayList.set(findIndexById(id), product);
        } else {
            System.out.println("Không có sản phẩm này");
        }
    }


    @Override
    public void findByName(String name) {
        boolean check = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(name)) {
                System.out.println(arrayList.get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không có sản phẩm có tên này!");
        }
    }

    @Override
    public void sortIncrease() {
        arrayList.sort((p1, p2) -> p1.getPrice() - p2.getPrice());
    }
    @Override
    public void sortDecrease() {
        arrayList.sort((p1, p2) -> p2.getPrice() - p1.getPrice());
    }

    @Override
    public Product createProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá: ");
        int price = scanner.nextInt();
        return new Product(id, name, price);
    }


}
