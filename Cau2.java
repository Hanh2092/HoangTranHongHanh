import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] A = new int[n];

        //2.1
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ" + i + " : ");
            A[i] = scanner.nextInt();
        }
        System.out.print("\n Mảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        //2.2
        int dem = 0;
        System.out.println("\n Số giá trị chia hết cho 5 mà không chia hết cho 6: ");
        for (int i = 0; i < n; i++) {
            if (A[i] % 5 == 0 && A[i] % 6 != 0) {
                dem++;
            }
        }
        System.out.println(dem);

        //2.3
        int Dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                Dem++;
            }
        }
        System.out.print("\nCác phần tử mang số lẻ là: " + Dem);

        //2.4
        int TONG = 0;
        int TB = 0;
        for (int i = 0; i < n; i++) {
            TONG += A[i];
        }
        TB = TONG / n;
        for (int i = 0; i < n; i++) {
            if (A[i] >= TB) {
                Dem++;
            }
        }
        System.out.println("co" + Dem + "phần tử trong mảng A có giá trị lớn hơn hoặc bằng giá trị trung bình: ");
        //2.5
        int j = 0;
        int[] C = new int[n];
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 != 1) {
                C[i] = A[i];
                j++;
            }
        }
        System.out.println("Các phần tử của mảng là lẻ: ");
        for (int i = 0; i < n; i++) {
            System.out.println(C[i] + "");
        }
        //2.6
        int a = 0;
        System.out.println("\n Nhập số cần kiểm tra: ");
        int X = scanner.nextInt();
        for (int k = 0; k < n; k++) {
            if (A[k] == X) {
                a++;
            }
        }
        if (a >= 2) {
            System.out.println("Có tồn tại giá trị" + X + "Lặp lại trong mảng: ");
        } else {
            System.out.println("không tồn tại trong mảng" + X + "Lặp lại trong mảng: ");
        }
    }
}



