package BaiTap_Video_Chuong5;

import java.util.Scanner;

public class baitap5_2 {
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

        System.out.print("Nhập giá trị muốn tìm kiếm: ");
        int check = scanner.nextInt();

        System.out.print(check+" nằm ở vị trí: ");
        for (int i = 0; i < n; i++) {
            if(check == a[i]) {
                System.out.print((i) + " ");
            }
        }

    }
}
