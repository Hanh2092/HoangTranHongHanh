package OnTapCuoiChuong;

import java.util.Scanner;

public class BT2 {
    public static long TinhGiaiThua(int n) {
        if (n > 0) {
            return n * TinhGiaiThua(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Giai Thừa của " + n + " la :" + TinhGiaiThua(n));
    }
}
