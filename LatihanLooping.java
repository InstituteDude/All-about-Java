
import java.util.*;
public class LatihanLooping{
    public static void main(String[] args){
        int nilaiAwal, nilaiAkhir,total,nilaiAwal2,nilaiAkhir2,total2,nilaiAwal3,nilaiAkhir3,total3;
        Scanner yourinput=new Scanner(System.in);
        System.out.println("<> Program While Loop <>");
        System.out.print(" Masukan nilai awal >> ");
        nilaiAwal=yourinput.nextInt();
        System.out.print("Masukan Nilai Akhir >> ");
        nilaiAkhir=yourinput.nextInt();
        total=0;
        while(nilaiAwal<=nilaiAkhir){
          total=total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi "+ total);
        nilaiAwal++;
        }
        System.out.println("\n");


        System.out.println("<> Program Do while Loop <>");
        System.out.print("Masukan Nilai awal >> ");
        nilaiAwal2=yourinput.nextInt();
        System.out.print("Masukan Nilai Akhir >> ");
        nilaiAkhir2=yourinput.nextInt();
        total2=0;
        do{
            total2=total2 + nilaiAwal2;
            System.out.println("ditambah >> "+ nilaiAwal2+" Menjadi >> "+total2);
            nilaiAwal2++;
        }while(nilaiAwal2<=nilaiAkhir2);
        System.out.println("\n");

        System.out.println("<> Program For Loop <>");
        System.out.print("Masukan Nilai Awal >> ");
        nilaiAwal3=yourinput.nextInt();
        System.out.print("Masukan Nilai Akhir >> ");
        nilaiAkhir3=yourinput.nextInt();

        for(total3=0;nilaiAwal3<=nilaiAkhir3;nilaiAwal3++){
         total3=total3 + nilaiAwal3;
            System.out.println("ditambah >> "+ nilaiAwal3 +" Menjadi >> "+total3);
        }
        System.out.println("\n");
        
        System.out.println("Thank you for Looking this code :)");
    }
}
