package Tugas5;

import java.util.Scanner;
import java.util.InputMismatchException;
/* Library untuk mempermudah validasi inputan, 
agak bisa balik ke awal apabila ada salah input
yang tidak sesuai dengan yang ditentuin*/

public class MahasiswaMain {
    
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
            // Input data mahasiswa
            String npm = inputNPM(scanner);
            
            System.out.print("Nama Mahasiswa: ");
            String namaMahasiswa = scanner.nextLine(); // Membaca nama mahasiswa

            double nilaiKehadiran = inputNilai(scanner, "Nilai Kehadiran: ");
            double nilaiTugas = inputNilai(scanner, "Nilai Tugas: ");
            double nilaiUTS = inputNilai(scanner, "Nilai UTS: ");
            double nilaiUAS = inputNilai(scanner, "Nilai UAS: ");

            Mahasiswa mahasiswa = new Mahasiswa(npm, namaMahasiswa, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);

            // Menghitung dan menampilkan hasil
            tampilkanOutput(mahasiswa);
        }// scanner otomatis 
	}

    private static String inputNPM(Scanner scanner) {
        while (true) {
            System.out.print("NPM: ");
            String npmInput = scanner.nextLine();
            if (npmInput.matches("\\d+")) { // buat memvalidasi NPM hanya terdiri dari angka
                return npmInput;
            } else {
                System.out.println("Error: NPM harus berupa angka. Silakan masukkan kembali.");
            }
        }
    }

    private static double inputNilai(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double nilai = scanner.nextDouble();
                if (nilai >= 0 && nilai <= 100) { // buat ngevalidasi kalau variabel nilai cuman bisa diisi dengan ketentuan >0 & <100
                    return nilai;
                } else {
                    System.out.println("Error: Nilai harus antara 0 dan 100. Silakan masukkan kembali.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Input tidak valid. Harap masukkan angka.");
                scanner.next(); // Menghapus input yang salah
            }
        }
    }

    private static void tampilkanOutput(Mahasiswa mahasiswa) {
        double nilaiAkhir = Nilai.hitungNilaiAkhir(mahasiswa.getNilaiKehadiran(), mahasiswa.getNilaiTugas(), mahasiswa.getNilaiUTS(), mahasiswa.getNilaiUAS());
        
        String[] hasil = Nilai.tentukanGrade(nilaiAkhir);
        
        System.out.println("\nTampilan Output:");
        System.out.println("NPM Mahasiswa: " + mahasiswa.getNpm());
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.printf("Nilai Rata-rata: %.2f\n", nilaiAkhir);
        System.out.println("Grade: " + hasil[0]);
        System.out.println("Keterangan: " + hasil[1]);
    }
}