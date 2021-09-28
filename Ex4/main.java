package Ex4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("PT:ax+b=0");
		System.out.println("Nhap a:");
		int a = sc.nextInt();
		System.out.println("Nhap b:");
		int b = sc.nextInt();
		if (a==0) {
			if(b==0) {
				System.out.println("Vo so nghiem");
			}
			else {
				System.out.println("Vo nghiem");
			}
		}
		else {
			int x = -b/a;
			System.out.println("x= "+x);
		}
	}

}
