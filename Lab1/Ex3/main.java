package Ex3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = 0;
		boolean flag = false;
		if (n%2==0) {
			flag = true;
		}
		for (int i=0;i<=n;i++) {
			if (flag==true) {
				if(i%2==0) {
					s+=i;
				}
			}
			else {
				if(i%2!=0) {
					s+=i;
				}
			}
		}
		System.out.println(s);
	}

}
