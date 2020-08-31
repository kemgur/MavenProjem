package ornekProjeler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pratice_01 {

    private WebDriver deriver;

    @BeforeClass
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        deriver = new FirefoxDriver();
        deriver.manage().window().maximize();
    }


    @Test
    public void test01() {
        //As a user I should be able to see title as ETSY

        //go to https://www.estsy.com/
        deriver.get("https://etsy.com");
        //get title
        String ttl = deriver.getTitle();
        //confirm that is ETSY
        Assert.assertEquals(ttl,"ETSY");


    }
    @AfterClass
    public void closeDriver(){

    }

    public void test02() {

    }

    public void test03() {

    }
}
