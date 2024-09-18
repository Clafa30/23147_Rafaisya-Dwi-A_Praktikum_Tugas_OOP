package Tugas4;
import java.util.Scanner;

public class RuangMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner untuk input pengguna

        // Input untuk Balok
        System.out.println("===== Input Balok =====");
        System.out.print("Panjang: ");
        	double panjang = scanner.nextDouble();
        System.out.print("Lebar: ");
        	double lebar = scanner.nextDouble();
        System.out.print("Tinggi: ");
        	double tinggi = scanner.nextDouble();

        Balok balok = new Balok(panjang, lebar, tinggi);

        System.out.println("\nBalok:");
        System.out.printf("Volume: %.2f\n", balok.hitungVolume());
        System.out.printf("Luas Permukaan: %.2f\n", balok.hitungLuasPermukaan());

        // Input untuk Kubus
        System.out.println("\n===== Input Kubus =====");
        System.out.print("Sisi: ");
        	double sisi = scanner.nextDouble();

        Kubus kubus = new Kubus(sisi);

        System.out.println("\nKubus:");
        System.out.printf("Volume: %.2f\n", kubus.hitungVolume());
        System.out.printf("Luas Permukaan: %.2f\n", kubus.hitungLuasPermukaan());

        scanner.close();
        /*printf berfungsi agar saya dapat mengatur nilai desimalnya menjadi 00.00 karena hasil hitungannya
        dapat berupa bukan bilangan bulat*/
    }
}