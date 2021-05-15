import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class First_Testcase {

    @Test
    public void setup() {
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\IdeaProjects\\samplejava_project\\Drivers\\chromedriver.exe");
      // WebDriver driver= new ChromeDriver();
       //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.get("https://www.google.com");
        System.out.println("setup completed");


    }

    @Test
    public void login() {
        System.out.println("login completed");
    }

    @Test
    public void teardown() {
        System.out.println("teardowm completed");
    }


}
