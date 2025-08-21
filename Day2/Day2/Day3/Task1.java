//public static int maximumIn(int [] largestElement){






import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
 ArrayList<String> product = new ArrayList<>();


while (true) {
            
System.out.println("""
		      1. Add items
		      2. Remove items
		      3. Show all items
		      4. Enter 0 exit  """);

System.out.print("Select an option: ");

int userInput;
if (scan.hasNextInt()) {
userInput = scan.nextInt();
scan.nextLine(); 
} else {
System.out.println("Enter a valid number.");
scan.nextLine(); 
continue;
}

switch (userInput) {
case 1:

System.out.println("type to add (type 'done' to go back):");
while (true) {


String item = scan.nextLine();
if (item.equalsIgnoreCase("done")) {
 
break;
}

product.add(item);
System.out.println(item + " added.");

}
break;

  case 2:
if (product.isEmpty()) {
System.out.println("No items to remove.");
       break;
}
System.out.println("Enter item to remove:");
String itemToRemove = scan.nextLine();
    if (product.remove(itemToRemove)) {
System.out.println(itemToRemove + " removed.");
} else {
System.out.println(itemToRemove + " is not in the list.");
    }
break;

case 3:
if (product.isEmpty()) {
  System.out.println("Your list is empty.");
} else {
System.out.println("Your grocery list:");
 for (String item : product) {
System.out.println("- " + item);
}
}
 break;
case 4:
default:
                    System.out.println("Try again.");
                    break;


}   
break;
        
}
}
}
