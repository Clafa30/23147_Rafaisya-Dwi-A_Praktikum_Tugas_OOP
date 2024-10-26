package Pertemuan8;

/**
 *
 * @author rafai
 */
public class HitungHari {
    public int hitung(int tahun, int bulan) {
        boolean leapYear = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);

        int jumlahHari;

        // Menggunakan if-else untuk menentukan jumlah hari
        if (bulan == 2) {
            jumlahHari = leapYear ? 29 : 28; // Februari
        } else if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
            jumlahHari = 30; // April, Juni, September, November
        } else {
            jumlahHari = 31; // Bulan lainnya
        }

        return jumlahHari;
    }
}
