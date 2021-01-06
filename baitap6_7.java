package Baitap_vidu_Chuong6;

import java.util.Scanner;

public class baitap6_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi ban đầu: ");
        String s = scanner.nextLine();
        String[] words = s.split(" ");

        System.out.print("\nNhập từ muốn đếm: ");
        String x = scanner.next();

        int dem = 0;
        for (int i = 0; i < words.length; i++) {
            if (x.equals(words[i])) {
                dem++;
            }
        }
        System.out.println("Số lần xuất hiện của "+ x +" trong chuỗi là: "+ dem +" lần");
    }
}
