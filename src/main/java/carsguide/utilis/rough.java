package carsguide.utilis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rough {

  public static void printElementLocator(WebElement element) {
    String locator = getElementLocator(element);
    System.out.println("Locator for the element: " + locator);
  }

  private static String getElementLocator(WebElement element) {
    String elementDescription = element.toString();

    // Extract the part of the string that contains the locator information
    String locatorInfo = elementDescription.substring(elementDescription.indexOf(" -> ") + 4);

    // Clean up the locator information
    locatorInfo = locatorInfo.replaceAll("(?<=\\s)\\[.*\\]$", "");

    return locatorInfo;
  }

  public static void main(String[] args) {
    // Example usage
    WebDriver driver = new ChromeDriver();
    driver.get("https://example.com");

    WebElement sampleElement = driver.findElement(By.id("sampleId"));
    printElementLocator(sampleElement);

    driver.quit();
  }
}
