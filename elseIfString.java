
import java.util.*;
public class elseIfString {
    public static void main(String[] args){
        Scanner yourinput;
        String Marvelquiz;
        yourinput=new Scanner(System.in);

        System.out.print("Who villain has a purple skin? ");
        Marvelquiz=yourinput.next();
        System.out.println(Marvelquiz);

     if (Marvelquiz.equals("bilbao")){
         System.out.println("NITNOT WRONG ANSWER");
        }else if(Marvelquiz.equals("thanos")) {
         System.out.println("YEAHHHHHHH HAHAHAA");
     }else if(Marvelquiz.equals("drax")){
         System.out.println("bro come on he is guardian galaxy not destroyer");
     } else if (Marvelquiz.equals ("void")) {
         System.out.println("that is character from brawlhalla you fool ;()");
     } else if (Marvelquiz.equals("batman")) {
         System.out.println("are you talking about the another universe?  ");
     }else {
         System.out.println("you never correct ");
     }
        System.out.println("Thank you for joining marvel Trivia");
    }
}
