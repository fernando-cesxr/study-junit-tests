package br.com.fernando;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;


@Order(3)
@TestMethodOrder(MethodOrderer.Random.class)
class MethodOrderRandonlyTest {

    @Test
    void testA(){
        System.out.println("Running test A");
    }

    @Test
    void testB(){
        System.out.println("Running test B");
    }

    @Test
    void testC(){
        System.out.println("Running test C");
    }

    @Test
    void testD(){
        System.out.println("Running test D");
    }


}