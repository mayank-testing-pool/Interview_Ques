import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

    public static void main (String [] arg )
    {
        String url = "https://www.flipkart.com/";
        String search_phone="samsumg mobiles";
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","D:\\Mayank\\Selenium\\Selenium 2018\\Interviiew_Ques\\support\\chromedriver_2.41.exe");
        driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys(search_phone);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div[1]/div/section[7]/div[2]/div/div[1]/div/label/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[1]/div/div/div[2]/div[3]")).click();


    }
}
