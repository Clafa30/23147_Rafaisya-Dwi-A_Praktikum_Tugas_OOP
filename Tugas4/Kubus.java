package Tugas4;

class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }//math.pow berguna untuk memperpendek sintaks (sisi, 3) artinya sisi^3

    @Override
    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);//ini artinya sisi^2
    }
}