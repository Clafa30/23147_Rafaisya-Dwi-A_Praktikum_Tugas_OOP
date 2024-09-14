package Tugas3;

public class KonversiSuhu2 extends KonversiSuhu {
    public double fahrenheitToReamur(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celciusToReamur(celsius);
        //untuk method ini melalui 3 tahapan yang pertama F° akan dikonversi ke C° dahulu baru setelah itu methood C° ke F° akan dipanggil
    }
}