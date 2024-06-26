package br.com.fernando;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(4)
@TestMethodOrder(MethodOrderer.MethodName.class)
class MethodOrderByNameTest {

    @Test
    void testA(){
        System.out.println("Running test A");
    }

    @Test
    void testB(){
        System.out.println("Running test B");
    }

    @Test
    void testD(){
        System.out.println("Running test D");
    }

    @Test
    void testC(){
        System.out.println("Running test C");
    }

}