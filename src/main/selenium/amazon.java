/*Open Amazon.com, Got to Amazon Eco section, search for Snow 8 and display the price
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazon {

    public static void main (String [] argd)
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","D:\\Mayank\\Selenium\\Selenium 2018\\Interviiew_Ques\\support\\chromedriver_92.0.exe");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--no sandbox");
        //options.setBinary("C:\\Program Files\\Google\\Chrome\\Application");
        //driver =new ChromeDriver(options);
        driver =new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]")).click();
        driver.findElement((By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[5]"))).click();
        String price = driver.findElement(By.xpath("//*[@id=\"priceblock_ourprice_row\"]/td[2]")).getText();
        System.out.println("Price of echo snow 8 = "+price);
    }

}
