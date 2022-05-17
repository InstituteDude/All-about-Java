
import java.util.Scanner;
public class switchCase {
    public static void main(String[] args){

        //switch case
        String pleaseInput;

        Scanner yourInput = new Scanner(System.in);

        System.out.print("What is the name of the person who serves khonsu? ");
        pleaseInput = yourInput.next();
        System.out.println(pleaseInput);

        //ekspresinya berupa satuan (int, long, byte, short)

        switch(pleaseInput){
            case "Marc":
                System.out.println("Thats very right because he is the main character");
                break;
            case "Steven":
                System.out.println("Yep it can be but, seriously?");
                break;
            case "Jack":
                System.out.println("ummm y-yeah he is one of the most obedient to khonsu");
            default:
                System.out.println("What are you thinking about? ");
                break;
        }
        System.out.print("who who is the bad guy in the moon knight series? ");
        pleaseInput=yourInput.next();
        System.out.println(pleaseInput);

        switch(pleaseInput){
            case "Amit":
                System.out.println("thatt rightt mate, she the evil one ;| ");
            break;
            case "Arthur":
                System.out.println(" yep he bad too, but he just serve who made him bad");
                break;
            default:
                System.out.println("nahhh, you wrong person");
        }
        System.out.println("Thank you for join the moon knight trivia");
    }
}
