package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_05_IkinciOrnek {

    static WebDriver driver;

    @BeforeClass// Calis calismaya baslayinca calisacak.
    public  static void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterClass// Class calismayi bitirince calisacak.
    public static void teardown(){

        driver.quit();
    }

    @Before//Her test methodundan once calisir.
    public void TesttenOnce(){
    driver.get("http://google.com");//her testten once google
        // gitmek icin kullanilabilir.
    }

    @After// her test methodundan sonra calisacak.
    public void testtenSonra(){
        WebElement sonucSayisi = driver.findElement(By.id("result-stats"));
        System.out.println(sonucSayisi.getText());

    }

    @Test
    public void test01(){
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("elma");
        aramaKutusu.submit();
    }
    @Test
    public void test02(){
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("samsung kulaklik");
        aramaKutusu.submit();
    }

    @Test
    public void test03(){
        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("calisma sandalyesi");
        aramaKutusu.submit();
    }
}
