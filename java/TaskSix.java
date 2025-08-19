public class TaskSix {

public static void main(String[] args){

int [] numbers = {1,2,3,4,5,6,7,8,9,10};

for(int count = 1; count <= numbers.length; count++){

int largest = numbers[0];

if(numbers[count] > numbers[0])largest = numbers[count];


System.out.println(largest);
}

}


}