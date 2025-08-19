import java.util.Scanner;

public class TaskThree {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter an integers: ");

 int firstUserInput = input.nextInt();

if(firstUserInput % 3 == 0)System.out.println("the user input is divisible by 3");

else(firstUserInput % 3 != 0)System.out.println("the user input is not divisible by 3");
}
 }
