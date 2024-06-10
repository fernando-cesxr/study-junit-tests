package br.com.fernando;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@Order(2)
class DemoRepeatedTest {

    SimpleMathS3 math;

    @BeforeAll
    static void setup() {
        System.out.println("Running @BeforeAll method");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Running @AfterAll method");
    }

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMathS3();
    }

    @RepeatedTest(value = 3, name = "{displayName}. Repetition " + "{currentRepetition} " + "of " + "{totalRepetitions}!")
    @DisplayName("Test division by zero")
    void testDivision_When_FirstNumberDividedByZero_ShouldThrowArithmeticException(
            RepetitionInfo repetitionInfo
    ) {
        double firstNumber = 5.2D;
        double secondNumber = 0D;

        var expectedMessage = "Impossible to divide by zero!";
        ArithmeticException actual = assertThrows(ArithmeticException.class, () -> {
            math.division(firstNumber, secondNumber);
        }, () -> "Division by zero should throw an ArithmeticException");

        assertEquals(expectedMessage, actual.getMessage(), () -> "unexpected exception message");
    }

}




























