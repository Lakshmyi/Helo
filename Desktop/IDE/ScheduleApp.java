package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ScheduleApp {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://96.84.175.78/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testScheduleApp() throws Exception {
    driver.get(baseUrl + "/MMP-Release2-Integrated-Build.6.8.000/portal/index.php");
    driver.findElement(By.cssSelector("span.hidden-minibar")).click();
    try {
      assertTrue(isElementPresent(By.cssSelector("a.dropdown > span.hidden-minibar")));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertTrue(isElementPresent(By.xpath("//li[4]/a/span")));
    driver.findElement(By.xpath("//li[4]/a/span")).click();
    assertEquals(driver.findElement(By.xpath("//input[@value='Create new appointment']")).getAttribute("value"), "Create new appointment");
    driver.findElement(By.xpath("//input[@value='Create new appointment']")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}


///

import java.util.concurrent.TimeUnit;
	import org.testng.annotations.*;
	import static org.testng.Assert.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class ScheduleApp {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://96.84.175.78/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testScheduleApp() throws Exception {
	    driver.get(baseUrl + "/MMP-Release2-Integrated-Build.6.8.000/portal/index.php");
	    driver.findElement(By.cssSelector("span.hidden-minibar")).click();
	    
	    //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    //driver.findElement(By.cssSelector("a.dropdown > span.hidden-minibar")).click();
	    //driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	    
	    
	    
	    try {
	      assertTrue(isElementPresent(By.cssSelector("a.dropdown > span.hidden-minibar")));
	    } catch (Error e) {
	      verificationErrors.append(e.toString());
	    }
	    assertTrue(isElementPresent(By.xpath("//li[4]/a/span")));
	    driver.findElement(By.xpath("//li[4]/a/span")).click();
	    WebDriverWait wait = new WebDriverWait(driver,30);
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Create new appointment']")));
	    element.isDisplayed();
	    
	    
	    
	    assertEquals(driver.findElement(By.xpath("//input[@value='Create new appointment']")).getAttribute("value"), "Create new appointment");
	    driver.findElement(By.xpath("//input[@value='Create new appointment']")).click();
	    
	    driver.findElement(By.xpath("//h4[contains(text(),'Dr.Smith')]/ancestor::ul/following-sibling::button")).click();
	    driver.switchTo().frame("myframe");
	    driver.findElement(By.xpath(".//*[@id='datepicker']")).click();
	    
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

public class ScheduleApp(){ 
	WebDriver driver;
	@Test
public void testScheduleApp throws Exception{
}
	
	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		
	    WebDriver driver = new FirefoxDriver();
	    
	    driver.get("http://96.84.175.78//MMP-Release2-Integrated-Build.6.8.000//portal//index.php");
	    driver.manage().window().maximize();
	    driver.findElement(By.cssSelector("span.hidden-minibar")).click();
	    
	    driver.findElement(By.xpath("//li[4]/a/span")).click();
	    driver.findElement(By.xpath("//input[@value='Create new appointment']")).click();
	    
}   
	   


	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}

<tr>
	<td>verifyElementPresent</td>
	<td>css=#search</td>
	<td></td>
</tr>
<tr>
	<td>click</td>
	<td>
name=submit</td>
	<td></td>
</tr>


File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {
 // now copy the  screenshot to desired location using copyFile //method
FileUtils.copyFile(src, new File("C:/selenium/error.png"));
}
 
catch (IOException e)
 {
  System.out.println(e.getMessage());
 
 }
 }
 