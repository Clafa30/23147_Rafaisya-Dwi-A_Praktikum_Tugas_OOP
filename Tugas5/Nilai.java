package Tugas5;

public class Nilai {
    public static double hitungNilaiAkhir(double kehadiran, double tugas, double uts, double uas) {
        return (0.1 * kehadiran) + (0.2 * tugas) + (0.3 * uts) + (0.4 * uas);
    }

    public static String[] tentukanGrade(double nilaiAkhir) {
        String grade;
        String keterangan;

        if (nilaiAkhir >= 0 && nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "KURANG SEKALI";
        } else if (nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else if (nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir <= 100) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else {
            grade = "Tidak Valid";
            keterangan = "Nilai tidak valid";
        }

        return new String[]{grade, keterangan};
    }
}