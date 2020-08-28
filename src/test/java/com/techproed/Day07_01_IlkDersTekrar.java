package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_01_IlkDersTekrar {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );

         driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        // + Keys.ENTER ==> sendKeys ifadesinden sonra yazarsak, submit islevi gorur.
        aramaKutusu.sendKeys("samsung headphones" + Keys.ENTER);
        //aramaKutusu.submit();

        //<span dir="auto">1-16 of 619 results for</span><span dir="auto"> </span><span class="a-color-state a-text-bold" dir="auto">"samsung headphones"</span>
        WebElement sonucSayisi = driver.findElement(By.xpath("//span[@dir='auto']"));
        System.out.println(sonucSayisi.getText());

      // <div class="a-section aok-relative s-image-fixed-height">



        //<img src="https://m.media-amazon.com/images/I/71s+CTbFCiL._AC_UY218_.jpg" class="s-image" alt="OEM ElloGear Earbuds Stereo Headphones for Samsung Galaxy S10 S10e Plus Cable - Designed by AKG - with Microphone and Volume Buttons (Grey)" srcset="https://m.media-amazon.com/images/I/71s+CTbFCiL._AC_UY218_.jpg 1x, https://m.media-amazon.com/images/I/71s+CTbFCiL._AC_UY327_FMwebp_QL65_.jpg 1.5x, https://m.media-amazon.com/images/I/71s+CTbFCiL._AC_UY436_FMwebp_QL65_.jpg 2x, https://m.media-amazon.com/images/I/71s+CTbFCiL._AC_UY545_FMwebp_QL65_.jpg 2.5x, https://m.media-amazon.com/images/I/71s+CTbFCiL._AC_UY654_FMwebp_QL65_.jpg 3x" data-image-index="1" data-image-load="" data-image-latency="s-product-image" data-image-source-density="1">
//        WebElement ilkUrun = driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));
//        ilkUrun.click();
//        System.out.println(ilkUrun.getText());

        List<WebElement> listem = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-norma']"));
        for (WebElement w: listem){
            System.out.println(w.getText());
        }










    }
}
