import java.util.Scanner;

public class bai14 {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
         System.out.print("Nhap so n: ");
        int n = sc.nextInt();
        int b[] = new int[n];
         System.out.println("Nhap mang: ");
        for(int i=0;i<n;i++){
            System.out.print("Nhap i[" + i + "]: ");
            b[i] = sc.nextInt();
        }
         System.out.print("Mang da nhap: ");
        for(int i=0;i<n;i++){
            System.out.print(b[i] + " ");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (b[i] > b[j]) {
                   int temp = b[j];
                    b[j] = b[i];
                    b[i] = temp;
                }
            }
        }
         System.out.print("\nMang sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
         System.out.print("\nTong cac phan tu chan: ");
        int sum=0;
        for(int i=0;i<n;i++){
            if(b[i]%2==0){
                sum+=b[i];
            }
        }
         System.out.print(sum);
}


}