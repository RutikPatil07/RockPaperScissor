import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
       public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};

        String userChoice;
        String computerChoice;

           System.out.println("===== ROCK PAPER SCISSORS =====");

           System.out.println("Enter Rock, Paper , or Scissors: ");
           userChoice = sc.nextLine();

           computerChoice = options[r.nextInt(3)];

           System.out.println("Computer choice :" + computerChoice);

           if(userChoice.equalsIgnoreCase(computerChoice)){
            System.out.println("Match Draw !!");
           }

            else if (
                (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
        ) {
            System.out.println("You Win the GAME ");
       } else{
    System.out.println("Computer Wins");
       }
         sc.close();
    }
}