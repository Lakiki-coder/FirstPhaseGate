/**
- Display to the user where the user want to pack
- Create a switch case which display available space and unavailable space 
- 
**/

import java.util.Scanner ;

public class MiniParkingSystem {

public static void main(String [] args){

Scanner scanner = new Scanner(System.in);

int[] parkingLot = new int[20];         
int carCounter = 1;         
while (true) {
System.out.println("Parking Lot System");
System.out.println("1. Park a car");
System.out.println("2. Remove a car");
           System.out.println("3. Display parking status");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1: 
                    int empty = findFreeSlot(parkingLot);
                    if (empty != -1) {
                        parkingLot[empty] = carCounter;
                        System.out.println(carCounter + (empty + 1));
                        carCounter++;
} else {
                        System.out.println("no space");
                    }
                    break;
                    
                case 2:                     System.out.print("enter a space to enter: ");
                    int removeSpace = scanner.nextInt() - 1;
                    
                    if (removeSpace >= 0 && removeSpace < 20) {
                        if (parkingLot[removeSpace] != 0) {
                            System.out.println( parkingLot[removeSpace] (removeSpace + 1));
                            parkingLot[removeSpace] = 0;
}                    break;


}
}
}
}