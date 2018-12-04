package RezoomexApplicantTrackingSystem.com.rats;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

@Test
public class ExtentReport {

	ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	ExtentTest test;
	WebDriver driver;
	
	
    
	@BeforeTest
	public void startTest() {
		reports = new ExtentReports();

		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "//test-output//extentreport.html");
		reports.attachReporter(htmlReporter);

		reports.setSystemInfo("Machine", "Sagar-478");
		reports.setSystemInfo("Env", "QA");
		reports.setSystemInfo("Build", "Integration");
		reports.setSystemInfo("Browser", "Chrome");
	}

	@BeforeMethod
	  public void beforeclass() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver","/home/synerzip/Selenium/Jar/chromedriver");
		  driver=new ChromeDriver();
		   //ChromeOptions options = new ChromeOptions(); 
		  // options.addArguments("disable-infobars"); 
		// options.addArguments("Window-Size=1400,800");
		// options.addArguments("headless"); 
		 //  System.setProperty("webdriver.chrome.driver","/home/synerzip/Selenium/Jar/chromedriver");
		//   driver=new ChromeDriver(options);
		   
		   
		   driver.manage().window().maximize();
		   driver.get("https://orphanqa.rezoomex.in");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.findElement(By.id("login-username")).sendKeys("ganeshkaspate625@gmail.com");
		   driver.findElement(By.id("login-password")).sendKeys("ganeshkaspate625@3195");
		   driver.findElement(By.id("loginBtn")).click();
		   Thread.sleep(2000);
	  }

@Test(priority=1)
	  public void pageTitleTest() 
	  {   	
		   test = reports.createTest("pageTitleTest");
  
		  
		   String actual_title=driver.getTitle();
		   String expected_title="Rezoomex Quick Assessment & Ranking System";
		   System.out.println(actual_title);
		   System.out.println(expected_title);
		   Assert.assertEquals(actual_title, expected_title);
		   System.out.println("TestCaseForPageTitlePass");
	  }
/*
	  @DataProvider
	  public Object getData()
	  {
	  Object data[][]=new Object[1][2];
	  data[0][0]="sagar";
	  data[0][1]="sagar";
	 
	  data[1][0]="admin";
	  data[1][1]="password";
	  
	  data[2][0]="chetan";
	  data[2][1]="password";
	  
	  data[3][0]="namrata";
	  data[3][1]="password";
	  
	  data[4][0]="demo";
	  data[4][1]="demo";
	  
	  data[5][0]="devops";
	  data[5][1]="password";
	  
     data[6][0]="dinesh";
	  data[6][1]="dineshg";
	  
	  data[7][0]="akshay";
	  data[7][1]="password";
	  return data;
	  
	  
	  
	  }
	  @Test(dataProvider="getData",priority=2)
	  public void loginTest(String username,String password) throws InterruptedException
	  
	 // @Test(priority=2)
	 // public void loginTest() throws InterruptedException 
	  {
		  test = reports.createTest("loginTest");
         
	       //String expectedButtonCaption="Login";
		   //String actualButtonCaption=driver.findElement(By.className("form-group")).getText();
		   //System.out.println(actualButtonCaption);
		  // System.out.println(expectedButtonCaption);
		  // Assert.assertEquals(actualButtonCaption,expectedButtonCaption );
		   driver.findElement(By.id("login-username")).sendKeys("sagar");
		   driver.findElement(By.id("login-password")).sendKeys("sagar");
		   driver.findElement(By.id("loginBtn")).click();
		   
		   System.out.println("Login Successful");
		   Thread.sleep(2000);
		  
	  
}
*/

	  @Test(priority=3)
	  public void automatedjob() throws InterruptedException
	  {
		    test = reports.createTest("automatedjob");
		   //driver.findElement(By.name("company")).sendKeys("Synerzip");
	       Thread.sleep(2000);
		   //driver.findElement(By.id("company-aboutus")).click();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   WebElement element=driver.findElement(By.id("selectJob"));
		   Select job=new Select(element);
		   System.out.println("Jobs are : "+job);
		   job.selectByVisibleText("Senior Dot Net Developer");
		   Thread.sleep(9000);
		   Select technology=new Select(driver.findElement(By.id("selectTechnology")));
		   technology.selectByVisibleText("Python");
		   Thread.sleep(3000);
		   
		   driver.findElement(By.id("createjobbuttonId")).click();
		   Thread.sleep(3000);
		   System.out.println("TestCaseForAutomatedJobCreationPass");
		  
	 }
	
	  @Test(priority=4)
	  public void manualjob() throws InterruptedException
	  {
		  test = reports.createTest("manualjob");
		  Thread.sleep(2000);
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  Select technology=new Select(driver.findElement(By.id("selectTechnology")));
		  technology.selectByVisibleText("Python");
		  Thread.sleep(3000);
		  driver.findElement(By.id("createjobid")).sendKeys("JavascriptDeveloper"+(System.nanoTime()));
		  Thread.sleep(3000);
		  driver.findElement(By.id("jdtextarea")).sendKeys("Must have- Object Oriented Javascript, HTML, CSS.Should have- Exposure to at least one of the JS framework/ library Backbone/ Angular/ React.Good to have- NodeJs.");
		  Thread.sleep(3000);
		  driver.findElement(By.id("createjobbuttonId")).click();;
		  Thread.sleep(5000);
		  System.out.println("TestCaseForManualJobCreationPass");
		  
		  
	  }
	  
	  
	  @Test(priority=5)
	  public void ProcessJob() throws InterruptedException
	  {  
		    test = reports.createTest("processJob");
		    Thread.sleep(2000);
		    Select technology=new Select(driver.findElement(By.id("selectTechnology")));
		    technology.selectByVisibleText("Javaj2ee");
		    Thread.sleep(9000);
		    driver.findElement(By.id("createjobid")).sendKeys("UI3to5JD11");
		    Thread.sleep(3000);
		    driver.findElement(By.id("jdtextarea")).sendKeys("Total Experience- 3-8 Years Must have- Object Oriented Javascript, HTML, CSS.Should have- Exposure to at least one of the JS framework/ library Backbone/ Angular/ React.Good to have- NodeJs.");
		    Thread.sleep(3000);
		    driver.findElement(By.id("createjobbuttonId")).click();
		    Thread.sleep(5000);
		    
		    WebElement table = driver.findElement(By.xpath("//*[@id='manageJobs']"));    
			java.util.List<WebElement> rows=table.findElements(By.xpath("//*[@id='manageJobs']/tbody/tr"));        
			System.out.println("Rows: " +rows.size());
			java.util.List<WebElement> cols=table.findElements(By.tagName("td"));        
			System.out.println("Columns: " +cols.size()); 
			WebElement lastrowcount=rows.get(rows.size()-1);
			System.out.println("last row:"+lastrowcount);
			java.util.List<WebElement> lastrowCols =lastrowcount.findElements(By.tagName("td"));       
	        System.out.println("lastrowCols: " +lastrowCols.size()); 
	        
	        WebElement lastColoflastRow=lastrowCols.get(lastrowCols.size()-1);    
	        java.util.List<WebElement> lastrowlastColsButtons =lastColoflastRow.findElements(By.tagName("button"));        
			System.out.println("lastrowlastColsButtons: " +lastrowlastColsButtons.size());
			Thread.sleep(1000);
			lastrowlastColsButtons.get(0).click();
			Thread.sleep(9000);
			System.out.println("TestCaseForJobProcessingPass");
		
	  }
	  
	  
	  @Test(priority=6)
	  public void openjobannotatedtab() throws InterruptedException
	  
	  {     Thread.sleep(2000);
	        test = reports.createTest("openjobannotatedtab");
		    WebElement table = driver.findElement(By.xpath("//*[@id='manageJobs']"));    
			java.util.List<WebElement> rows=table.findElements(By.xpath("//*[@id='manageJobs']/tbody/tr"));        
			System.out.println("Rows: " +rows.size());
			java.util.List<WebElement> cols=table.findElements(By.tagName("td"));        
			System.out.println("Columns: " +cols.size()); 
			WebElement lastrowcount=rows.get(rows.size()-1);
			System.out.println("last row:"+lastrowcount);
			java.util.List<WebElement> lastrowCols =lastrowcount.findElements(By.tagName("td"));       
	        System.out.println("lastrowCols: " +lastrowCols.size()); 
	        
	        WebElement lastColoflastRow=lastrowCols.get(lastrowCols.size()-1);    
	        java.util.List<WebElement> lastrowlastColsButtons =lastColoflastRow.findElements(By.tagName("button"));        
			System.out.println("lastrowlastColsButtons: " +lastrowlastColsButtons.size());
			Thread.sleep(3000);
			
			lastrowlastColsButtons.get(1).click();
			Thread.sleep(9000);
			//Annotated and missing info Tab
			driver.findElement(By.id("backtocorpusbuttonid")).click();
		    Thread.sleep(9000);
			System.out.println("TestCaseForOpenJobAnnotatedTabPass");
			//To Be Annotated Tab
			
			/*Thread.sleep(1000);
			//lastrowlastColsButtons.get(1).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[1]/div/ul/li[2]/a"));
			//driver.findElement(By.cssSelector("body > div > div > div.di-app-body > div.main-Container.col-xs-12.ng-scope > div > div > div.col-md-12.col-sm-12.main-container > div > ul > li.ng-isolate-scope.active > a"));
			Thread.sleep(5000);
			//driver.findElement(By.id("openjdtabid")).click();
			driver.findElement(By.xpath("//a[contains(text(),'To Be Annotated')]")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("saveButtonId")).click();
			driver.findElement(By.id("finishEditingButtonId")).click();
			driver.findElement(By.id("backtocorpusbuttonid")).click();
			*/
			
	  }
	  
	  @Test(priority=7)
	  public void openjobtobeannotatedtab() throws InterruptedException
	  
	  {     Thread.sleep(2000);
	        test = reports.createTest("openjobtobeannotatedtab");
		    WebElement table = driver.findElement(By.xpath("//*[@id='manageJobs']"));    
			java.util.List<WebElement> rows=table.findElements(By.xpath("//*[@id='manageJobs']/tbody/tr"));        
			System.out.println("Rows: " +rows.size());
			java.util.List<WebElement> cols=table.findElements(By.tagName("td"));        
			System.out.println("Columns: " +cols.size()); 
			WebElement lastrowcount=rows.get(rows.size()-1);
			System.out.println("last row:"+lastrowcount);
			java.util.List<WebElement> lastrowCols =lastrowcount.findElements(By.tagName("td"));       
	        System.out.println("lastrowCols: " +lastrowCols.size()); 
	        
	        WebElement lastColoflastRow=lastrowCols.get(lastrowCols.size()-1);    
	        java.util.List<WebElement> lastrowlastColsButtons =lastColoflastRow.findElements(By.tagName("button"));        
			System.out.println("lastrowlastColsButtons: " +lastrowlastColsButtons.size());
			Thread.sleep(1000);
			
			lastrowlastColsButtons.get(1).click();
			Thread.sleep(9000);
			driver.findElement(By.xpath("//a[contains(text(),'To Be Annotated')]")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("saveButtonId")).click();
			Thread.sleep(9000);
			driver.findElement(By.id("finishEditingButtonId")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[1]")).click();
			Thread.sleep(12000);
		/*	WebElement textarea=driver.findElement(By.xpath("((//div[(@ta-bind='ta-bind')])/p[3]/span)"));
			//textarea.sendKeys("");
			//JavascriptExecutor js = (JavascriptExecutor) driver;
	        // js.executeScript("document.textarea.focus();");
			//new Actions(driver).moveToElement(textarea).click().perform();
			//textarea.click();
			textarea.sendKeys(Keys.CONTROL + "a");
			Thread.sleep(2000);
			Actions action= new Actions(driver);
			action.moveToElement(textarea).perform();
			action.doubleClick().perform();
			action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
			 
			 */

			
			driver.findElement(By.id("standardizejdButtonId")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[1]")).click();
			Thread.sleep(5000);
			Thread.sleep(2000);
			
			

			WebElement minexp=driver.findElement(By.id("minimumexperience"));
			minexp.sendKeys("3");
			Thread.sleep(2000);
			
			WebElement maxexp=driver.findElement(By.id("maximumexperience"));
			maxexp.sendKeys("5");
			Thread.sleep(2000);
			
			Select institute=new Select(driver.findElement(By.id("institute")));
			institute.selectByVisibleText("InstituteGrade-I");
			Thread.sleep(3000);
			
			Select branch=new Select(driver.findElement(By.id("branch")));
			branch.selectByVisibleText("IT");
			Thread.sleep(3000);
			
			
			

		    WebElement degree = driver.findElement(By.id("degree-tokenfield"));
		    degree.sendKeys("d");
		    Thread.sleep(2000);
		    
		    WebElement degreeclick1=driver.findElement(By.xpath("//ul[contains(@class, 'ui-menu')]/li[3]"));
		    Thread.sleep(1000);
		    degreeclick1.click();
		    System.out.println("Test Case for adding first Degree pass");
		    
		    
		    WebElement cf=driver.findElement(By.xpath("//*[@id='couldfId-tokenfield']"));
			cf.sendKeys("ja");
			Thread.sleep(2000);
			
			List <WebElement> alltech1=driver.findElements(By.xpath("//ul[@id='ui-id-8']/li"));
			for( WebElement tech : alltech1)
			{
				Thread.sleep(3000);
		
			alltech1.get(2).click();
			Thread.sleep(2000);
			System.out.println("Test case for Functional Skill click pass");
			Thread.sleep(1000);
			break;
			}
			System.out.println("Test Case for Adding functional Skil inside the could pass");
			
			 WebElement ct=driver.findElement(By.xpath("//*[@id='could-tokenfield']"));
			 ct.sendKeys("do");
			 Thread.sleep(2000);
		     List <WebElement> alltech2=driver.findElements(By.xpath("//ul[@id='ui-id-4']/li"));
				for( WebElement tech : alltech1)
				{
					Thread.sleep(3000);
			
				alltech2.get(2).click();
				Thread.sleep(2000);
				System.out.println("Test case for technology click pass");
	            Thread.sleep(1000);
	            break;
				}
				System.out.println("Test Case for Adding Technology inside the could pass");
			
			
				WebElement gf=driver.findElement(By.xpath("//*[@id='goodfId-tokenfield']"));
				 gf.sendKeys("de");
				 Thread.sleep(2000);
			     List <WebElement> alltech3=driver.findElements(By.xpath("//ul[@id='ui-id-6']/li"));
					for( WebElement tech : alltech1)
					{
						Thread.sleep(3000);
				
					alltech3.get(2).click();
					Thread.sleep(2000);
					System.out.println("Test case for functional skill click pass");
		            Thread.sleep(1000);
		            break;
					}
					System.out.println("Test Case for Adding functional Skill inside the good pass");
					
					//new code

					WebElement gt=driver.findElement(By.xpath("//*[@id='good-tokenfield']"));
					 gt.sendKeys("se");
					 Thread.sleep(2000);
				     List <WebElement> alltech4=driver.findElements(By.xpath("//ul[@id='ui-id-5']/li"));
						for( WebElement tech : alltech1)
						{
							Thread.sleep(3000);
					
						alltech4.get(2).click();
						Thread.sleep(2000);
						System.out.println("Test case for Technology skill click pass");
			            Thread.sleep(1000);
			            break;
						}
						System.out.println("Test Case for Adding Technology inside the good pass");
				
		    
		   
		   
		    
						WebElement sf=driver.findElement(By.xpath("//*[@id='shouldfId-tokenfield']"));
						 sf.sendKeys("do");
						 Thread.sleep(2000);
					     List <WebElement> alltech5=driver.findElements(By.xpath("//ul[@id='ui-id-7']/li"));
							for( WebElement tech : alltech1)
							{
								Thread.sleep(3000);
						
							alltech5.get(2).click();
							Thread.sleep(2000);
							System.out.println("Test case for functional skill click pass");
				            Thread.sleep(1000);
				            break;
							}
							System.out.println("Test Case for Adding functional Skill inside the should pass");
							
							
							

							WebElement st=driver.findElement(By.xpath("//*[@id='should-tokenfield']"));
							 st.sendKeys("dot");
							 Thread.sleep(2000);
						     List <WebElement> alltech6=driver.findElements(By.xpath("//ul[@id='ui-id-2']/li"));
								for( WebElement tech : alltech1)
								{
									Thread.sleep(3000);
							
								alltech6.get(2).click();
								Thread.sleep(2000);
								System.out.println("Test case for Technology  click pass");
					            Thread.sleep(1000);
					            break;
								}
								System.out.println("Test Case for Adding Technology inside the should pass");
								

								WebElement mf=driver.findElement(By.xpath("//*[@id='mustfId-tokenfield']"));
								 mf.sendKeys("ph");
								 Thread.sleep(2000);
							     List <WebElement> alltech7=driver.findElements(By.xpath("//ul[@id='ui-id-9']/li"));
									for( WebElement tech : alltech1)
									{
										Thread.sleep(3000);
								
									alltech7.get(1).click();
									Thread.sleep(2000);
									System.out.println("Test case for functional skill click pass");
						            Thread.sleep(1000);
						            break;
									}
									System.out.println("Test Case for Adding functional Skill inside the must pass");
									
									

									WebElement mt=driver.findElement(By.xpath("//*[@id='must-tokenfield']"));
									 mt.sendKeys("pro");
									 Thread.sleep(2000);
								     List <WebElement> alltech8=driver.findElements(By.xpath("//ul[@id='ui-id-3']/li"));
										for( WebElement tech : alltech1)
										{
											Thread.sleep(3000);
									
										alltech8.get(2).click();
										Thread.sleep(2000);
										System.out.println("Test case for Technology  click pass");
							            Thread.sleep(1000);
							            break;
										}
										System.out.println("Test Case for Adding Technology inside the must pass");
			    
			
			
			
			
			
			
			
			
			
			
			
			
			/*
			
			
			WebElement musttech=driver.findElement(By.id("mustId"));
			musttech.sendKeys("java");
			Thread.sleep(2000);
			
			
			
			//WebElement autoselect=driver.findElement(By.xpath("//*[@id='ui-id-1']"));
			
			WebElement autoOptions = driver.findElement(By.id("ui-id-1"));
			//wait.until(ExpectedConditions.visibilityOf(autoOptions));
			Thread.sleep(2000);

			java.util.List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
			for(WebElement option : optionsToSelect){
		        Object textToSelect ="java";
				if(option.getText().equals(textToSelect)) {
		        	System.out.println("Trying to select: "+textToSelect);
		            option.click();
		            break;		
		        }
			}
			
			
			
			WebElement mustfun=driver.findElement(By.id("mustfId"));
			mustfun.sendKeys("aa");
			
			WebElement shouldtech=driver.findElement(By.id("should"));
			musttech.sendKeys("java");
			
			WebElement shouldfun=driver.findElement(By.id("shouldfId"));
			musttech.sendKeys("java");
			
			*/
			
			
			
			
			
			
			
			
			
			
			
			
			
			Thread.sleep(2000);
			driver.findElement(By.id("saveButtonId")).click();
			Thread.sleep(2000);
			String parentHandle = driver.getWindowHandle();
			WebElement movetopipeline=driver.findElement(By.xpath("//*[@id='header']/div[1]/div[2]/div[2]/div[2]/button/span"));
			movetopipeline.click();
			Thread.sleep(5000);
			
			
			for (String winHandle : driver.getWindowHandles()) {
			    driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
			}
			
			WebElement solrsearch=driver.findElement(By.id("searchinput"));
			
			solrsearch.sendKeys("java");
			
			WebElement searchresume=driver.findElement(By.id("searchBtn"));
			searchresume.click();
			Thread.sleep(3000);
			
			WebElement movetocorpus=driver.findElement(By.xpath("//button[contains(.,'Move To corpus')]"));
			
			movetocorpus.click();
			Thread.sleep(3000);
			//driver.close(); // close newly opened window when done with it
			driver.switchTo().window(parentHandle);
			
			
			System.out.println("Test Case for Taking Document from Solr Pass");
			Thread.sleep(2000);
			
			driver.findElement(By.id("backtocorpusbuttonid")).click();
			System.out.println("TestCaseForOpenJobToBeAnnotatedTabPass");

			WebElement element=driver.findElement(By.linkText("Manage Resumes"));
			element.click();
			Thread.sleep(5000);
	  }
		   
	  @Test (priority=8)
	  public void trackjob() throws InterruptedException
	  {
		    Thread.sleep(2000);
		    test = reports.createTest("trackjob");
		    WebElement table = driver.findElement(By.xpath("//*[@id='manageJobs']"));    
			java.util.List<WebElement> rows=table.findElements(By.xpath("//*[@id='manageJobs']/tbody/tr"));        
			System.out.println("Rows: " +rows.size());
			java.util.List<WebElement> cols=table.findElements(By.tagName("td"));        
			System.out.println("Columns: " +cols.size()); 
			WebElement lastrowcount=rows.get(rows.size()-1);
			System.out.println("last row:"+lastrowcount);
			java.util.List<WebElement> lastrowCols =lastrowcount.findElements(By.tagName("td"));       
	        System.out.println("lastrowCols: " +lastrowCols.size()); 
	        
	        WebElement lastColoflastRow=lastrowCols.get(lastrowCols.size()-1);    
	        java.util.List<WebElement> lastrowlastColsButtons =lastColoflastRow.findElements(By.tagName("button"));        
			System.out.println("lastrowlastColsButtons: " +lastrowlastColsButtons.size());
			Thread.sleep(1000);
			lastrowlastColsButtons.get(3).click();
			Thread.sleep(9000);
			System.out.println("TestCaseForTrackJobPass");
			
	  }
	  @Test(priority=9)
	  public void downloadtracker() throws InterruptedException
	  {
		    Thread.sleep(2000);
		    test = reports.createTest("downloadtracker");
		    WebElement table = driver.findElement(By.xpath("//*[@id='manageJobs']"));    
			java.util.List<WebElement> rows=table.findElements(By.xpath("//*[@id='manageJobs']/tbody/tr"));        
			System.out.println("Rows: " +rows.size());
			java.util.List<WebElement> cols=table.findElements(By.tagName("td"));        
			System.out.println("Columns: " +cols.size()); 
			WebElement lastrowcount=rows.get(rows.size()-1);
			System.out.println("last row:"+lastrowcount);
			java.util.List<WebElement> lastrowCols =lastrowcount.findElements(By.tagName("td"));       
	        System.out.println("lastrowCols: " +lastrowCols.size()); 
	        
	        WebElement lastColoflastRow=lastrowCols.get(lastrowCols.size()-1);    
	        java.util.List<WebElement> lastrowlastColsButtons =lastColoflastRow.findElements(By.tagName("button"));        
			System.out.println("lastrowlastColsButtons: " +lastrowlastColsButtons.size());
			Thread.sleep(1000);
			lastrowlastColsButtons.get(4).click();
			Thread.sleep(9000);
			System.out.println("TestCaseForDownloadTrackerPass");
		  
	  }
	  /*
	  @Test(priority=10)
	  public void deletejob() throws InterruptedException
	  {
		    Thread.sleep(2000);
		    //test = reports.createTest("deletejob");
		    WebElement table = driver.findElement(By.xpath("//*[@id='manageJobs']"));    
			java.util.List<WebElement> rows=table.findElements(By.xpath("//*[@id='manageJobs']/tbody/tr"));        
			System.out.println("Rows: " +rows.size());
			java.util.List<WebElement> cols=table.findElements(By.tagName("td"));        
			System.out.println("Columns: " +cols.size()); 
			WebElement lastrowcount=rows.get(rows.size()-1);
			System.out.println("last row:"+lastrowcount);
			java.util.List<WebElement> lastrowCols =lastrowcount.findElements(By.tagName("td"));       
	        System.out.println("lastrowCols: " +lastrowCols.size()); 
	        
	        WebElement lastColoflastRow=lastrowCols.get(lastrowCols.size()-1);    
	        java.util.List<WebElement> lastrowlastColsButtons =lastColoflastRow.findElements(By.tagName("button"));        
			System.out.println("lastrowlastColsButtons: " +lastrowlastColsButtons.size());
			Thread.sleep(1000);
			lastrowlastColsButtons.get(2).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[1]")).click();
			//WebDriverWait wait = new WebDriverWait(driver, 10);
			//WebElement element = (WebElement) wait.until(ExpectedConditions.alertIsPresent());
			
			/*Set<String> windowids = driver.getWindowHandles(); 
			Iterator<String> iter = windowids.iterator(); 
			String mainWindowId=iter.next(); 
			String popupWindowId=iter.next(); 
			driver.switchTo().window(popupWindowId);
			*/
			/*Alert alt=driver.switchTo().alert();
			alt.accept();
			//
			Thread.sleep(9000);  
			System.out.println("TestCaseForDeleteJobPass");
	  }
	  */
	  @Test(priority=11)
	  public void refreshjob() throws InterruptedException
	  {
		  test = reports.createTest("refreshjob");
		  Thread.sleep(5000);
	      driver.findElement(By.id("refreshbutton")).click();
	      Thread.sleep(3000);
	      System.out.println("TestCaseForRefreshJobsPass");
	  }
	 
	  @Test(priority=12)
	 public void logoutTest() throws InterruptedException
	  {
		  driver.findElement(By.id("logoutbutton"));
	     
	      Thread.sleep(3000);
	      System.out.println("TestCaseForLogoutPass");
	      }
		  
	
	@AfterMethod
	public void setTestResult(ITestResult result) throws IOException {

		String screenShot = CaptureScreenShot.captureScreen(driver);

		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
			test.log(Status.FAIL,result.getThrowable());
			//Assert.fail("Screen Shot : " + test.addScreenCaptureFromPath(screenShot));
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
			//test.pass("Screen Shot : " + test.addScreenCaptureFromPath(screenShot));
		} else if (result.getStatus() == ITestResult.SKIP) {
			test.skip("Test Case : " + result.getName() + " has been skipped");
		}
 
		reports.flush();
		driver.close();
	}

	@AfterTest
	public void endTest() {
		try{
            driver.quit();
        }catch (Exception e){
            System.out.println("exception caught while closing driver" +e);
        }finally{
            driver.quit();
		
		reports.flush();
	}
	
	

	}
}
