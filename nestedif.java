
import java.util.Scanner;
public class nestedif {
    public static void main(String[] args){
Scanner yourinput= new Scanner(System.in);

        System.out.println("<> Test tinggi dan berat badan untuk masuk kerja <>");
        System.out.print("Mohon masukan tinggi anda >> ");
        int a=yourinput.nextInt();
        System.out.print("Mohon masukan berat badan anda >> ");
        int b=yourinput.nextInt();

        System.out.println("<> Test Nilai Akademik untuk masuk Kerja <>");
        System.out.print("Masukan Nilai Matematika >> ");
        int c=yourinput.nextInt();
        System.out.print("Masukan Nilai Bahasa Inggris >>");
        int d=yourinput.nextInt();
if (a>=165){
    if(b>=65){
        System.out.println("Selamat Kamu Lulus dalam test fisik");
    }else{
        System.out.println("Selamat anda lulus, naikan berat badanmu!");
    }
}
if(c>=75){
    if (d>=70){
        System.out.println("Selamat Kamu Lulus dalam Test akademik");
    }else{
        System.out.println("Kamu tetap lulus test akademik tetapi tolong perbaiki nilai yang kurang");
    }

}
else{
    System.out.println("Maaf anda tidak lulus dalam test fisik Maupun akademik, Dikarenakan tidak memenuhi syarat tinggi badan dan matematika !");
}
        System.out.println("Terima Kasih mohon buang sampah pada tempatnya");

    }
}
