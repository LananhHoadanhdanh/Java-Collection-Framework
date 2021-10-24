package baiTH_String_Format;

public class Main {
    public static void main(String[] args) {
        // Quy tắc: %[flags][width][.precision]conversion-character

        //flags:    -               căn sang lề trái, mặc định không có là lề phải
        //          +               thêm dấu âm hoặc dương cho số
        //          0               thêm số 0 vào phần sau dấy phẩy thập phân (mặc định là không có)
        //          ,               thêm dấu phẩy thập phân
        //          space           thêm dấu cách đằng trước

        //width:                    độ rộng, số kí tự có thể chứa

        //.precision                lấy mấy số sau dấy phẩy thập phân

        //conversion-character      Kiểu dữ liệu muốn in ra

        System.out.printf("%f %n", 12345678.911);
        System.out.printf("%f %n", -12345678.911);

        System.out.println();

        // flag: , (comma)
        System.out.printf("%,f %n", 12345678.911);
        System.out.printf("%,f %n", -12345678.911);

        System.out.println();

        // flags:  , (space + comma)
        System.out.printf("% ,f %n", 12345678.911);
        System.out.printf("% ,f %n", -12345678.911);

        System.out.println();

        // flag: , (comma) & precision: .2
        System.out.printf("%,.2f %n", 12345678.911);
        // flag: , (comma) & precision: .3
        System.out.printf("%,.3f %n", -12345678.911);

        System.out.println();

        // flags:  , (space + comma) & precision: .2
        System.out.printf("% ,.2f %n", 12345678.911);
        // flags:  , (space + comma) & precision: .3
        System.out.printf("% ,.3f %n", -12345678.911);
    }
}
