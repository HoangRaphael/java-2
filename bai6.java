import java.util.Scanner;

public class bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen a: ");
        int a = sc.nextInt();
        System.out.print("Nhap so nguyen b: ");
        int b = sc.nextInt();
        int max = a;
        if(max>b){
             System.out.print("So lon nhat la: " + a);
        } else System.out.print("So lon nhat la: " + b);
    }
    
}
