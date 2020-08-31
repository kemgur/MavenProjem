package com.techproed;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class Day09_01_Assertion {
    private static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void test1(){
        driver.get("http://google.com");
        // Test Case : Google.com'un başlığı "Google Arama Sayfası" olsun.
        String title = driver.getTitle();
        // Google'ın title'ı "Google Arama Sayfası"na eşit mi, değil mi ?
        Assert.assertEquals("Google Arama Sayfası",title);
        //Assert.assertEquals(5,5);
        //Assert.assertEquals(true,false);
        //Assert.assertEquals("Yazı","Google");
    }
    @Test
    public void test2(){
        driver.get("http://amazon.com");
        // Amazon.com'un başlığı Amazon kelimesini içeriyor olsun.
        String title = driver.getTitle();
        boolean iceriyorMu = title.contains("Amazon"); // "true" ya da "false"
        // boolean veri tipinde bir değer giriyoruz.
        Assert.assertTrue(iceriyorMu);

    }
    @Test
    public void test03(){
        driver.get("http://facebook.com");
        String title = driver.getTitle();

        //Facebbok.com'un title'i Youtube kelimesini iceriyor mu?
        boolean iceriyorMu = title.contains("Youtube");
        Assert.assertFalse(iceriyorMu);// False oldugunu dogrula.

    }

    @Test
    public void test04(){
        driver.get("http://google.com");
        String title = driver.getTitle();
        System.out.println("Merhabalar...");
        Assert.assertEquals("Google Arama Sayfasi", title);
        System.out.println("Test dogruluma bitti");// Test basarisizsa bu kismi calistirmaz.
    }
    @Test
    public void test05(){
        driver.get("http://google.com");
        String title = driver.getTitle();
        System.out.println("Google");
        Assert.assertEquals("Google", title);
        System.out.println("Test dogruluma bitti");// Test basarisizsa bu kismi calistirmaz.
    }


    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }
}