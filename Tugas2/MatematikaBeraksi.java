package Tugas2;

public class MatematikaBeraksi {
	 public static void main(String[] args) {
	        Matematika matematika = new Matematika();

	        // Pertambahan
	        int hasilPertambahan = matematika.addition(20, 10);
	        System.out.println("Pertambahan : 20 + 10 = " + hasilPertambahan);

	        // Pengurangan
	        int hasilPengurangan = matematika.subtraction(10, 5);
	        System.out.println("Pengurangan : 10 - 5 = " + hasilPengurangan);

	        // Perkalian
	        int hasilPerkalian = matematika.multiplication(10, 3);
	        System.out.println("Perkalian : 10 * 3 = " + hasilPerkalian);

	        // Pembagian
	        int hasilPembagian = matematika.division(21, 2);
	        System.out.println("Pembagian : 21 / 2 = " + hasilPembagian);
	    }
}
