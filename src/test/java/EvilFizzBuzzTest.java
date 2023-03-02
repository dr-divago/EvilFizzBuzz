import fizzbuzz.EvilFizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class EvilFizzBuzzTest {

    @Test
    public void when_number_is_divisible_by_3_Fizz() {
        EvilFizzBuzz evilFizzBuzz = new EvilFizzBuzz();
        String str = evilFizzBuzz.generate(3);
        Assertions.assertEquals("FizzWizz", str);
    }

    @Test
    public void when_number_is_divisible_by_5_Buzz() {
        EvilFizzBuzz evilFizzBuzz = new EvilFizzBuzz();
        String str = evilFizzBuzz.generate(5);
        Assertions.assertEquals( "BuzzWizz", str);
    }

    @Test
    public void when_number_is_divisible_by_3_and_5_FizzBuzz() {
        EvilFizzBuzz evilFizzBuzz = new EvilFizzBuzz();
        String str = evilFizzBuzz.generate(15);
        Assertions.assertEquals("FizzBuzz", str);
    }

    @Test
    public void when_number_is_one_then_one() {
        EvilFizzBuzz evilFizzBuzz = new EvilFizzBuzz();
        String str = evilFizzBuzz.generate(1);
        Assertions.assertEquals("1", str);
    }

    @Test
    public void when_4_then_4() {
        EvilFizzBuzz evilFizzBuzz = new EvilFizzBuzz();
        String str =evilFizzBuzz.generate(4);
        Assertions.assertEquals("4", str);
    }

    @Test
    public void generate_all_sequence() {
        String expected = "1, Wizz, FizzWizz, 4, BuzzWizz, Fizz, Wizz, 8, Fizz, Buzz, Wizz, Fizz, Wizz, 14, FizzBuzz";
        EvilFizzBuzz evilFizzBuzz = new EvilFizzBuzz();
        String str = evilFizzBuzz.generate(IntStream.rangeClosed(1, 15));
        Assertions.assertEquals(expected, str);
    }
}
