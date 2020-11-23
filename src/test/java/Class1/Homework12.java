package Class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework12 {
    @Test
    public void verifySummaruyTemp(){
        /**
         * Launch darksky.net
         * find summary-temp element using locator
         * get the text from the element
         * verify temp value is more than 10
         */
        System.setProperty("webdriver.chrome.driver","./DriverExe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.darksky.net");
        String currentTemp = "//span[@class='summary swap']";
        By currentTempLocator = By.xpath(currentTemp);
        WebElement currentTempWE = driver.findElement(currentTempLocator);
        String currentTempText =currentTempWE.getText();
        String[] spTemp =currentTempText.split("˚");
        int currTempInt = Integer.valueOf(spTemp[0]);
        Assert.assertTrue(currTempInt>10,"current temp is less then 10");
    }

}
