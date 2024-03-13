import org.example.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzztest {

    @Test
    @DisplayName("5 => Fizz")
    void fizz_Given_5_shouldbe_Fizz(){
       String result = new FizzBuzz().generate(5);
        Assertions.assertEquals("Fizz",result);
    }

    @Test
    @DisplayName("7 => Buzz")
    void buzz_given_7_shouldbe_buzz(){
        String result = new FizzBuzz().generate(7);
        Assertions.assertEquals("Buzz",result);
    }

    @Test
    @DisplayName("35 => FizzBuzz")
    void Fizzbuzz_given_35_shouldbe_Fizzbuzz(){
        String result = new FizzBuzz().generate(35);
        Assertions.assertEquals("Fizzbuzz",result);
    }

    @Test
    @DisplayName("6 => 6")
    void Number_given_is_Number(){
        String result = new FizzBuzz().generate(6);
        Assertions.assertEquals("6",result);
    }

    @Test
    @DisplayName("-1=> IllegalArgumentException")
    void Number_given_is_Invalid(){
        assertThrows(IllegalArgumentException.class,()-> new FizzBuzz().generate(-1));
}

    @Test
    @DisplayName("66 => FizzBuzz")
    void Number_given_is_FizzBuzz(){
        String result = new FizzBuzz().generate(66);
        Assertions.assertEquals("FizzBuzz",result);
    }


}


