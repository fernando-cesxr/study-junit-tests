package br.com.fernando;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTestS4 {

    SimpleMathS3 math;

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMathS3();
    }

//    @AfterEach
//    void afterEachMethod(){
//        System.out.println("Running @AfterEach method");
//    }


    @ParameterizedTest
    @MethodSource()
    @DisplayName("Test Division")
    void testDivision_When_FistNumberDividedBySecondNumber_ShouldReturnExpected(double firstNumber, double secondNumber, double expected) {
        double result = math.division(firstNumber, secondNumber);

        assertEquals(expected, result, 2D, () -> firstNumber + " / " + secondNumber + " did not produce " + expected);
    }

    public static Stream<Arguments> testDivision_When_FistNumberDividedBySecondNumber_ShouldReturnExpected() {
        return Stream.of(
                Arguments.of(6.2D, 2D, 3.1D),
                Arguments.of(10D, 5D, 2D),
                Arguments.of(20D, 10D, 2D)
        );

    }

    @ParameterizedTest
//    @CsvSource({
//            "6.2, 2, 3.1",
//            "10, 5, 2",
//            "20, 10, 2"
//    })
//    @CsvSource({
//            "Pelé, Futebol",
//            "Senna, F1"
//    })
    @CsvFileSource(resources = "/testDivision.csv")
    @DisplayName("Test Double Division [double firstNumber, double secondNumber, double expected]")
    void testDivision_When_FistNumberDividedBySecondNumber_ShouldReturnExpectedCSVSource(double firstNumber, double secondNumber, double expected) {
        double result = math.division(firstNumber, secondNumber);

        assertEquals(expected, result, 2D, () -> firstNumber + " / " + secondNumber + " did not produce " + expected);
    }



    @ParameterizedTest
    @ValueSource(strings = {"Pelé", "Senna", "Michael Jackson"})
    void testValueSource(String firstName){
        System.out.println(firstName);
        assertNotNull(firstName);
    }



}




























