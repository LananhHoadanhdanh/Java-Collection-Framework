package tuDien_use_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Dictionary {
    private Map<String, String> myDictionary;

    public Dictionary() {
        myDictionary = new HashMap<>();
        myDictionary.put("red", "Màu Đỏ");
        myDictionary.put("blue", "Xanh Dương");
        myDictionary.put("white", "Trắng");
        myDictionary.put("green", "Xanh");
        myDictionary.put("yellow", "Vàng");
        myDictionary.put("pink", "Màu Hồng");
        myDictionary.put("black", "Đen");
        myDictionary.put("orange", "Màu Da Cam");
        myDictionary.put("brown", "Màu Nâu");
        myDictionary.put("purple", "Tím");

    }

    public void add() {
        System.out.println("Nhập từ tiếng Anh: ");
        String addKey = typePhrase();
        System.out.println("Nhập nghĩa: ");
        String addValue = typePhrase();
        myDictionary.put(addKey, addValue);
        System.out.println("Đã thêm!");
    }

    public void search() {
        System.out.println("Nhập từ cần tìm kiếm: ");
        String findKey = typePhrase();
        if (checkKey(findKey)){
            System.out.println(myDictionary.get(findKey));
        } else {
            System.out.println("no");
        }

    }
    public boolean checkKey(String key){
        return myDictionary.containsKey(key);

    }

    public void printLine(int space) {
        for (int i = 0; i <= space; i++) {
            if (i == space) {
                System.out.print("+");
            } else {
                System.out.print("-");
            }
        }
    }
    public void printFullLine() {
        System.out.print("+");printLine(20);printLine(25);
        System.out.println();
    }

    public void print() {
        Set<String> keys = myDictionary.keySet();
        printFullLine();
        System.out.printf("|%-20s|%-25s|%n", "English", "Vietnamese");
        printFullLine();
        for (String key : keys) {
            System.out.printf("|%-20s|%-25s|%n",key,myDictionary.get(key));
        }
        printFullLine();
    }

    public String typePhrase(){
        Scanner scanner= new Scanner(System.in);
        String findKey = scanner.nextLine();
        return findKey.trim().toLowerCase();
    }
}
