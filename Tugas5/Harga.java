package Tugas5;

public class Harga implements Diskon {
    
    @Override
    public double[] hitungDiskon(double harga) {
        double potongan;
        
        // Pengkondisian untuk menentukan diskonan
        if (harga < 50000) {
            potongan = 0.05;
        } else {
            potongan = 0.20; 
        }
       
        double jumlahPotongan = harga * potongan;
        double hargaSetelahDiskon = harga - jumlahPotongan;
        // harga dikali diskonan berapa persen
        // misal disc 0.05, maka (20000 * 0.05 = 1000 ) 
        // jadi harga setelah diskon 20000 - 1000 = 19000
        

        return new double[] {hargaSetelahDiskon, jumlahPotongan};
    }
 }
