import java.util.Scanner;

public class Cau1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp m: ");
        int m = scanner.nextInt();
        if (m % 2 == 0) {
            System.out.println(m + " Là số chẵn: ");
        } else {
            System.out.println(m + " Là số lẽ: ");
        }
    }
}