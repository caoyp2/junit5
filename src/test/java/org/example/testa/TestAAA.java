package org.example.testa;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAAA {

    @BeforeAll
    static void beforeAll(){ System.out.println("beforeAll"); }

    @AfterAll
    static void afterAll(){ System.out.println("afterAll"); }

    @BeforeEach
    void beforeEach(){ System.out.println("beforeEach"); }

    @AfterEach
    void afterEach(){ System.out.println("afterEach"); }

    @Test
    void testa1(){
        System.out.println("testa1");
    }

    @Test
    void testa2(){
        System.out.println("testa2");
    }
}
