package Tugas1;

import java.util.Scanner;

public class DemoNilai {
	public static void main(String[] args) {
		//Disini saya menambahkan library scanner unntuk melakukan input dalam java
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Masukkan nama	: ");
        String nama = scanner.nextLine();

        System.out.println("Masukkan NIM	: ");
        long nim = scanner.nextLong();
        
		System.out.println("Masukkan nilai absen (0-100): ");
	    	double NilaiAbsen = scanner.nextDouble();
	
		System.out.println("Masukkan nilai Tugas (0-100): ");
			double NilaiTugas = scanner.nextDouble();

		System.out.println("Masukkan nilai UTS (0-100): ");
			double NilaiUTS = scanner.nextDouble();
		
		System.out.println("Masukkan nilai UAS (0-100): ");
			double NilaiUAS = scanner.nextDouble();
		//Untuk menutup scanner	
		scanner.close();
		
		Nilai nilai = new Nilai();
		nilai.setNilaiAbsen(NilaiAbsen);
        nilai.setNilaiTugas(NilaiTugas);
        nilai.setNilaiUTS(NilaiUTS);
        nilai.setNilaiUAS(NilaiUAS);
        
        System.out.println("-----------------------------");
        System.out.println("Nama	: " + nama);
        System.out.println("NIM	: " + nim);
        System.out.println("Nilai Absen: " + nilai.getNilaiAbsen());
        System.out.println("Nilai Tugas: " + nilai.getNilaiTugas());
        System.out.println("Nilai UTS  : " + nilai.getNilaiUTS());
        System.out.println("Nilai UAS  : " + nilai.getNilaiUAS());
		System.out.println("Nilai Akhir " + nama + " adalah " + nilai.getNilaiAkhir());
		
		System.out.println("");
		System.out.println("Tugas Ini Dibuat Oleh Rafa :>");
	}
}