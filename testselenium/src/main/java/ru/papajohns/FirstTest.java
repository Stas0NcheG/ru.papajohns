package ru.papajohns;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\svsidorov\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.papajohns.ru/");
        String titel = driver.getTitle();
        System.out.println(titel);

            WebElement button = driver.findElement(By.xpath("//*[@id=\"HomePage__inner\"]/section/div[1]/div[1]/ul/li[31]/div/div[2]/a"));
            button.click();
            WebElement button1 = driver.findElement(By.xpath("//*[@id=\"SceneScroll\"]/div/div/div[2]/div[1]/div[2]"));
            button1.click();
            WebElement button2 = driver.findElement(By.xpath("//*[@id=\"SceneScroll\"]/div/div/div[2]/div[2]/div/div[4]"));
            button2.click();
            WebElement button4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div[2]/div[3]/div/button"));
            button4.click();
            WebElement button5 = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
            button5.click();
            WebElement button6 = driver.findElement(By.xpath("//*[@id=\"SceneScroll\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]"));
            button6.click();
            WebElement button7 = driver.findElement(By.xpath("//*[@id=\"SceneScroll\"]/div[2]/div[2]/div"));
            button7.click();
            WebElement button8 = driver.findElement(By.xpath("//*[@id=\"SceneScroll\"]/div[2]/div[2]/div[2]/div/div[4]/div[1]"));
            button8.click();
            WebElement button9 = driver.findElement(By.xpath("//*[@id=\"SceneScroll\"]/div[2]/div[3]/div"));
            button9.click();
            WebElement button10 = driver.findElement(By.xpath("//*[@id=\"SceneScroll\"]/div[2]/div[3]/div[2]/div/div[10]/div[1]"));
            button10.click();
            WebElement button11 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div[2]/div[3]/div/button[2]"));
            button11.click();
            WebElement button12 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div[2]/div[3]/div/button[2]"));
            button12.click();
            WebElement button13 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div/div/div[2]/a[2]"));
            button13.click();
            WebElement button14 = driver.findElement(By.xpath("//*[@id=\"user_data.username\"]"));
            button14.sendKeys("Станислав");
        WebElement button15 = driver.findElement(By.xpath("//*[@id=\"user_data.email\"]"));
        button15.sendKeys("stas_098@mail.ru");
        WebElement button16 = driver.findElement(By.xpath("//*[@id=\"user_data.phone\"]"));
        button16.sendKeys("9998053525");

        //*[@id="user_data.phone"]
//        driver.quit();
    }
}
