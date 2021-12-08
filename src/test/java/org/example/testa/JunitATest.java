package org.example.testa;

import org.example.callback.MyAfterAllCallBack;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MyAfterAllCallBack.class)
public class JunitATest {

    @Tag("qa")
    @Test
    void test1(){
        System.out.println("test1.....");
    }

    @Tag("prdtest")
    @Test
    void test2(){
        System.out.println("test2.....");
    }

    @Tag("prd")
    @Test
    void test3(){
        System.out.println("test3.....");
    }
}
