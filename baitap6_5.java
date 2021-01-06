package Baitap_vidu_Chuong6;

import java.util.Scanner;

public class baitap6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyênn dương n: ");
        int n = scanner.nextInt();
        if (n<0) {
            System.out.println("\nn không hợp lệ!!!");
        } else {
            System.out.println("\n"+n+" có "+DemChuSo(n)+" chữ số");
        }
    }
    static int DemChuSo(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + DemChuSo(n/10);
        }
    }
}
