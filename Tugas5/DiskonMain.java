package Tugas5;

import java.util.Scanner;

public class DiskonMain {
    public static void main(String[] args) {
       try( Scanner scanner = new Scanner(System.in)){

        System.out.println("=======| Selamat datang di AlfaKidi! |=======");
        System.out.print("Masukkan total pembelian: ");
        double totalPembelian = scanner.nextDouble();

        // Membuat objek Harga
        Harga harga = new Harga();

        // Menghitung harga setelah diskon menggunakan objek harga
        double[] result = harga.hitungDiskon(totalPembelian);

       
        System.out.printf("Diskon Yang Diperoleh: %.2f%n", result[1]);// result untuk menyimpan diskon
        System.out.printf("Harga setelah diskon: %.2f%n", result[0]);// result buat menyimpan harga setelah didiskon
       
       }
    }
}