import java.util.Random;
import java.util.Scanner;
public class Number {
     public static void main(String[]args){
               Scanner sc=new Scanner(System.in);
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int randomNumber=random.nextInt(100)+1;
      
        while(true){
         System.out.println("guess the number(1-100):");
   
         int playerGuess= scanner.nextInt();
         if(playerGuess == randomNumber){
            System.out.println("Correct!You Win");
            break;
         }
         else if(randomNumber > playerGuess){
             System.out.println("Nope!!the number is higher.Guess again");
         }
         else{
             System.out.println("Nope!!the number is lower.Guess again");
         }
      }


     



     }
}
