package Baitap_vidu_Chuong6;

import java.util.Scanner;

public class baitap6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyênn dương n: ");
        int n = scanner.nextInt();
        int result = P(n);

        if (n <= 0) {
            System.out.println("\nn không hợp lệ!!!");
        } else
            System.out.println("\n"+result);
    }
    static int P(int n) {
        if (n == 0) {
            return 1;
        } else
            return ((n*2+1)*P(n-1));
    }
}
