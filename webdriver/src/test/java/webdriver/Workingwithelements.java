package webdriver;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import javax.swing.border.TitledBorder;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Workingwithelements {
	WebDriver driver;

	@BeforeTest
	
		public void beforeTest()
		{
		//Automatically downloads driver from the server and helps you to run the program//
		//whatever the version it automatically downloads the version and executes//
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com");
		//driver.navigate().to("https://www.google.com");
		//driver.navigate().to("https://demoqa.com/upload-download");
		driver.navigate().to("https://demoqa.com/alerts");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		//driver.get("https://demo.guru99.com/test/newtours/");
		//getTitle is to fetch the title of the webpage store it in string variable called Title//
		//String Title = driver.getTitle();
		//String Url = driver.getCurrentUrl();
		//System.out.println(Title + "  "+Url);
		//Title is expected result orangehrm is actual result if not same test will fail//
		//Assert.assertEquals(Title, "OrangeHRM");
		//Assert.assertEquals(Url,"https://opensource-demo.orangehrmlive.com/");
		
		
		
		}
	//@Test
//public void f() throws InterruptedException
//{
//		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("jaya");
//		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("jaya123");
//		driver.findElement(By.xpath("//*[@name='submit']")).click();
//		//once the login is done assert on login successfull//
//		
//				String hd=driver.findElement(By.xpath("//tbody/tr/td/h3")).getText();
//				Assert.assertEquals("Login Successfully", hd);
//				
//				//linktext is the locator//
//				driver.findElement(By.linkText("Flights")).click();
//				Thread.sleep(3000);
//				//partiallink text locator//
//			//	driver.findElement(By.partialLinkText("Car")).click();
	//Radio button//
//				driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
//				WebElement dd = driver.findElement(By.name("passCount"));
//				Select sell = new Select(dd);
//				Thread.sleep(3000);
//				//This is basically select the first value in an element by using visible text//
//				sell.selectByVisibleText("1");
//				Thread.sleep(3000);
//				//This is based on index//it will select 4//
//				sell.selectByIndex(3);
//				Thread.sleep(3000);
//				sell.selectByValue("2");
//				WebElement dd1 = driver.findElement(By.name("fromPort"));
//				Select sell2 = new Select(dd1);
//				//Get all the values from the drop down//
//				//If the value is more then we use list of webelement//if i am storing only one value then it is webelement// 
//				List<WebElement>values= sell2.getOptions();
//				//i have to get the size of value//
//				System.out.println(values.size());
//				//if i to print the values//i have to use for loop//
//				for(int i=0;i<values.size();i++)
//				{
//					System.out.println(values.get(i).getText());
//				}
//				//it will select the value from dropdown//select by index is by number it select//
//				sel2.selectByIndex(2);
//				//selectByvalue i by value what we have give//
//				//sel2.selectByValue("London");
//				//Whatever i selected i have to get that value//and store it in variable//
//				//THis below lines are fetch the value from dropdown//
//				WebElement first = sel2.getFirstSelectedOption();
//				System.out.println(first.getAttribute("value"));
//}
	@Test(enabled = false)
	public void testcase4() throws InterruptedException
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		//There is a test case how many visible links are present after login fetch there names and print it
     	//tagname called a this means a link 
		//am i looking for one link or multiple link
		//findElement = this will find one element
		//findelements= this will automatically find all the element
		//when u have 2 or more elements with same attribute we use findelements
		
		      
			
		//List<WebElement> link= driver.findElements(By.tagName("a"));
	    //total number of links
		//System.out.println("Total number of links are "+link.size());
	    //i want u guys to print all the visible link//using loop
//		for (int i=0;i<link.size();i++)
//		{
//			System.out.println(link.get(i).getText());
//		}
	//for enhanced loop
//		for(WebElement e:link)
//		{
//			String eachlink = e.getText();
//			System.out.println(eachlink);
//			}
	// i want u to logout //tell wt kind of 
//		driver.findElement(By.partialLinkText("welcome")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Logout")).click();	
		
		// hods like mouseover,move to element etc
		//i want u to click on pin link // write the code
		driver.findElement(By.linkText("PIM")).click();	
		//i want to go back to the previous page
		//there is method called navigate//contains back
//		driver.navigate().back();
//		//now i want to go forward
//		driver.navigate().forward();
//		//there is a situation //and that is i want to refresh my page
//		driver.navigate().refresh();
//		//now i want to navigate to a different URL
//		driver.navigate().to("https://www.google.com");
		//driver.get//to get the URL
		//driver.navigate.to//this also will help us to fetch the url
		//Action is a class which contains some met
	WebElement cllink	=driver.findElement(By.linkText("Configuration"));
	Actions act = new Actions(driver);
	act.moveToElement(cllink).build().perform();
	//basically what i am 
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	act.sendKeys(Keys.ARROW_DOWN).build().perform();
	//i want to click enter from the build
	act.sendKeys(Keys.RETURN).build().perform();
	
	}
	@Test(enabled = false)
	public void testcase5()
	{
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		//Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.RETURN).build().perform();
	}
	@Test(enabled = false)
	public void testcase6() throws InterruptedException, AWTException
	{
		//i want to goole.com
		
		WebElement link = driver.findElement(By.linkText("Gmail"));
				Thread.sleep(3000);
		Actions act = new Actions(driver);
					
		//context clik is a selenium method to right click on my element
		act.contextClick(link).build().perform();
		
		//act.sendKeys(Keys.CONTROL,Keys.ARROW_DOWN,Keys.CONTROL,Keys.ARROW_DOWN).build().perform();
		//act.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();
		//act.sendKeys(Keys.CONTROL,Keys.ARROW_DOWN).build().perform();
		//act.sendKeys(Keys.ENTER).build().perform();
        //when i right click i get features from browser i i want to automate i use something called robot class 
		Robot rbt = new Robot();
		 rbt.keyPress(KeyEvent.VK_DOWN);
		 rbt.keyPress(KeyEvent.VK_DOWN);
	 rbt.keyPress(KeyEvent.VK_UP);
		 //i want to click on enter or return using robot
		 rbt.keyPress(KeyEvent.VK_ENTER);
		 //i want u to play with the tab//at present which tab i am in google //let get the title of the page//google
		 //i will into 
//		 act.sendKeys(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
//		 Thread.sleep(3000);
//	     String Title = driver.getTitle();
//	     System.out.println(Title);
//	     act.sendKeys(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
//	     String Title1 = driver.getTitle();
//	     System.out.println(Title1);
//		 rbt.keyPress(KeyEvent.VK_CONTROL);
//		 rbt.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(3000);
	    // driver.get("https://opensource-demo.orangehrmlive.com");
		// act.sendKeys(Keys.CONTROL + "\t").build().perform();
	     
	
	}
	
	
	@Test(enabled= false)
	
	public void testcase8()
	{
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\jaya2\\OneDrive\\Desktop\\Dummy.xlsx");
		
		
		
	}
	
	
	
	@Test
	public void testcase10() throws InterruptedException
	{
		driver.findElement(By.id("alertButton")).click();
		  Alert alt = driver.switchTo().alert();
		  System.out.println(alt.getText());
		  Thread.sleep(3000);
		  alt.accept();
		  
		  driver.findElement(By.id("confirmButton")).click();
		  Thread.sleep(3000);
		  alt.dismiss();
		  
		  driver.findElement(By.id("promtButton")).click();
		  Thread.sleep(3000);
		  alt.sendKeys("Jaya");
		  Thread.sleep(3000);
		  System.out.println(alt.getText());
		  alt.accept();
		  
		  driver.findElement(By.id("timerAlertButton")).click();
		 // WebDriverWait webdwait = new WebDriverWait(driver, 180);
	  WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(180));
		  webdwait.until(ExpectedConditions.alertIsPresent());
		  alt.accept();
	}
	
	
@AfterTest
public void afterTest()
{
//driver.close();
}

}
	

