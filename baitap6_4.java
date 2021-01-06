package Baitap_vidu_Chuong6;

import java.util.Scanner;

public class baitap6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("n không hợp lệ !!!");
        } else {
            System.out.print("Đổi sang hệ nhị phân của " + n + " là: ");
            NhiPhan(n);
        }
    }

    static void NhiPhan(int n) {
        int phanDu;
        if (n <= 1) {
            System.out.print(n);
            return;
        } else {
            phanDu = n % 2;
            NhiPhan(n >> 1);
            System.out.print(phanDu);
        }
    }
}
