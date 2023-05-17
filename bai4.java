import java.util.Scanner;

public class bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int var1 = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=var1/2;i++){
            if(var1%i==0){
                sum +=i;
             }
            }
            if(sum==var1){
                System.out.print(var1 + " la so hoan hao");
            } else System.out.print(var1 + " khong phai la so hoan hao");
        }
    }