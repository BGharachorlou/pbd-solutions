import java.util.Scanner;

public class HowOld2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        String yourName = sc.next();
        
        System.out.print("Ok so how old are you? ");
        int yourAge = sc.nextInt();
        
        if (yourAge < 16) {
          System.out.println("You can't drive " + yourName + ".");
        } 
        
        else if ((yourAge == 16) || (yourAge == 17)) {
          System.out.println("You can drive, but you can't vote " + yourName + ".");
        }  
          
        else if ((yourAge >= 18) || (yourAge <= 24)) {
          System.out.println("You can vote, but you can't rent a car!");
        }
          
        else if (yourAge >=25) {
          System.out.println("You can practically do anything");
        }
    }
}

