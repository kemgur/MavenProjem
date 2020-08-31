package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_02_BeforeAfterClass {

    @BeforeClass// Bu annotation'a sahip method
    // her class calismadan once calisir.
    public static void setUp(){
        System.out.println("setUp calisti");
    }

    @Test
    public void test1() {
        System.out.println("test2 calisti");
    }

    @Test
    public void test2() {
        System.out.println("test1 calisti");
    }
    @AfterClass//Bu annotation'a sahip olan method, her clastaki tester
    // calistirildiktan sonra calisir.
    public static void tearDown(){
        System.out.println("tearDown calisti");

    }


}


