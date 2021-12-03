package com.sqa.no4;

import java.util.Scanner;

public class No4Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan sisa BBM dalam tangki (liter) = "); 
		double sisa = in.nextInt();
		System.out.println("Masukkan konsumsi BBM kendaraan (km/liter) = ");
		double jarakPerLiter = in.nextInt();
		double sisaJarak = hitungSisaJarak(sisa, jarakPerLiter);
		System.out.println("Kendaraan anda dapat menempuh jarak " +sisaJarak+ " dengan sisa BBM yang ada di tangki");
	}
		
	static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak= sisa*jarakPerLiter;
		return sisaJarak;
}
}
