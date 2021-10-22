package bai_TH_Product.service;

public interface GeneralService<T> {
    void print();
    void add(T t);
    int findIndexById(int id);
    void deleteById(int id);
    void editById(int id, T t);
    void findByName(String name);
    void sortIncrease();
    void sortDecrease();
    T createProduct();
}
