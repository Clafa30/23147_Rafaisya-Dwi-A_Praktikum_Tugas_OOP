package Tugas5;

import java.util.Scanner;

public class PenghitungIMT {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
        	System.out.println("=======| Selamat datang di IMT Calculator! |=======");
            System.out.print("Masukkan berat badan (kg): ");
            double beratBadan = scanner.nextDouble();

            System.out.print("Masukkan tinggi badan (cm): "); 
            double tinggiBadanCm = scanner.nextDouble();

            // Mengonversi tinggi badan dari cm ke m
            double tinggiBadanM = konversiCmKeM(tinggiBadanCm);

            // validasi inputan tinggi badan
            if (tinggiBadanM == 0) {
                System.out.println("Tinggi badan tidak dapat sama dengan nol.");
                return;
            }

            // Menghitung IMT
            double imt = hitungImt(beratBadan, tinggiBadanM);

            // object untuk menentukan kriteria IMT
            String kriteriaKegemukan = tentukanKriteriaKegemukan(imt);

            System.out.printf("IMT: %.2f%n", imt);
            System.out.println(kriteriaKegemukan);
        } // scanner otomatis ditutup disini karena menggunakan try-with-resources
    }

    // Metode untuk mengonversi cm ke m
    public static double konversiCmKeM(double tinggiBadanCm) {
        return tinggiBadanCm / 100; 
    }

    // Metode untuk menghitung IMT
    public static double hitungImt(double beratBadan, double tinggiBadan) {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }

    // Metode untuk menentukan kriteria kegemukan berdasarkan IMT
    public static String tentukanKriteriaKegemukan(double imt) {
        if (imt < 18.4) {
            return "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            return "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            return "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            return "Gemuk";
        } else {
            return "Sangat Gemuk";
        }
    }
}