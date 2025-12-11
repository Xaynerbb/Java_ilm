import java.time.LocalDate;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Wat is your name?");
        String userName = scanner.nextLine();
       
        System.out.println("Assalamualaikum " + userName);

        System.out.println("ow old are you?");
        int age = scanner.nextInt();
        int years = LocalDate.now().minusYears(age).getYear();

        System.out.println("I am " + age + "years old");
        System.out.println("You were born in " + years);

        if (age < 18){
            System.out.println("You are not an adult ");
        } 
        else{
            System.out.println("You are an adult :) ");
        }
    }
}
