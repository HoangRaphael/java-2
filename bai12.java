import java.util.Scanner;
public class bai12 {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap so n: ");
            n = sc.nextInt();
        } while (n < 1);
        for (int i = 1; i <= n; i++) {
            sum = sum + i * i;
        }
         
        System.out.println("Ket qua: " + sum);
    }
 
}