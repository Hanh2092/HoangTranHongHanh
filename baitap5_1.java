package BaiTap_Video_Chuong5;

import java.util.Scanner;

public class baitap5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập giá trị cho phần tử ["+i+"]: ");
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        System.out.println("\nKết Qủa: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
