package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_01_IlkDers {
        //
    public static void main(String[] args) {
        // Browser'lari gonderebilmek icin webdriver kutuphanesini kullanabiliriz.
        WebDriverManager.chromedriver().setup();//set.property kullanmiyoruz.

//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://www.amazon.com");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        driver.get("https://amazon.com");


        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("samsung headphones" + Keys.ENTER);

         //1.YOL
        WebElement yzLink = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        System.out.println(yzLink.getText());
        //2>YOL


//        WebElement ilkSonuc = driver.findElement(By.xpath("//img[@class='s-image']"));
//        ilkSonuc.click();
//        System.out.println(ilkSonuc.getText());

         // Sayfdaki tum urunleri bulup yazdirir.

        List<WebElement> tumUrunler = driver.findElements(By.xpath("//div[@class='sg-col-inner']"));
        for (WebElement w : tumUrunler){
            System.out.println(w.getText());
        }

//        List<WebElement> urunler = driver.findElements(By.xpath("//span[@class=' l']"));
//        for (WebElement w:urunler) {
//            System.out.println(w.getText());}



    }
}
