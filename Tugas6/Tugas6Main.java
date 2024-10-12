package Tugas6;

import java.util.Scanner;

public class Tugas6Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Pilih Program =====");
            System.out.println("1. Cek Bilangan Prima");
            System.out.println("2. Deret Bilangan Ganjil dan Genap");
            System.out.println("3. Lirik Lagu Anak Ayam");
            System.out.println("4. Reverse Huruf A-Z");
            System.out.println("5. Tabel Perkalian 2D");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    CekPrima();
                    break;
                case 2:
                    DeretBilangan();
                    break;
                case 3:
                    Lagu();
                    break;
                case 4:
                    ReverseHuruf();
                    break;
                case 5:
                    Perkalian2D();
                    break;
                case 0:
                    System.out.println("\nKeluar Dari Program Tugas 6.\n\nProgram dibuat Oleh Rafaisya Dwi Adrianto");
                    break;
                default:
                    System.out.println("\nTidak Ada Program Tersebut, silakan coba lagi.\n");
            }
        } while (choice != 0);

        scanner.close();
    }
    
    // method Untuk mengecek bilangan prima 0-20
    private static void CekPrima() {
        StringBuilder primes = new StringBuilder("Deret bilangan prima: ");
        StringBuilder nonPrimes = new StringBuilder("Deret bilangan bukan prima: ");

        for (int i = 1; i <= 20; i++) {
            if (isPrime(i)) {
                primes.append(i).append(" ");
            } else {
                nonPrimes.append(i).append(" ");
            }
        }

        System.out.println("\n=====Cek Bilangan Prima=====");
        System.out.println(primes.toString());
        System.out.println(nonPrimes.toString());
        System.out.println("============================\n");
    }

    private static boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int j = 2; j * j <= num; ++j) {
            if (num % j == 0) return false;
        }
        return true;
    }

    // method buat cek deret ganjil genap
    private static void DeretBilangan() {
        int oddCounter = 0;
        int evenCounter = 0;
        StringBuilder oddNumbers = new StringBuilder("Bilangan ganjil: ");
        StringBuilder evenNumbers = new StringBuilder("Bilangan genap: ");

        for (int number = 1; number < 21; ++number) {
            if (number % 2 == 0) {
                evenCounter++;
                evenNumbers.append(number).append(" ");
            } else {
                oddCounter++;
                oddNumbers.append(number).append(" ");
            }
        }

        System.out.println("\n=====Jumlah Deret=====");
        System.out.printf("Jumlah deret bilangan ganjil: %d%n", oddCounter);
        System.out.printf("Jumlah deret bilangan genap: %d%n", evenCounter);
        System.out.println("\n=====Angka Dalam Deret=====");
        System.out.println(oddNumbers.toString());
        System.out.println(evenNumbers.toString());
        System.out.println();
    }

    // method buat output in lagu anak ayam ke-n
    private static void Lagu() {
        String song = "";
        int countBirds = 5;

        while (countBirds > 0) {
            if (countBirds == 5) {
                song += "Anak ayam turun " + countBirds + "\n";
            } else if (countBirds == 1) {
                song += "Anak ayam turun " + countBirds + ", mati satu tinggal induknya";
            } else {
                song += "Anak ayam turun " + countBirds + ", mati satu tinggal " + (countBirds - 1) + ".\n";
            }
            countBirds--;
        }
        System.out.println("\n=========================");
        System.out.println(song);
        System.out.println("=========================\n");
    }

    // method buat ngereverse huruf a-z
    private static void ReverseHuruf() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder reversedAlphabet = new StringBuilder();

        for (int i = alphabet.length() - 1; i >= 0; i--) {
            reversedAlphabet.append(alphabet.charAt(i));
        }

        System.out.println("\n=====Sebelum Direverse=====");
        System.out.println("Huruf A-Z: " + alphabet);
        System.out.println("\n=====Sesudah Direverse=====");
        System.out.println("Huruf Z-A: " + reversedAlphabet.toString() + "\n");
    }

    // method untuk membuat perkalian array 2 dimensi (n=5)
    private static void Perkalian2D() {
        int size = 5;
        
        System.out.println("\n===============================");
        System.out.print("\t");
        for (int i = 1; i <= size; i++) {
            System.out.print(i + "\t");
        }
        
        System.out.println();

        for (int row = 1; row <= size; row++) {
            System.out.print(row + "\t");
            for (int column = 1; column <= size; column++) {
                System.out.print(row * column + "\t");
            }
            System.out.println();
        }
        System.out.println("===============================\n");
    } 
}