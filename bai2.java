import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int var1 = sc.nextInt();
        if(var1%3==0){
          System.out.print(var1 + " Co chia het cho 3");
        } else System.out.print(var1 + " Khong chia het cho 3");
    }
    
}
