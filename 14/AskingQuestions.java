import java.util.Scanner;

public class AskingQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        int age = input.nextInt();
        
        System.out.print("How tall are you in feet? ");
        String feet = input.next();
        
        System.out.print("How tall are you in inches? ");
        String inches = input.next();
        
        System.out.print("How much do you weigh? ");
        double weight = input.nextDouble();
        
        System.out.println("So you're " + age + " old, " + feet + "'" + inches + "\"" + " tall and " + weight + " heavy.");
    }
}
