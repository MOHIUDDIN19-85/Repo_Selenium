package Class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework12 {
   /** @Test
    public void verifySummaruyTemp(){
        /**
         * Launch darksky.net
         * find summary-temp element using locator
         * get the text from the element
         * verify temp value is more than 10
         */
        /**System.setProperty("webdriver.chrome.driver","./DriverExe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.darksky.net");
        String feelsLike = "//span[@class='feels-like-text']";
        By currentTempLocator = By.xpath(feelsLike);
        WebElement currentTempWE = driver.findElement(currentTempLocator);
        String currentTempText =currentTempWE.getText();
        String[] spTemp =currentTempText.split("˚");
        int feelTempInt = Integer.valueOf(spTemp[0]);
        System.out.println(feelTempInt);
        WebElement lowTemp = driver.findElement(By.xpath("//span[@class='low-temp-text']"));
        String lowTempText = lowTemp.getText();
        String[] lwTemp = lowTempText.split("˚");
        int lowTempInt =Integer.valueOf(lwTemp[0]);
        System.out.println(lowTempInt);
        WebElement highTemp = driver.findElement(By.xpath("//span[@class='high-temp-text']"));
        String highTempText = highTemp.getText();
        String[] hgTemp = highTempText.split("˚");
        int highTempInt = Integer.valueOf(hgTemp[0]);
        System.out.println(highTempInt);
        Assert.assertTrue(feelTempInt>lowTempInt,"Feel temp is not greater than low temp");
        Assert.assertTrue(feelTempInt<highTempInt,"Feel temp is not less than high temp");

    }*/
    //testcase-3
    @Test
    public void verifyDates(){
        System.setProperty("webdriver.chrome.driver","./DriverExe/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.darksky.net");
        WebElement tempInFarenheight = driver.findElement(By.xpath("//span[@class='summary swap']"));
        String tempFText =tempInFarenheight.getText();
        String[] tempFText1 = tempFText.split("˚");
        int tempFInt = Integer.valueOf(tempFText1[0]);
        WebElement tempSelect = driver.findElement(By.xpath("//b[@class='button']/ancestor::div[@class='options']/preceding::form[@id='searchForm']"));
        tempSelect.click();
    }

}
