package Baitap_vidu_Chuong6;

public class vidu6_3 {
    static int factorial(int n) {
        if (n == 1)
            return 1;
           else
               return (n * factorial(n - 1));

    }

    public static void main(String[] args) {
        System.out.println("giai thừa của 5 là: " + factorial(5));
    }
}
