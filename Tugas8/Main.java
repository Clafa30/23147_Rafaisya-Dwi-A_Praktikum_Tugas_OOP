package Pertemuan8;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("----|| Tugas Pertemuan 8 GUI ||----");
            System.out.println("1. Kalkulator\n2. Penentu Jumlah Hari\n0. Keluar");
            System.out.println("Masukan Opsi : ");

            while (true) {
                try {
                    choice = scanner.nextInt();
                    if (choice < 0 || choice > 2) {
                        System.out.print("Invalid option. Masukkan lagi: ");
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.print("Invalid input. Masukkan angka 0, 1, atau 2: ");
                    scanner.next();
                }
            }

            if (choice == 0) {
                System.out.println("Keluar dari Program program.");
                break;
            }

            switch (choice) {
                case 1:
                    // Memanggil kelas Kalkulator
                    Kalkulator.run();
                    break;

                case 2:
                    // Memanggil kelas PenentuJumlahHari
                    PenentuJumlahHari.run();
                    break;

                default:
                    System.out.println("Opsi tidak ditemukan.");
                    break;
            }
        }

        scanner.close();
    }
}
