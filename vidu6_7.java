package Baitap_vidu_Chuong6;

import java.util.Scanner;

public class vidu6_7 {
    public static void main(String[] args) {
        String chuoi;
        int dodai;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chuỗi bất kì từ bàn phím: ");
        chuoi = scanner.nextLine();
        dodai = chuoi.length();
        System.out.println("chuỗi " + chuoi + " có độ dài = " + dodai);
    }
}
