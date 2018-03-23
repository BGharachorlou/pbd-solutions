import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        int age = input.nextInt();
        
        if (age < 16) {
          System.out.println("You can't drive yet Buddy!");
        }
        
        if (age < 18) {
          System.out.println("You can't vote!");
        }
        
        if (age < 25) {
          System.out.println("You can't rent a car!");
        }
        
        if (age > 25) {
          System.out.println("You can do anything that's legal!");
        }
    }
}
