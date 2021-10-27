package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a,b");
		int a = sc.nextInt();
		int b = sc.nextInt();	
		
		int tong = a + b;
		System.out.print("Tong:\n " + (a+b));
		int hieu = a - b;
		System.out.print("Hieu: " + hieu);
		int nhan = a * b;
		System.out.print("Nhan: " + nhan);
		int chia = a / b;
		System.out.print("Chia: " +chia);
		
		// Gan c
		boolean c = a > b;
		System.out.println("so sanh hon : " + c);
		c = a < b;
		System.out.println("so sanh nho: " + c);
		c = a <= b;
		System.out.println("so sanh be hon bang: " + c);
		c = b <= a;
		System.out.println("so sanh lon hon bang: " + c);
		
		
		
		
		
		
	
		
		
		
		
		
		
		

	}

}
