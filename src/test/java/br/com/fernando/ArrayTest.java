package br.com.fernando;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@Order(1)
class ArrayTest {

    @Test
//    @Timeout(1)
    @Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
    void testSortPerfomance(){
        int[] numbers = {25,8,21,32,3};
        for (int i = 0; i<1000; i++){
            numbers[0] = i;
            Arrays.sort(numbers);
        }
    }

}