package Pages;

import Utilities.GWD;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Parent {

    public void sendKeysFunction (WebElement element99, String value) {//3.Aşama
        waitUntilVisible(element99); // gözükene kadar bekle
        scrollToElement(element99); // elemente scroll yap
        element99.clear();   // temizle
        element99.sendKeys(value); // değeri gönder
    }

    public void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickFunction(WebElement element)  {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        waitUntilVisible(element);

        waitUntilClickable(element); // tıklanabilir olana kadar bekle
        //   scrollToElement(element); // elemente scroll yap
        element.click(); // click yap
    }

    public void scrollclick(WebElement element)
    {

        waitUntilVisible(element);
        waitUntilClickable(element); // tıklanabilir olana kadar bekle
        scrollToElement(element); // elemente scroll yap
        element.click(); // click yap
    }

    public static void select(WebElement element,String value)
    {
        Select selectcountry=new Select(element);
        selectcountry.selectByVisibleText(value);

    }
    public void clear(WebElement element)
    {
        scrollToElement(element);
        element.clear();
    }

    public void Assertion(WebElement actual,String expected)
    {

        waitUntilVisible(actual);
        Assert.assertEquals(actual.getText(),expected);

    }

    public void waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element, String text)
    {
        waitUntilVisible(element); // gözükene kadar bekle
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public void waitUntilLoading() {
        WebDriverWait wait=new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
    }

    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }

}
