package Tugas3;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();
        
        double celsius = 25;
        double fahrenheit = konversi.celciusToFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
 
        double reamur = konversi.celciusToReamur(celsius);
        System.out.println(celsius + "°C = " + reamur + "°Re");
        
        double fahrenheitValue = 77;
        double reamurFromFahrenheit = konversi.fahrenheitToReamur(fahrenheitValue);
        System.out.println(fahrenheitValue + "°F = " + reamurFromFahrenheit + "°Re");
    }
}