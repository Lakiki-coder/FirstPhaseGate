import java.util.Scanner;

public class TaskOne {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter two integers: ");

 int firstUserInput = input.nextInt();

 int secondUserInput = input.nextInt();

int squareFirstUserInputs = firstUserInput * firstUserInput;

 int squareSecondUserInputs = secondUserInput * secondUserInput;

int sumOfTheSquares = squareFirstUserInputs + squareSecondUserInputs;

 int differenceOfTheSquares = squareFirstUserInputs - squareFirstUserInputs;

System.out.println("The square of the first userinput: " + squareFirstUserInputs); 
 
System.out.println("The square of the second user input" + squareSecondUserInputs);

System.out.println("The sum of the squares is: " + sumOfTheSquares);

System.out.print("The difference of the squares is: " + differenceOfTheSquares);

}
}