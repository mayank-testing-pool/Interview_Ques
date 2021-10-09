package src.main.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class selectfromDropdownUsignActionclass {
    public static void main (String [] args) throws InterruptedException
            {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","D:\\Mayank\\Selenium\\Selenium 2021\\Interview_Question\\support\\chromedriver_94.0.exe");
        //System.setProperty("webdriver.chrome.driver","D:\\Mayank\\Selenium\\Selenium 2018\\Interviiew_Ques\\support\\chromedriver_92.0.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        WebElement drop_down = driver.findElement(By.name("country"));
        WebElement val_dropdown = driver.findElement(By.xpath("//option[contains(text(),'BOLIVIA')]"));
        // select value in drop down By select class
        Select select = new Select(drop_down);
        select.selectByVisibleText("BOSNIA AND HERZEGOVINA");
        Thread.sleep(3000);
        //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


        // select value in drop down By action class
        Actions action = new Actions(driver);
        drop_down.click();
        Actions selectdropdownobject = action.moveToElement(val_dropdown).click();
        selectdropdownobject.build().perform();
        //action.click(drop_down).click(val_dropdown);
        //action.moveToElement(val_dropdown).click();
        //driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        Thread.sleep(6000);
        driver.quit();





    }
}
