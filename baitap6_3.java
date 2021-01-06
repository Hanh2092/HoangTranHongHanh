package Baitap_vidu_Chuong6;

import java.util.Scanner;

public class baitap6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n (với n>0) : ");
        int n = scanner.nextInt();

        float result = P(n);
        if (n < 0) {
            System.out.println("\nn không hợp lệ!!!");
        } else
            System.out.println("\n"+result);

    }
    static float P(int n) {
        if (n == 1) {
            return 1;
        } else {
            return ((float)1/n+P(n-1));
        }
    }
}
