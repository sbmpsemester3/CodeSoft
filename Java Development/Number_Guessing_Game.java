import java.util.*;
public class Task1{
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            Random r = new Random();
            int random_int = r.nextInt(101);
            System.out.println("Welcome to Number Guessing Game");
            System.out.println("I have selected a number. Try and guess it within 5 tries");
            int attempts=0;
	    int guess;
            while(attempts<5) {
		System.out.println("Enter the number:");
		guess = sc.nextInt();
                if(guess == random_int) {
                    System.out.println("Congratulations on guessing the correct number");
                    break;
                }
                else if(guess > random_int) {
                    System.out.println("Too High");
                }
                else if(guess < random_int) {
                    System.out.println("Too Low");
                }
                attempts++;
                System.out.println("Attempts left:" + (5-attempts));
		
            }
		System.out.println("The number was:" + random_int);
    }
}
