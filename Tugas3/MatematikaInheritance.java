package Tugas3;
import java.util.Scanner; // library scanner untuk membuat syntax input

public class MatematikaInheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Masukan Nilai a: ");
        int a = input.nextInt(); // inputan value a

        System.out.print("Masukan Nilai b: ");
        int b = input.nextInt(); // input an value b

        Matematika2 math = new Matematika2();
        
        //memanggil seluruh method matematika dan matematika2
        int add = math.addition(a, b);
        int sub = math.subtraction(a, b);
        int mul = math.multiplication(a, b);
        int div = math.division(a, b);
        int mod = math.mod(a, b); 

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
        
        input.close(); //menutup scanner untuk efisiensi memori
    }
}