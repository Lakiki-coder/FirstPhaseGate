import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertRaises;

public class Task2{

@Test
public void testiftask2work(){

firstScore = 25;
secondScore = 40;
thirdScore = 30;


Task2 input = new Task2();

result = input.averaageScore(firstScore,secondScore,thirdScore)
assertEqual(result, 95)

}
@Test

public void testifuserinputstring(){

firstScore = "orange";
secondScore = "mango";
thirdScore = "kind";


Task2 input = new Task2();

result = input.ifString(firstScore,secondScore,thirdScore)
assertRaises(ValueError, result, "orange","mango","kind")

}
@Test

public void testifuserinputlessthaanzero(){

firstScore = -1 ;
secondScore = -2;
thirdScore = -3;


Task2 input = new Task2();

result = input.ifZero(firstScore,secondScore,thirdScore)
assertRaises(ValueError, result, -1,-2,-3)

}
@Test

public void testifuserinputgreaterthanzero(){

firstScore = 102 ;
secondScore = 110;
thirdScore = 105;


Task2 input = new Task2();

result = input.ifIsGreater(firstScore,secondScore,thirdScore)
assertRaises(ValueError, result, 102,110,105)
}
}
