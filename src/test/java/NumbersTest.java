import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @org.junit.jupiter.api.Test
    void sum() {
        Numbers numbers = new Numbers();
        int actual =numbers.sum(5);
        int expected = 15;
        assertEquals(expected, actual);
    }
}