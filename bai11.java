import java.text.DecimalFormat;
import java.util.Scanner;
 
public class bai11{
 
    public static void main(String[] args) {
        float sum = 0;
        int n;
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        do {
            System.out.print("Nhap so n: ");
             n = sc.nextInt();
        } while (n < 1);
        for (int i = 1; i <= n; i++) {
            sum += (float) 1/i;
        }
         
        System.out.println("Ket qua: " + decimalFormat.format(sum));
    }
 
}