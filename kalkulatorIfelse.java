
import java.util.*;
public class kalkulatorIfelse {
    public static void main(String[] args) {
        Scanner yourinput;
        float a, b, hasil;
        char operator;

        yourinput = new Scanner(System.in);

        System.out.print("Nilai a= ");
        a = yourinput.nextFloat();
        System.out.print("Operator = ");
        operator = yourinput.next().charAt(0);
        System.out.print("Nilai b = ");
        b = yourinput.nextFloat();

        System.out.println("Input User : " + a + " " + operator + " " + b);

        //operator tersedia */+-
        if (operator == '+') {
            hasil =a+b;
            System.out.println("hasil "+hasil);
        } else if (operator == '-') {
            hasil=a-b;
            System.out.println("Hasil "+hasil);
        } else if (operator == '*') {
            hasil=a*b;
            System.out.println("hasil "+hasil);
        } else if (operator == '/') {
         if (b == 0){
             System.out.println("Pembagian tak hingga 0");
         }else{
             hasil=a/b;
             System.out.println("hasil "+hasil);
         }
        }else{
            System.out.println("Hasil not found :( ");
        }

    }
}
