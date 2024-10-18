package Tugas7;

import java.util.Scanner;

//semua inputan sudah diberikan validasi semua
public class Kasir {
    public static void main(String[] args) {
    	//try ini untuk menutup block scanner secara otomatis setelah digunakan, antisipasi resource leak.
        try (Scanner scanner = new Scanner(System.in)) {
			//array untuk menyimpan data barang
			String[] kodeBarang = {"a1", "a2", "a3", "a4", "a5"};
			String[] namaBarang = {"Permen", "Susu", "Mie", "Kopi", "Teh"};
			int[] hargaBarang = {15000, 10000, 12000, 8000, 5000};

			int n = 0;
			while (n <= 0) {
			    System.out.print("Masukkan jumlah barang yang dibeli (min-1): ");
			    if (scanner.hasNextInt()) {
			        n = scanner.nextInt();
			        if (n <= 0) {
			            System.out.println("\nJumlah barang harus lebih dari 0.\n");
			        }
			    } else {
			        System.out.println("\nHarus berupa angka.\n");
			        scanner.next();
			    }
			}
			
			//variabel untuk menyimpan nilai baru dari looping
			String[] kodeBeli = new String[n];
			String[] namaBeli = new String[n];
			int[] hargaBeli = new int[n];
			int[] jumlahBeli = new int[n];
			int[] jumlahBayar = new int[n];
			int totalBayar = 0;

			//input an kode barang sekaligus untuk menyimpan nilai ke variabel baru, untuk dipanggil di struk nanti
			for (int i = 0; i < n; i++) {
			    boolean validKode = false;
			    while (!validKode) {
			        System.out.print("Masukkan kode barang ke-" + (i + 1) + ": ");
			        kodeBeli[i] = scanner.next();

			        for (int j = 0; j < kodeBarang.length; j++) {
			            if (kodeBeli[i].equals(kodeBarang[j])) {
			                namaBeli[i] = namaBarang[j];
			                hargaBeli[i] = hargaBarang[j];
			                validKode = true;
			                break;
			            }
			        }

			        if (!validKode) {
			            System.out.println("\nKode barang tidak ditemukan.\n");
			        }
			    }
			    
			    //input an jumlah beli
			    boolean validJumlah = false;
			    while (!validJumlah) {
			        System.out.print("Masukkan jumlah beli " + namaBeli[i] + ": ");
			        if (scanner.hasNextInt()) {
			            jumlahBeli[i] = scanner.nextInt();
			            if (jumlahBeli[i] > 0) {
			                validJumlah = true;
			            } else {
			                System.out.println("Jumlah beli harus lebih dari 0.");
			            }
			        } else {
			            System.out.println("\nHarus berupa angka.\n");
			            scanner.next();
			        }
			    }
			    
			    //kalkulasi untuk total harga per-item dan jumlah yang harus dibayar
			    jumlahBayar[i] = hargaBeli[i] * jumlahBeli[i];
			    totalBayar += jumlahBayar[i];
			}

			System.out.println("\n=====================================================================================");
			System.out.println("\t\t\t--- Struk Pembelian Rafa Kidi ---");
			System.out.println("=====================================================================================");
			System.out.println("No\tKode Barang\tNama Barang\tHarga Satuan\tJumlah Beli\tJumlah Bayar");
			System.out.println("=====================================================================================");
			for (int i = 0; i < n; i++) {
			    System.out.println((i + 1) + "\t" + kodeBeli[i] + "\t\t" + namaBeli[i] + "\t\t" + hargaBeli[i] + "\t\t" + jumlahBeli[i] + "\t\t" + jumlahBayar[i]);
			}
			System.out.println("=====================================================================================");
			System.out.println("Total Bayar: " + totalBayar);
		}
        
        System.out.println("=====================================================================================");
        
    }
}
