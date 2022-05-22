
import java.util.*;
public class kalkulatorSwitchcase {
    public static void main(String[] args){
         Scanner yourinput;
        float a,b, hasil;
         String operator;

       yourinput = new Scanner(System.in);
        System.out.print("Masukan angka pertama >> ");
        a=yourinput.nextFloat();
        System.out.print("Pilih operator >> ");
        operator=yourinput.next();
        System.out.print("Masukan angka kedua >> ");
        b=yourinput.nextFloat();

        switch (operator){
            case "*":
                hasil=a*b;
                System.out.println("Apes bener gue kemaren nyebur ke kali :| "+hasil);
                break;
            case "/":
                hasil =a/b;
                System.out.println("lu pikir hati gue kaya kue ulang tahun, yang bisa dibagi bagi kaya gitu aja? "+hasil);
                break;
            case "+":
                hasil=a+b;
                System.out.println("wajahmu yang cantik selalu menjadi nilai tambah bagi hatiku "+hasil);
                break;
            case "-":
                hasil=a-b;
                System.out.println("udah kamu mah gak pernah kurang kok di hatiku "+hasil);
                break;
            default:
                System.out.println("salah masukin bro");

        }
    }
}
