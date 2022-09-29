import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
 
    @org.junit.jupiter.api.Test
    void sum() {
        Calculator calc = new Calculator();
        int result = calc.PLUS(4, 5);
        assertEquals(9,result);
    }

    @org.junit.jupiter.api.Test
    void minus() {
        Calculator calc = new Calculator();
        int result = calc.MINUS(5, 4);
        assertEquals(2,result); 
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Calculator calc = new Calculator();
        int result = calc.UMNOW(4, 5);
        assertEquals(20,result);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Calculator calc = new Calculator();
        int result = calc.DELIT(20, 4);
        assertEquals(5,result);
    }
}
