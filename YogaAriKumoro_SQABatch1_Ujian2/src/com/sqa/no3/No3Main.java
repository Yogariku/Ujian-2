package com.sqa.no3;

import java.util.Scanner;

public class No3Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Masukkan jarak (dalam kilometer) = "); 
		int jarak = in.nextInt();
		System.out.println("Masukkan waktu (dalam jam) = ");
		int waktu = in.nextInt();
		int cepat = hitungKecepatan(jarak, waktu);
		System.out.println("Kecepatan rata-rata anda adalah " +cepat+ "km/jam");
	
	}
	static int hitungKecepatan(int jarak, int waktu) {
		int cepat= jarak/waktu;
		return cepat;
	}	
		
}
