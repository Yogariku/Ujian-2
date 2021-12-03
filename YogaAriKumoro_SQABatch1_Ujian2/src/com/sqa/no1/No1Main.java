package com.sqa.no1;

import java.util.Scanner;

public class No1Main {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan nilai maksimal deret = ");
		int batas = in.nextInt();
		cetakFibonacci(batas);

	}
	
	static void cetakFibonacci (int batas) {
		
		int x = 1;
        int y = 1;
        int fibonacci = 1;
        for (int i =1; i <= batas; i++){
            System.out.print(y + " ");
            fibonacci = x + y;
            x = y;
            y = fibonacci;
		
	}	
}
}
