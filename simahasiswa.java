import java.util.Scanner;
public class simahasiswa{
    public static void main(String[] args){
         int hasil = 2*10+20/2-9;
         System.out.println(hasil);

         hasil = 2*(20+30);
         System.out.println(hasil);

         Scanner userInputs=new Scanner(System.in);
          System.out.println("menghitung luas persegi panjang");
          int panjang,lebar,kubik,luas;
           System.out.print("Masukan panjang nya brow >> ");
           panjang=userInputs.nextInt();
           System.out.print("Masukan lebar nya juga brodie >> ");
           lebar=userInputs.nextInt();
           System.out.print("Hayo hampir lupa masukin kubik >> ");
           kubik=userInputs.nextInt();
          luas=panjang*(lebar+kubik);
          System.out.println("The result isssss >> "+luas);
          System.out.println(" jadi pingin bulan ramadhan lagi njir xD");
    }
}