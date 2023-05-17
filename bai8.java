import java.util.Scanner;
public class bai8 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so a = ");
    int a = sc.nextInt();
    System.out.print("Nhap so b = ");
    int b = sc.nextInt();
    System.out.println("UCLN cua " + a + " va " + b + " la: " + UCLN(a, b));
}
public static int UCLN(int a, int b){
    if (b == 0) return a;
    return UCLN(b, a % b);
   }
}
