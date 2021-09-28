package Ex5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a:");
		int a = sc.nextInt();
		System.out.println("Nhap b:");
		int b = sc.nextInt();
		while(a!=b) {
			if (a>b) {
				a-=b;
			}
			if (a<b) {
				b-=a;
			}
		}
		System.out.println("UCLN: "+a);
	}

}
