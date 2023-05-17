import java.util.Scanner;

public class bai13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n= sc.nextInt();
        long sum=0;
        for(int i=1;i<=n;i++){
            sum = sum + bai13.tinhGiaithua(i);
        }
        System.out.print("Ket qua: " + sum);
    }
    public static long tinhGiaithua(int n) {
        long giaithua = 1;
        if (n == 0 || n == 1) {
            return giaithua;
        } else {
            for (int i = 2; i <= n; i++) {
                giaithua *= i;
            }
            return giaithua;
        }
    }
}
