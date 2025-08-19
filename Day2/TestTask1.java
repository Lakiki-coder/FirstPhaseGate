import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1{

@Test
public void testiftask2work(){

firstNumber = "fall";
secondNumber = "sum";


Task1 input = new Task1();

result = input.averaageScore(firstScore,secondScore,thirdScore)
assertEqual(result, 95)

}
@Test

public void testifuserinputstring(){

firstNumber = "orange";
secondNumber = "mango";



Task1 input = new Task1();

result = input.ifString(firstScore,secondScore)
assertRaises(ValueError, result, "orange","mango")

}
@Test

public void testifuserinputlessthaanzero(){

firstScore = -1 ;
secondScore = -2;


Task1 input = new Task1();

result = input.ifZero(firstScore,secondScore)
assertRaises(ValueError, result, -1,-2)

}
@Test

public void testifuserinputgreaterthanzero(){

firstScore = 102 ;
secondScore = 110;


Task1 input = new Task1();

result = input.ifIsGreater(firstScore,secondScore)
assertRaises(ValueError, result, 102,110)
}
}



