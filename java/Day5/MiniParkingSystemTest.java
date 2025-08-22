import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MiniParkingSystem {
    
   @Test
    public void testIfUserInputString() {
        String firstInput = 1;
        
	MiniParkingSystem park = new MiniParkingSystem
        String result = park.space(firstInput);
        assertEquals(1, result);
    }
    
}