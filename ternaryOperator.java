
import java.util.*;
public class ternaryOperator {
    public static void main(String[] args){
        //ternary Operator
        //variabel x=ekspresi ? statement true ; statement_false

        int input, x;

        Scanner yourinput = new Scanner(System.in);

        System.out.print("Masukan Nilai >> ");
        input=yourinput.nextInt();

        x=(input == 40) ? (input*input) : (input/2);
        System.out.println("Hasilnya adalah "+x);

        //jika memakai if else
        System.out.print("Masukan nilai nya adik adik >> ");
        input=yourinput.nextInt();

        if(input==20){
            x=input*input;
            System.out.println("Hasilnya adalah >> "+x);
        }else{
            x=input/2;
            System.out.println("Hasilnya segini ya >> "+x);
        }
        System.out.println("<> Terima Kasih <>");

    }
}
