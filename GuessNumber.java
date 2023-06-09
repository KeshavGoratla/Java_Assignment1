/*Create a class game,which allows the user to play "Guess the Number Game" */
import java.util.Scanner;
import java.util.Random;

class game{
    public int number;
    public int NumOfGuesses = 0;
    public int inputNumber;

    public game(){
        Random r = new Random();
        number = r.nextInt(100);
    }

    public void takeUserInput(){
        System.out.println("Guess the number :");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    public boolean isCorrect(){
        NumOfGuesses++;
        if(inputNumber == number){
            System.out.printf("You guessed it right , It was %d\nYou guessed it in %d attempts.",number,NumOfGuesses);
            return true;
        }
        else if(inputNumber > number){
            System.out.println("Too high...");
        }
        else if(inputNumber < number){
            System.out.println("Too low...");
        }
        return false;
    }
}
public class GuessNumber{
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrect();
        }
    }
}
