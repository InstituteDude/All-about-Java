import java.util.*;
public class operatorLogika{
    public static void main(String[] args){
        
        Scanner inputSendiri=new Scanner(System.in);

        int nilaiBenar=20;
        int nilaiTebak;
        boolean statusTebak;

        System.out.print("Masukan Nilai tebakan anda ya brodie >> ");
        nilaiTebak = inputSendiri.nextInt();
        System.out.println("Nilai tebakan anda adalah "+nilaiTebak);
      
      //operasi logika
        statusTebak = (nilaiTebak == nilaiBenar);
        System.out.println("tebakan anda >> "+statusTebak);

      //operasi aljabar boolean

        System.out.print("Masukan nilai diantara 11 dan 20 >> ");
        nilaiTebak = inputSendiri.nextInt();
        statusTebak=(nilaiTebak > 11) && (nilaiTebak < 20);
        System.out.println("Tebakan Anda : "+statusTebak);
      // *Note : sumber belajar dari youtube nya kang pukis yang berjudul Kelas Terbuka
   } 
}
