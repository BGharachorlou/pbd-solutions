import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) ;
        Scanner keyboard = new Scanner(System.in);
        int pin = 6;
        
        System.out.println("That's Correct!");
        System.out.print("I have a number between 1 and 10. Guess what it is. What's your guess: ");
        int entry = keyboard.nextInt();
        
        while (entry !=pin) {
            System.out.println("That's incorrect!");
            System.out.print("I have a number between 1 and 10. Guess what it is. What's your guess: ");
            entry = keyboard.nextInt();
        }
        
        System.out.println("You're Correct! You're cool! You Win!");
    }
}
