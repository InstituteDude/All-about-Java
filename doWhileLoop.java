
import java.util.Scanner;
public class doWhileLoop{
    public static void main(String[] args){

   Scanner yourinput=new Scanner(System.in);
        int a=0;
        boolean kondisi=true;

        System.out.print("masukan angka looping DVA >> ");
        a=yourinput.nextInt();
        do{

            System.out.println("do while -"+a);
            if (a == 20){
                kondisi=false;
            }
            a++;
        }while(kondisi);
  //     System.out.println("Ini adalah akhir program");
    }
}
