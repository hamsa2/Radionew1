import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewRadioTest {

    @Test
    public  void test() {
        Radio radio = new Radio(10);

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
}
