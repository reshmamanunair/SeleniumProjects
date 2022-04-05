package SeleniumAssignmentProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.findElement(By.id("txtUsername")).click();
driver.findElement(By.id("txtUsername")).sendKeys("Admin");

//for css selector when id is given tagname#id
//driver.findElement(By.cssSelector("input#txtPassword")).click();

driver.findElement(By.name("txtPassword")).click();
driver.findElement(By.name("txtPassword")).sendKeys("admin123");


driver.findElement(By.id("btnLogin")).click();
//login button using name
//driver.findElement(By.name("Submit")).click();

//login button using class name

//driver.findElement(By.className("button")).click();
//for css selector when class name is given Css ---->selector=tagname.classname
//driver.findElement(By.cssSelector("input.button")).click();
//for css selector we don't have id or name(no name or id locators) then---->Tagname[attribute='value']
//driver.findElement(By.cssSelector("input[value='LOGIN']")).click();

driver.findElement(By.id("MP_link")).click();
driver.findElement(By.id("buyBtn1")).click();
Thread.sleep(3000);
driver.findElement(By.id("email")).click();
driver.findElement(By.id("email")).sendKeys("reshmanair232@gmail.com");
driver.findElement(By.id("contactNumber")).click();
driver.findElement(By.id("contactNumber")).sendKeys("+919442686272");

driver.findElement(By.id("organization")).click();
driver.findElement(By.name("organization")).sendKeys("obsqura");
driver.findElement(By.id("modal_confirm_buy")).click();
//driver.findElement(By.className("btn cancel")).click();

driver.findElement(By.id("welcome")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("Logout")).click();

//driver.findElement(By.cssSelector("span#spanMessage")).getText();

/*System.out.println(driver.findElement(By.cssSelector("span#spanMessage")).getText());
driver.findElement(By.partialLinkText("password")).click();
Thread.sleep(3000);
//indexing
driver.findElement(By.cssSelector("input[name*='security']:nth-child(2)")).click();
driver.findElement(By.cssSelector("input[name*='security']:nth-child(2)")).sendKeys("Admin");
//regular expression
driver.findElement(By.cssSelector("input[]value*='Reset']")).click();
//tagname
System.out.println(driver.findElement(By.cssSelector("div h1")).getText());
//xpath
driver.findElement(By.xpath("//input[@class='cancel']")).click();
//indexing using xpath
driver.findElement(By.xpath("//input[@type='text'])[2]")).click();
driver.findElement(By.xpath("//input[@class='cancel']")).sendKeys("Admin");
driver.findElement(By.cssSelector("input#txtpassword")).click();
driver.findElement(By.id("txtpassword")).sendKeys("admin123");
driver.findElement(By.xpath("//input[contains@value,'LO')]")).click();
driver.findElement(By.xpath("//div/h1")).getText();*/

//driver.get("https://www.saucedemo.com/");
//instead of get we can use navigate to method
//driver.navigate().to("https://www.saucedemo.com/");
driver.get("https://www.saucedemo.com/");
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().refresh();








	}

}
