import java.util.Scanner;
 
public class gfg{

    public static void
    guessingNumberGame()
    {
        
        Scanner sc = new Scanner(System.in);
 
        
        int number = 1 + (int)(100
                               * Math.random());
 
       
        int K = 3;
 
        int i, guess;
 
        System.out.println(
            "A number is chosen"
            + " between 1 to 100."
            + "Guess the number"
            + " within 3 trials.");
 
       
        for (i = 0; i < K; i++) {
 
            System.out.println(
                "Guess the number:");
 
            
            guess = sc.nextInt();
 
            
            if (number == guess) {
                System.out.println(
                    "Congratulations!"
                    + " You guessed the number.\n you scored 1 point..");
                break;
            }
            else if (number > guess
                     && i != K - 1) {
                System.out.println(
                    "The number is "
                    + "greater than " + guess);
            }
            else if (number < guess
                     && i != K - 1) {
                System.out.println(
                    "The number is"
                    + " less than " + guess);
            }
        }
 
        if (i == K) {
            System.out.println(
                "You have exhausted "
                +K+" trials.\n you scored 0 points..");
 
            System.out.println(
                "The number was " + number);
        }
    }
 
   
    public static void
    main(String arg[])
    {
 
        
        guessingNumberGame();
    }
}