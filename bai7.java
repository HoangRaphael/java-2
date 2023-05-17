import java.text.DecimalFormat;
import java.util.Scanner;
public class bai7 {

	public static void main(String[] args) {
		double nghiem;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so a: ");
		int a = sc.nextInt();
		System.out.print("Nhap so b: ");
		int b = sc.nextInt();
		System.out.println("Phuong trinh da nhap: " + a + "x + " + b + " = 0.");
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh co vo so nghiem.");
			} else {
				System.out.println("Phuong trinh vo nghiep.");
			}
		} else {
			nghiem = (double) -b / a;
			System.out.println("Phuong trinh co nghiem x = " + decimalFormat.format(nghiem) + ".");
		}
	}

}