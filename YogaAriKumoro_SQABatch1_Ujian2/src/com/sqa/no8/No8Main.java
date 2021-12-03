package com.sqa.no8;

public class No8Main {
	
	public static void main(String[] args) {
		No8Main simpedes = new No8Main("Tessy Wahyuni Riwayati Hartati", 89, 100000);
		System.out.println(simpedes.toString());
		System.out.println();
		
		No8Main tabanas = new No8Main ("Hindun",90);
		System.out.println(tabanas.toString());
	}
	
	@Override
	static void simpedes(String nama, int nomor, int saldo ) {
		System.out.println("Tabungan nomor" +nomor+ "atas nama " +nama+ " dengan saldo sebesar " +saldo);
	}
	@Override
	static void tabanas(String nama, int nomor) {
		System.out.println("Tabungan nomor " +nomor+ " atas nama " +nama+ " dengan saldo sebesar 0");
	}
}
