import java.util.Scanner;
public class IT24103096Lab4Q3 {
   
   public static void main(String[] args) {
     
          int Number ;
          String res;
          Scanner input = new Scanner(System.in);

          System.out.print("Enter a number: ");
          Number = input.nextInt();

         res = ( Number > 0 )? "The number is: Positive" :( Number < 0)? "The number is negative":"The number is zero";
         System.out.print(res);
}
}