package com.techproed;

import org.junit.*;

public class Day08_03_BeforeAfterMethod {

    @BeforeClass////Testin basinda calisir
    public static void setUp(){
        System.out.println("Setup çalıştı..");
    }
    @AfterClass//Testin sonunda calisir
    public static void tearDown(){
        System.out.println("TearDown çalıştı..");
    }
    @Before// Her testten oce mutlaka calisir.
    public void methoddanOnce(){
        System.out.println("methoddanOnce çalıştı.");
    }
    @After// Her Testten sonra mutlaka calisir.
    public void methoddanSonra(){
        System.out.println("methoddanSonra çalıştı..");
    }
    @Test
    public void test1(){
        System.out.println("Test 1 çalıştı..");
    }
    @Test
    public void test2(){
        System.out.println("Test 2 çalıştı..");
    }

}

