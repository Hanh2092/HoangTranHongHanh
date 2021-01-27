package BaiTap_Video_Chuong5;

import java.util.Scanner;

public class baitap5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập giá trị cho phần tử [" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("\nGiá trị lớn nhất là: " + max);
    }
}
