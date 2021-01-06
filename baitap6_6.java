package Baitap_vidu_Chuong6;

import java.util.Scanner;

public class baitap6_6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập chuỗi cần đếm: ");
            String s = scanner.nextLine();
            String[] dem = s.split(" ");
            System.out.println("Số từ trong chuỗi là: "+(dem.length));
        }
}
