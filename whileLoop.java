
public class whileLoop {
    public static void main(String[] args){

   //     while (kondisi){
     //       aksi
      //  }
        int a=0;
        boolean kondisi =true;
        System.out.println("Awal Program boss ");
 while(kondisi){
     System.out.println("While loop ke-"+a); //<<<bila tidak memakai penentu atau end nya suatu angka maka looping akan terjadi terus sampai infinity


      if(a==10){           //{
          kondisi= false;  //{    << maka dari itu harus ada percabangan if else untuk menghentikan pengulangan nya
      }                    //{
      a++; // << ini increment bila di taro di bawah if (a==10) end nya sampe 10 tetapi bila di atas if(a==10) di taro nya looping cuma akan sampe angka 9
 }
        System.out.println("Akhir Program");


    }
}
