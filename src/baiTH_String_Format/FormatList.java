package baiTH_String_Format;

import tuDien_use_HashMap.Dictionary;

import java.util.ArrayList;

public class FormatList {
    private ArrayList<Format> formatArrayList;

    public FormatList() {
        formatArrayList = new ArrayList<>();
        formatArrayList.add(new Format("    d"," decimal integer"," byte, short, int, long"));
        formatArrayList.add(new Format("    f"," floating-point number"," float, double"));
        formatArrayList.add(new Format("    b"," Boolean"," Object"));
        formatArrayList.add(new Format("    B"," will uppercase the boolean"," Object"));
        formatArrayList.add(new Format("    c"," Character Capital"," String"));
        formatArrayList.add(new Format("    C"," will uppercase the letter"," String"));
        formatArrayList.add(new Format("    s"," String Capital"," String"));
        formatArrayList.add(new Format("    S"," will uppercase all the letters in the string"," String"));
        formatArrayList.add(new Format("    h"," hashcode - A hashcode is like an address."," Object"));
        formatArrayList.add(new Format("    n"," newline - Platform specific newline character"," "));
    }

    public static void printFullLine() {
        System.out.print("+");
        Dictionary.printLine(22);Dictionary.printLine(50);Dictionary.printLine(25);
        System.out.println();
    }
    public void print() {
        printFullLine();
        System.out.printf("|%-22s|%-50s|%-25s|%n", " Conversion-character", " Description", " Type");
        printFullLine();
        for (int i = 0; i < formatArrayList.size(); i++) {
            System.out.println(formatArrayList.get(i));
        }
        printFullLine();
    }

    public static void main(String[] args) {
        FormatList formatList = new FormatList();
        formatList.print();
    }
}
