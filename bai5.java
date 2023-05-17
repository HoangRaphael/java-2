import java.util.Scanner;

public class bai5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int a = sc.nextInt();
        if(checkchinhphuong(a)){
            System.out.print(a + " la so chinh phuong");
        } else System.out.print(a + " khong phai la so chinh phuong");
    }
    static boolean checkchinhphuong(int b){
        double kq = Math.sqrt(b);
        return ((kq - Math.floor(kq)) == 0);
    }
}