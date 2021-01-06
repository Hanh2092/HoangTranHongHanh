package Baitap_vidu_Chuong6;

import java.util.Scanner;

public class vidu6_16 {
    public static void main(String[] args) {
        String chuoi;
        char kytu;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập vào một chuỗi bất kỳ: ");
            chuoi = scanner.nextLine();
        } while (chuoi.length() > 80);
        System.out.println("nhập vào ký tự cần đếm số lần xuất hiện: ");
        kytu = scanner.next().charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
            if (kytu == chuoi.charAt(i)) {
                count++;
            }
        }
        System.out.println("số lần xuất hiện của ký tự " + kytu + " trong chuỗi " + chuoi + " = " + count);


    }
}
