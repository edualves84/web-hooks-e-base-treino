package web;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends  Base{

    Base base;

    public Hooks(Base base) {
        this.base = base;
    }

    @Before

    public void startTestCaneta(){

     System.setProperty("webdriver.chrome.driver","driver/92/chromedriver.exe");
     base.driver = new ChromeDriver();
     base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
     base.driver.manage().window().maximize();

  }

    @After
    public void QuitTestCaneta(){
      base.driver.quit();

   }

}
