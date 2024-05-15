package br.com.fernando;

import jdk.jfr.Frequency;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    // Given When Then - GWT é mais utilizado para negócios por ser mais legível para um não programador ler
    // Arrange Act Assert - AAA é mais utlizado para testar de fato as funcoes de um programa, não se importando com a legibilidade de um não programador
    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")

    //test[System Under Test]_When_[Condition or state change]_[Expected result]
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo(){
        // Given / Arrange
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 8.2;

        // Act
        Double result = math.sum(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, result, () -> firstNumber + " + " + secondNumber + " did not produce " + expected);
    }

    @Test
    @DisplayName("Test 6.2 + 2 != 9.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ExpectedNineDotTwo(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 9.2;
        Double result = math.sum(firstNumber, secondNumber);

        assertNotEquals(expected, result, () ->  firstNumber + " + " + secondNumber + " did not produce " + expected);
//        a arrow function () -> serve para apenas executar a mensagem caso o teste realmente tenha falhado
    }

    @Test
    @DisplayName("Test 6.2 + 2 != null")
    void testSimpleMathSumNotNull(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double result = math.sum(firstNumber, secondNumber);

        assertNotNull(result);
    }

    @Test
    @DisplayName("Test 5 - 4 = 1")
    void testSimpleMathSubtractionEqual(){
        SimpleMath math = new SimpleMath();

        double firstNumber = 5D;
        double secondNumber = 4D;
        double expected = 1;
        Double result = math.subtraction(firstNumber, secondNumber);

        assertEquals(expected, result, () ->  firstNumber + " - " + secondNumber + " did not produce " + expected);

    }

    @Test
    @DisplayName("Test 5-4 != 2")
    void testSimpleMathSubtractionNotEqual(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 5D;
        double secondNumber = 4D;
        double expected = 2;
        double result = math.subtraction(5D, 4D);

        assertNotEquals(result, expected, () ->  firstNumber + " - " + secondNumber + " did not produce " + expected);

    }

    @Test
    @DisplayName("Test 5-4 != null ")
    void testSimpleMathSubtractionNotNull(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 5D;
        double secondNumber = 4D;
        double result = math.subtraction(firstNumber, secondNumber);

        assertNotNull(result);
    }

    @Test
    @DisplayName("Test 2*3 = 6")
    void testSimpleMathMultiplicationEqual(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 2;
        double secondNumber = 3;
        double expected = 6;
        double result = math.multiplication(firstNumber, secondNumber);

        assertEquals(expected, result, () ->  firstNumber + " * " + secondNumber + " did not produce " + expected);
    }

    @Test
    @DisplayName("Test 2*3 != 7")
    void testSimpleMathMultiplicationNotEqual(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 2;
        double secondNumber = 3;
        double expected = 7;
        double result = math.multiplication(firstNumber, secondNumber);

        assertNotEquals(expected, result, () ->  firstNumber + " * " + secondNumber + " did not produce " + expected);
    }

    @Test
    @DisplayName("Test 2*3 != null")
    void testSimpleMathMultiplicationNotNull(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 2;
        double secondNumber = 3;
        double result = math.multiplication(firstNumber, secondNumber);

        assertNotNull(result);
    }

    @Test
    @DisplayName("Test 10/5 = 2")
    void testSimpleMathDivisionEqual(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 10;
        double secondNumber = 5;
        double expected = 2;
        double result = math.division(firstNumber, secondNumber);

        assertEquals(expected, result, () ->  firstNumber + " / " + secondNumber + " did not produce " + expected);
    }

    @Test
    @DisplayName("Test 10/5 != 3")
    void testSimpleMathDivisonNotEqual(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 10;
        double secondNumber = 5;
        double expected = 3;
        double result = math.division(firstNumber, secondNumber);

        assertNotEquals(expected, result, () ->  firstNumber + " / " + secondNumber + " did not produce " + expected);
    }

    @Test
    @DisplayName("Test 10/5 != null")
    void testSimpleMathDivisionNotNull(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 10;
        double secondNumber = 5;
        double result = math.division(firstNumber, secondNumber);

        assertNotNull(result);
    }

    @Test
    @DisplayName("Test (10 + 10)/2 = 10")
    void testSimpleMathMeanEqual(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 10;
        double secondNumber = 10;
        double expected = 10;
        double result = math.mean(firstNumber, secondNumber);

        assertEquals(expected, result, () ->  firstNumber + " // " + secondNumber + " did not produce " + expected);
    }

    @Test
    @DisplayName("Test (10 + 10)/2 != 11")
    void testSimpleMathMeanNotEqual(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 10;
        double secondNumber = 10;
        double expected = 11;
        double result = math.mean(firstNumber, secondNumber);

        assertNotEquals(expected, result, () ->  firstNumber + " // " + secondNumber + " did not produce " + expected);
    }

    @Test
    @DisplayName("Test (10 + 10)/2 != null")
    void testSimpleMathMeanNotNull(){
        SimpleMath math = new SimpleMath();
        double firstNumber = 10;
        double secondNumber = 10;
        double result = math.mean(firstNumber, secondNumber);

        assertNotNull(result);
    }

    @Test
    @DisplayName("Test Square Root 16 = 4")
    void testSimpleMathSquareRootEqual(){
        SimpleMath math = new SimpleMath();
        double number = 16;
        double expected = 4;
        double result = math.squareRoot(number);

        assertEquals(expected, result, () -> number + "did not produce " +  expected);
    }

    @Test
    @DisplayName("Test Square Root 16 != 5")
    void testSimpleMathSquareRootNotEqual(){
        SimpleMath math = new SimpleMath();
        double number = 16;
        double expected = 5;
        double result = math.squareRoot(number);

        assertNotEquals(expected, result, () -> number + "did not produce " +  expected);
    }

    @Test
    @DisplayName("Test Square Root 16 != null")
    void testSimpletMathSquareRootNotNull(){
        SimpleMath math = new SimpleMath();
        double number = 16;
        double result = math.squareRoot(number);

        assertNotNull(result);
    }

}