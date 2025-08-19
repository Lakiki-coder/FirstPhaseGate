import java.util.Scanner;

public class TaskTwo {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter three integers: ");

 int firstUserInput = input.nextInt();

 int secondUserInput = input.nextInt();

 int thirdUserInput = input.nextInt();

int sumOfTheIntegers = firstUserInput + secondUserInput + thirdUserInput;

int averageOfTheIntegers = sumOfTheIntegers/3 ;

int productOfTheIntegers = firstUserInput * secondUserInput * thirdUserInput;

int smallestOfTheIntegers = firstUserInput;

int largestOfTheIntegers = firstUserInput;

if(secondUserInput < firstUserInput)smallestOfTheIntegers = secondUserInput;

if(thirdUserInput < firstUserInput)smallestOfTheIntegers = thirdUserInput;

if(secondUserInput > firstUserInput)largestOfTheIntegers = secondUserInput;

if(thirdUserInput > firstUserInput)largestOfTheIntegers = thirdUserInput;

System.out.println("the sum of the integers is: " + sumOfTheIntegers);

System.out.println("the average of the integers is: " + averageOfTheIntegers);

System.out.println("the product of the integers is: " + productOfTheIntegers);

System.out.println("The smallest of the integers is: " + smallestOfTheIntegers);

System.out.println("the sum of the integers is: " + largestOfTheIntegers);

}
}




