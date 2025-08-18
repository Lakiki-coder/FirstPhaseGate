import java.util.Scanner;

public class differenceOne {

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter 4 digit number");

int inputOne = input.nextInt();

int firstDigit = (inputOne / 1000)% 10;

int secondDigit = (inputOne / 100)% 10;

int thirdDigit = (inputOne / 10)% 10;

int forthDigit = inputOne % 10;


firstDigit = (firstDigit + 7) % 10;

secondDigit = (secondDigit + 7) % 10;

thirdDigit = (thirdDigit + 7) % 10;

forthDigit = (forthDigit + 7) % 10;

System.out.printf("Encryption key before swapping : %d%d%d%d%n",firstDigit,secondDigit,thirdDigit,forthDigit);


int save = firstDigit;

firstDigit = thirdDigit;

thirdDigit = save ;

System.out.printf("Encryption key after swapping : %d%d%d%d%n",firstDigit,secondDigit,thirdDigit,forthDigit);

int temp = firstDigit;

firstDigit = thirdDigit;

thirdDigit = temp ;

System.out.printf("Encryption key after reswapping : %d%d%d%d%n",firstDigit,secondDigit,thirdDigit,forthDigit);


}
}