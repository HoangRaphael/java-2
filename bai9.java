import java.util.Scanner;
public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int a= sc.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++){
            sum +=i;
        }
        System.out.print("Ket qua: "+ sum);
    }
}