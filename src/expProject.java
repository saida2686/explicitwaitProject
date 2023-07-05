import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class expProject  extends Main{

    @Test
    public  void alertBtn(){
        driver.get("file:///Users/saida/Downloads/waits.html");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

    }
    @Test
    public void changeTxt(){
        driver.get("file:///Users/saida/Downloads/waits.html");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(By.id("populate-text")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[@id='h2']"))));
        // String text=driver.findElement(By.xpath("//h2[@id='h2']")).getText();
        // Assert.assertEquals(text,"Selenium Webdriver");


    }
    @Test
    public void displayBtn(){
        driver.get("file:///Users/saida/Downloads/waits.html");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(By.xpath("//button[@class='btn btn-display']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='display-other-button']"))).click();



    }
    @Test
    public void enableBtn(){
        driver.get("file:///Users/saida/Downloads/waits.html");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@class='btn btn-primary-display']"))));

    }
    @Test
    public void checkboxBtn(){
        driver.get("file:///Users/saida/Downloads/waits.html");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(35));
        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='checkbox']"))));

    }

}



