import java.util.*;
class GuessGame {
    static Scanner input = new Scanner(System.in);
    static RandomN = new Random();
    static int Counter = 5;
    static int Secret = RandomN.nextInt(100) + 1, Guess 0;
    static boolean playAgain = true;


   public static void main(String joe []) {


  do {
      System.out.print("Enter your Guess(1-100): ");
      Guess = input.nextInt();
      
      if (Guess > Secret) {
         System.out.println("Too high!");
     } else if (Guess < Secret) {
         System.out.println("Too low!");
     } else {
         System.out.println("Congratulations!");
        }
      } while (Guess != Secret);

    }
}

 
