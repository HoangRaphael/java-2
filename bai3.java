import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Nhap so nguyen: ");
     int var1 = sc.nextInt();
     if(checkvar1(var1)){
        System.out.print(var1 + " la so nguyen to");
     } else System.out.print(var1 + " khong phai la so nguyen to");
    }
    public static boolean checkvar1(int var1){
if(var1<=1){
    return false;
} for(int i=2;i<= Math.sqrt(var1);i++){
    if(var1%i==0){
        return false;
          }
       } return true;
    }
}
