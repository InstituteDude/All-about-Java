
public class forLoop {
    public static void main(String[] args) {

        //  for(inisialisasi; kondisi; step_nilai){
        //   aksi;
        // }

        System.out.println("Loop 1st");
        for (int nilai = 0; nilai <= 10; nilai++) {
            System.out.println(" for loop ni boss >> " + nilai);
        }
        System.out.println("Loop 2nd");
        for (int nilai2 = 0; nilai2 < 10; nilai2++) {
            System.out.println("Loop lagi ni boss >> " + nilai2);
        }
        System.out.println("Loop 3rd");
        for(int nilai3=10;nilai3>=4;nilai3--){
            System.out.println("Loop lagi -"+nilai3);
        }
        System.out.println("Loop 4th");
        int nilai4=0;
        for(;nilai4<10;){
            System.out.println("Loop 'lagi'-"+nilai4);
        nilai4++;
        }

    }
}
