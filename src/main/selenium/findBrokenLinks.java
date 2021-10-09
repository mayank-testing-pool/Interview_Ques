package src.main.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class findBrokenLinks {
    public static void main (String [] str)
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","D:\\Mayank\\Selenium\\Selenium 2021\\Interview_Question\\support\\chromedriver_94.0.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        links.addAll(driver.findElements(By.tagName("img")));
        int all = links.size();
        System.out.println("Total links on the page are "+all);
        List<WebElement> actlink = new ArrayList<WebElement>();

        for (int i = 0;i<all;i++)
        {
            //System.out.println ("href on the pages are "+links.get(i));
            System.out.println("URL on the page are "+links.get(i).getAttribute("href"));
            if (links.get(i).getAttribute("href")!=null) {
                actlink.add(links.get(i));
            }
        }
        System.out.println("Total active link On the page are "+actlink.size());
        for (int j = 0;j<actlink.size();j++)
        {
            System.out.println("Active link "+actlink.get(j).getAttribute("href"));
        }




    }

}
