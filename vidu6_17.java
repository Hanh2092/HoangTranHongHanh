package Baitap_vidu_Chuong6;

import java.util.Scanner;

public class vidu6_17 {
    public static void main(String[] args) {
        String chuoi;
        int sokytuinhoa = 0, sokytuinthuong = 0, sochuso = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập vào 1 chuỗi bấy kỳ: ");
            chuoi = scanner.nextLine();
        } while (chuoi.length() > 80);
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isUpperCase(chuoi.charAt(i))) {
                sokytuinhoa++;
            }
            if (Character.isLowerCase(chuoi.charAt(i))) {
                sokytuinthuong++;
            }
         if (Character.isDigit(i)) {
            sochuso++;
        }
    }
        System.out.println("trong chuỗi " + chuoi + " có " + sokytuinhoa + " ký tự in hoa," + " có " + sokytuinthuong + " ký tự in thường " + " và có " + sochuso + " số." );
    }
}
