import java.util.Scanner;

public class cau5 {
    boolean KTSNT(int n){
        for(int i =2; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        int n = s.nextInt();
        cau5 snt = new cau5();
        if(snt.KTSNT(n)){
            System.out.print("Số: " +n +" là số nguyên tố.");
        }else{
            System.out.print("Số: " +n +" không phải là số nguyên tố.");
        }
    }
}
