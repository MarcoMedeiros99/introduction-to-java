package primeiro_programa;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		int x;
		
		System.out.print("Digite sua idade: ");
		x = sc.nextInt();
		sc.nextLine();
		System.out.print("digite uma palavra :");
		s1 = sc.nextLine();
		System.out.print("digite uma palavra :");
		s2 = sc.nextLine();
		System.out.print("digite uma palavra :");
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
	
}