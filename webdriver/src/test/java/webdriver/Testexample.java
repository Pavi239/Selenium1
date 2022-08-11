package webdriver;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Testexample {
  
	WebDriver driver;
	private String lastwindow;

	@BeforeTest
	
		public void beforeTest()
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.navigate().to("file:///C:/Users/jaya2/Downloads/janki2.html");
		//driver.navigate().to("https://demoqa.com/webtables");
		//driver.navigate().to("https://demoqa.com/buttons");
		//driver.navigate().to("https://demoqa.com/browser-windows");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		//driver.navigate().to("https://demoqa.com/frames");
		driver.manage().window().maximize();

}
	
	@Test(enabled = false)
	
	public void testcase()
	{
		//This below lines will get the second cell value//
				String t = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
				System.out.println(t);
				//To identify the name ABHI//
				String s = driver.findElement(By.xpath("//*[contains(text(),'Abhi')]")).getText();
				System.out.println(s);
				String a = driver.findElement(By.xpath("//tbody/tr[4]/td[3]")).getText();
				System.out.println(a);
	}
	
	@Test(enabled=false)
	public void testcase1() throws InterruptedException
	{
		//String t = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
		//System.out.println(t);
		//To identify the name ABHI//
		//String s = driver.findElement(By.xpath("//*[contains(text(),'Cierra')]")).getText();
		
		//System.out.println(s);
		
		
		//String s = driver.findElement(By.xpath("//*[contains(text(),'Cierra')]"))
		//String a = driver.findElement(By.xpath("//tbody/tr[4]/td[3]")).getText();
		//System.out.println(a);
		//String j=driver.findElement(By.xpath("//*[@class='ReactTable -striped -highlight']")).getText();
		//System.out.println(j);
		//String j=driver.findElement(By.xpath("//*[@class='ReactTable -striped -highlight']")).getText();
		// System.out.println(j);
		// driver.findElement(By.xpath("//[contains(text(),'Cierra')]//following-sibling::div[6]/div/span[2]")).click();

	WebElement dc = driver.findElement(By.id("doubleClickBtn"));
	Actions act = new Actions(driver);
	act.moveToElement(dc).doubleClick().build().perform();
	
	//RightClick
	
	WebElement rclick = driver.findElement(By.id("rightClickBtn"));
	
	act.moveToElement(dc).doubleClick().build().perform();
	//Dynamic id Clickme
	String dynamicid = driver.findElement(By.xpath("//*[text()='Click Me']")).getAttribute("id");
	  System.out.println(dynamicid);
	  driver.navigate().refresh();
	  Thread.sleep(4000);
	  String dynamicid1 = driver.findElement(By.xpath("//*[text()='Click Me']")).getAttribute("id");
	  System.out.println(dynamicid1);
	  
	
	
	}




@Test(enabled=false)
public void testcasee() throws InterruptedException
{
	String parentwindow = driver.getWindowHandle();
	System.out.println(parentwindow);
	WebElement windbtn = driver.findElement(By.id("windowButton"));
	for(int i=0;i<3;i++);
	{
		windbtn.click();
	}
	
	Set<String>allwindow = driver.getWindowHandles();
	System.out.println(allwindow);
	for(String handle : allwindow)
	{
		System.out.println("i want to open google.com in all the window");
		WebDriver window = driver.switchTo().window(handle);
		driver.get("https://www.google.com");
		 lastwindow=handle;
	}
	
	Thread.sleep(3000);
	driver.switchTo().window(parentwindow);
	driver.get("https://opensource-demo.orangehrmlive.com");
	 
	driver.close();
	
	
	
	driver.switchTo().window(lastwindow);
	driver.get("http://www.gmail.com");
	
	
}
@Test(enabled=false)
public void t() throws InterruptedException
{
	JavascriptExecutor	js=( JavascriptExecutor)driver;
	 String title=js.executeScript("return document.title").toString();
	 System.out.println(title);
	 
	 String url=js.executeScript("return document.URL").toString();
	 System.out.println(url);
	 
	 String domain=js.executeScript("return document.domain").toString();
	 System.out.println(domain);
	 String alltext=js.executeScript("return document.documentElement.innerText").toString();
	 System.out.println(alltext);
	 String parenttab = driver.getWindowHandle();
	 driver.switchTo().window(parenttab);
	 //using this line we are going to new tab//
	 WebDriver newtab = driver.switchTo().newWindow(WindowType.TAB);
	 newtab.get("https://f1.com");
	 Thread.sleep(3000);
	 //driver.navigate().back();
	 //have to declare parent tab//
	 
//	 Set<String>alltab = driver.getWindowHandles();
//	 Object[] altab = alltab.toArray();
//	 System.out.println(alltab.size());
//	 
//	 driver.switchTo().window(String) altab[0];
//	 driver.close();
//	 driver.switchTo().window(String) altab[1];
	 driver.get("https://google.com");
	 Thread.sleep(3000);
	// driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Moolya",Keys.ENTER);
	 		
//	 act.sendKeys(Keys.PAGE_DOWN).build().perform();
//	 act.sendKeys(Keys.PAGE_DOWN).build().perform();
	 //js.executeScript("window.scrollBy(0,600)");
	 //if you want to scroll to end of the page,then you can use document.body.scrollHeight//
 //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
 //Thread.sleep(3000);
 //if i want to scroll all the way up then i use this below code//
 //js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
// js.executeScript("document.getElementByClassName('LC201b MBeuO DKVOMd')[4].scrollIntoView()");
// Thread.sleep(3000);
// driver.findElement(By.partialLinkText("Moolya Software Testing Reviews by 48 Employees")).click();
// 
driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		//this method will help us to scroll a specific element//
		//js.executeScript("document.getElementById('ohrmList_chkSelectRecord_29').scrollIntoIew()");
		//whenever we give to string we use return it is used to store and retuen the value//
		
	//String tabledata=	js.executeScript("return document.getElementById('resultTable').innerHTML").toString();
	String tabledata=	js.executeScript("return document.getElementById('resultTable').innerText").toString();
	//it will print all the table data//
	System.out.println(tabledata);
	//if i want to refresh the page using javascript//
	js.executeScript("history.go(0)");
	Thread.sleep(3000);
	//if i wnat to go back using javascript//
	js.executeScript("window.history.back()");
	Thread.sleep(3000);
	//if i want to forward using javascript//
	js.executeScript("window.history.forward()");
	Thread.sleep(3000);
	//java script has the ability to create alerts//
	//this is a simple alert//this will pop on the application//
	js.executeScript("alert('welcome to moolya')");
	Thread.sleep(3000);
	//this will handle the alert//
	driver.switchTo().alert().accept();
	
	///i can also create confirm alert//
	//confirm is used to provide with ok and cancel button//
	js.executeScript("confirm('my name is not rohini')");
	Thread.sleep(3000);
	String message = driver.switchTo().alert().getText();
	Thread.sleep(3000);
	System.out.println(message);		
	//if we want to click ok//
	driver.switchTo().alert().dismiss();
	
	js.executeScript("prompt(enter your name','yes/no')");
	Thread.sleep(3000);
	driver.switchTo().alert().sendKeys("pavi");
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
}
@Test(enabled=false)
public void testcase3() throws InterruptedException, AWTException
{
	JavascriptExecutor	js=( JavascriptExecutor)driver;
	driver.get("https://google.com");
	driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cricinfo",Keys.ENTER);
	 driver.findElement(By.partialLinkText("Live cricket scores, match schedules, latest cricket news ...")).click();
	 driver.findElement(By.partialLinkText("Teams")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.linkText("India")).click();
	 Thread.sleep(3000);
	// js.executeScript("document.getElementsById('ds-flex ds-flex-row ds-space-x-4')[0].scrollIntoView()");
	 driver.findElement(By.partialLinkText("Ganguly, Morgan, Muralidaran, Misbah, Johnson among 53 players in Legends League Cricket")).click();
	
//	 Actions act = new Actions(driver);
////	 act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).build().perform();
//	 WebElement dd = driver.findElement(By.className("ds-grow"));
//	Select sell = new Select(dd);
//	sell.selectByVisibleText("India");
//	 Robot rbt = new Robot();
//	 rbt.keyPress(KeyEvent.VK_DOWN);
//	 rbt.keyPress(KeyEvent.VK_DOWN);
//	 rbt.keyPress(KeyEvent.VK_DOWN);
//	 rbt.keyPress(KeyEvent.VK_DOWN);
//	 rbt.keyPress(KeyEvent.VK_ENTER);
//	
}


@Test(enabled=false)
public void testcase4() throws InterruptedException
{
	driver.get("https://demo.guru99.com/test/newtours/");
	driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("pavi");
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("pavi123");
	driver.findElement(By.xpath("//*[@name='submit']")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Home")).click();
	Thread.sleep(3000);
	System.out.println("Home:"+"   "+"Working");
	driver.findElement(By.linkText("Flights")).click();
	Thread.sleep(3000);
	System.out.println("Flights:"+"   "+"Working");
	driver.findElement(By.linkText("Hotels")).click();
	Thread.sleep(3000);
	System.out.println("Hotels:"+"   "+"Under Construction");
	driver.findElement(By.linkText("Car Rentals")).click();
	Thread.sleep(3000);
	System.out.println("Car Rentals:"+"   "+"Under Construction");
	driver.findElement(By.linkText("Cruises")).click();
	Thread.sleep(3000);
	System.out.println("Cruises:"+"   "+"Under Construction");
	driver.findElement(By.linkText("Destinations")).click();
	Thread.sleep(3000);
	System.out.println("Destinations:"+"   "+"Under Construction");
	driver.findElement(By.linkText("Vacations")).click();
	Thread.sleep(3000);
	System.out.println("Vacations:"+"   "+"Under Construction");
}

@Test(enabled=false)
public void testcase5() throws InterruptedException
{
	String baseURL = "https://demo.guru99.com/test/newtours/index.php";
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(baseURL);
	//TO GET THE TITLE IN Website page in console give like document.title it will give the title of the page as underconstruction//
	
	String underconstrction = "Under Construction: Mercury Tours";
	//To click on all the links//
	List<WebElement> alllink = driver.findElements(By.tagName("a"));
	//i want to findout the size and store it in an array//so that i can navigate to each link//
	String[] linktext = new String[alllink.size()];
	int i=0;
	
	//in this for loop i am extracting the text of each link storing it in linktext//
	for(WebElement e : alllink)
	{
		linktext[i] = e.getText();
		i++;
	}
	//test each link//
	for(String q : linktext)
	{
		System.out.println(q);
		Thread.sleep(9000);
		driver.findElement(By.linkText(q)).click();
		if(driver.getTitle().equals(underconstrction))
		{
			System.out.println(q + "is under construction");
		}
		else
		{
			System.out.println(q +" link is working");
		}
		Thread.sleep(5000);
		driver.navigate().back();
	}
	driver.quit();
}

@Test(enabled=false)
public void testcase6() throws InterruptedException
{
	List<WebElement>frames = driver.findElements(By.tagName("iframe"));
	System.out.println(frames.size());
	
	for(int i=0;i<frames.size();i++)
	{
		String name = frames.get(i).getAttribute("id");
		System.out.println(name);
		
		
	}
	//in this line you are inside  frame//
	driver.switchTo().frame("frame1");
	String frame1text = driver.findElement(By.id("sampleHeading")).getText();
	System.out.println(frame1text);
	//but if you want to come out of the frame//
	driver.switchTo().defaultContent();
	driver.switchTo().frame("frame2");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
	
}

@Test
public void excel() throws InterruptedException, IOException
{
	//i have to fetch the excel file//
	//whenever you want to fetch data from file you use (java.io)//
	File poiexcel = new File("C:\\Users\\Kaviyarasu Kumaravel\\Documents\\APache.xlsx");
	//apache poi supports xls,xlsx format and it supports word,powerpoint entore microsoft office//
	//if i want to read the data from file use input stream//
	FileInputStream fis = new FileInputStream(poiexcel);
	//there are two methods in apache POI//
	//There are XSSF AND HSSF//
	//XSSF are used for xlsx/
	//HSSF are used for xls//
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	 XSSFSheet sheet= wb.getSheet("Sheet1");
	 int rowcount= sheet.getLastRowNum();
	 //System.out.println(rowcount);
	 for(int i=0;i<=rowcount;i++)
		{
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String pwd = sheet.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			driver.findElement(By.id("txtPassword")).sendKeys(pwd);
			driver.findElement(By.id("btnLogin")).click();
			System.out.println(username);
			System.out.println(pwd);
			
			Thread.sleep(3000);
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
			Thread.sleep(3000);
			
		}
		wb.close();
		driver.close();
 }


@AfterTest
public void aftertest()
{
	//driver.close();
}
}
