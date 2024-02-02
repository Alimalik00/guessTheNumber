import java.util.Random;
import java.util.Scanner;
class GuessTheNumber{
    private int noOfTries;
    private int rand;
    private int userChoice;
    private int points;
    boolean playAgain = true;
    public GuessTheNumber(){
        points = 1;
        Random randomNumber = new Random();
        rand = randomNumber.nextInt(0,100);

    }
    public void getChoice(int n){
        userChoice = n;
        if(userChoice == rand){
            System.out.println("You guess the right number: " + rand + ". With a score of: " + points);
            playAgain = false;
        } else if (userChoice>rand) {
            System.out.println("Try a smaller number");
            playAgain = true;
            points++;
        } else if (userChoice<rand) {
            System.out.println("Try a larger number");
            playAgain = true;
            points++;
        }
    }
}

public class OopFirst {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GuessTheNumber player = new GuessTheNumber();

        int x;
        while(player.playAgain){
            System.out.println("Guess the number: ");
            x = sc.nextInt();
            player.getChoice(x);
        }
    }

}
