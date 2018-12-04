package RezoomexApplicantTrackingSystem.com.rats;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Resumeupload {
	
	WebDriver driver;
	@BeforeMethod
	  public void beforeclass() throws InterruptedException 
	  {
		   //System.setProperty("webdriver.chrome.driver","/home/synerzip/Selenium/Jar/chromedriver");
		   //driver=new ChromeDriver();
		   ChromeOptions options = new ChromeOptions(); 
		   //options.addArguments("disable-infobars"); 
		   options.addArguments("Window-Size=1400,800");
		   //options.addArguments("headless"); 
		   System.setProperty("webdriver.chrome.driver","/home/synerzip/Selenium/Jar/chromedriver");
		   driver=new ChromeDriver(options);
		   
		   
		   driver.manage().window().maximize();
		   driver.get("https://orphanqa.rezoomex.in");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.findElement(By.id("login-username")).sendKeys("ganeshkaspate625@gmail.com");
		   driver.findElement(By.id("login-password")).sendKeys("ganeshkaspate625@3195");
		   driver.findElement(By.id("loginBtn")).click();
		   Thread.sleep(2000);
	  }
	
	@Test
	public void resumeupload() throws InterruptedException
	{

		    Thread.sleep(2000);
		    //test = reports.createTest("trackjob");
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
		
		
		
		WebElement element=driver.findElement(By.linkText("Manage Resumes"));
		element.click();
		Thread.sleep(2000);
		System.out.println("Come to manage resumes corpus");
		
		WebElement uploadfolder=driver.findElement(By.id("uploadId"));
		uploadfolder.sendKeys("/home/synerzip/Desktop/WithOwnMailId");
		WebElement upload=driver.findElement(By.xpath("//*[@id='resume-panel']/div/div[1]/span/button"));
		upload.click();
		Thread.sleep(110000);
		System.out.println("Test Case For Uploading Folder Of Documents Pass");
		
		
		
		WebElement uploadfile=driver.findElement(By.xpath("//*[@id='resume-panel']/div/div[1]/span/div[2]/input"));
        uploadfile.sendKeys("/home/synerzip/Desktop/WithOwnMailId/Abhijeet Shinde -- UI Dev informex (1)(1) (2).doc");
        WebElement upload1=driver.findElement(By.xpath("//*[@id='resume-panel']/div/div[1]/span/button"));
		upload1.click();
		Thread.sleep(25000);
		System.out.println("Test Case For Uploading Single Document Pass");
		
		Thread.sleep(5000);
		WebElement refresh =driver.findElement(By.xpath("//*[@id='resume-panel']/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/button/span"));
		refresh.click();
		Thread.sleep(30000);
		System.out.println("Test Case For Refresh Manage Resumes Corpus Pass");
		
		WebElement quicktracker=driver.findElement(By.id("quickTrackerId"));
		quicktracker.click();
		Thread.sleep(5000);
		System.out.println("Test Case For Downloading The Quick Tracker Pass");
		
		WebElement suitabilitytracker=driver.findElement(By.id("suitabilityId"));
		suitabilitytracker.click();
		Thread.sleep(5000);
		System.out.println("Test Case For Downloading The Suitability Tracker Pass");
	
		WebElement addtotracker=driver.findElement(By.id("addToTrackerId"));
		addtotracker.click();
		Thread.sleep(2000);
		System.out.println("Test Case For Add To Tracker Button Pass1");
		
			
		
		WebElement deleteresume=driver.findElement(By.id("deleteResumeId"));
		deleteresume.click();
		Thread.sleep(5000);
		System.out.println("Test Case for Delete Resume Pass");
		
		
		WebElement movetogold=driver.findElement(By.id("goldButtonId"));
		movetogold.click();
		Thread.sleep(2000);
		//String name_of_document=movetogold.getText();
		//System.out.println("Name of the document move into gold standard"+name_of_document);
		
		Thread.sleep(9000);
		System.out.println("Test Case For Moving To Gold Standard Pass");
		
		/*
		
		WebElement goldclick=driver.findElement(By.xpath("//span[contains(text(), 'Gold')]"));
		goldclick.click();
		Thread.sleep(2000);
		
		//WebElement movetopipeline=driver.findElement(By.xpath("//span[contains(text(), 'Move To Pipeline')]"));
		//movetopipeline.click();
		//Thread.sleep(2000);
		
		
		WebElement refreshdoc=driver.findElement(By.xpath("//span[contains(text(), 'Refresh')]"));
		refreshdoc.click();
		Thread.sleep(5000);
		
		WebElement back=driver.findElement(By.xpath("//span[contains(text(), 'Back')]"));
		back.click();
		Thread.sleep(2000);
		*/
		
		
		
		
		
		
		WebElement openresume=driver.findElement(By.id("openDocumentId"));
		openresume.click();
		Thread.sleep(9000);
		System.out.println("Test Case For Opening Resume Pass");
		/*
		
		WebElement blacklist=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div/div[3]/div/ul/li[5]/button/span"));
		blacklist.click();
		Thread.sleep(3000);
		WebElement orphanname=driver.findElement(By.xpath("//*[@id='orphanModal']/div/div/div[1]/h4/input"));
		String value= orphanname.getAttribute("value");
		System.out.println("VAlue:"+value);
		
		WebElement addorphan=driver.findElement(By.id("addOrphan"));
		addorphan.click();
		System.out.println("Test Case For Adding orphan inside blacklist pass");
		Thread.sleep(5000);
		
		WebElement blacklist1=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div/div[3]/div/ul/li[5]/button/span"));
		blacklist1.click();
		Thread.sleep(3000);
		//WebElement searchtextbox=driver.findElement(By.xpath("//*[@id='orphanModal']/div/div/div[2]/div[1]/div[1]/span/input"));
		//searchtextbox.sendKeys(value);
		WebElement addedorphan=driver.findElement(By.xpath("//*[@id='orphanModal']/div/div/div[2]/div[1]/div[2]/ul/li[20]"));
		addedorphan.click();
		WebElement deleteorphan=driver.findElement(By.id("deleteOrphan"));
		deleteorphan.click();
		WebElement confirmation=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/button[1]"));
		confirmation.click();
		Thread.sleep(3000);
		System.out.println("Test Case for Deleting Orphan from the blacklist pass");
		Thread.sleep(3000);
		
		WebElement closeorphanaddmodel=driver.findElement(By.xpath("//*[@id='orphanModal']/div/div/div[1]/button"));
		closeorphanaddmodel.click();
		Thread.sleep(2000);
		
		
		
		//adding subclass
		WebElement vertical =driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div/div[3]/div/ul/li[59]/button"));
		vertical.click();
		Thread.sleep(2000);
		WebElement classclick=driver.findElement(By.xpath("//*[@id='orphanModal']/div/div/div[2]/div[1]/div[2]/ul/li/span"));
		classclick.click();
		WebElement addsubclass=driver.findElement(By.id("addOrphanAsSubClass"));
		addsubclass.click();
		System.out.println("Test Case for Adding orphan as subclass pass");
		WebElement subclassname=driver.findElement(By.xpath("//*[@id='orphanModal']/div/div/div[1]/h4/input"));
		String value1= subclassname.getAttribute("value");
		System.out.println("Added Subclass Name:" +value1);
		Thread.sleep(5000);
		
        //adding instance
		WebElement vertical1 =driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[2]/div/div[1]/div/div/div[3]/div/ul/li[59]/button"));
		vertical1.click();
		Thread.sleep(2000);
		WebElement classclick1=driver.findElement(By.xpath("//*[@id='orphanModal']/div/div/div[2]/div[1]/div[2]/ul/li/span"));
		classclick1.click();
		WebElement addinstance=driver.findElement(By.id("addOrphanAsInstance"));
		addinstance.click();
		System.out.println("Test Case for Adding orphan as instance pass");
		WebElement instancename=driver.findElement(By.xpath("//*[@id='orphanModal']/div/div/div[1]/h4/input"));
		String value2= instancename.getAttribute("value");
		System.out.println("Added Instance Name:" +value2);
		Thread.sleep(5000);
		
		*/
		
		//WebElement fullname=driver.findElement(By.xpath("//span[@class='full']"));
		
		if(driver.findElements(By.xpath("//span[@class='full']")).size() != 0)
		{
			WebElement fullname=driver.findElement(By.xpath("//span[@class='full']"));
			System.out.println("Element is Present");
			Actions action= new Actions(driver);
			action.moveToElement(fullname).perform();
			action.contextClick().perform();
			Thread.sleep(5000);
			WebElement fullnamedeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
			fullnamedeletion.click();
			Thread.sleep(3000);
			System.out.println("Test Case for Deleting the FullName Pass ");
			}else
			{
			System.out.println("FullName is Absent inside the document");
			}
		
		if(driver.findElements(By.xpath("//span[@class='emai']")).size() != 0)
		{
			WebElement emailid=driver.findElement(By.xpath("//span[@class='emai']"));
			System.out.println("Element is Present");
			Actions action= new Actions(driver);
			action.moveToElement(emailid).perform();
			action.contextClick().perform();
			Thread.sleep(3000);
			WebElement emailiddeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
			emailiddeletion.click();
			Thread.sleep(2000);
			System.out.println("Test Case for Deleting the Email-Id Pass ");
			}else
			{
			System.out.println("Email-Id is Absent inside the document");
			}
		
		if(driver.findElements(By.xpath("//span[@class='tele']")).size() != 0)
		{
			WebElement telephoneno=driver.findElement(By.xpath("//span[@class='tele']"));
			System.out.println("Element is Present");
			Actions action= new Actions(driver);
			action.moveToElement(telephoneno).perform();
			action.contextClick().perform();
			Thread.sleep(3000);
			WebElement telephonenodeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
			telephonenodeletion.click();
			Thread.sleep(2000);
			System.out.println("Test Case for Deleting the Telephone No Pass ");
			}else
			{
			System.out.println("Telephone is Absent inside the document");
			}
		
		if(driver.findElements(By.xpath("//span[@class='obje']")).size() != 0)
		{
			WebElement objective=driver.findElement(By.xpath("//span[@class='obje']"));
			System.out.println("Element is Present");
			Actions action= new Actions(driver);
			action.moveToElement(objective).perform();
			action.contextClick().perform();
			Thread.sleep(3000);
			WebElement objectivedeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
			objectivedeletion.click();
			Thread.sleep(2000);
			System.out.println("Test Case for Deleting the Objective Pass ");
			}else
			{
			System.out.println("Objective is Absent inside the document");
			}
		
		if(driver.findElements(By.xpath("//span[@class='over']")).size() != 0)
		{
			WebElement overview=driver.findElement(By.xpath("//span[@class='over']"));
			System.out.println("Element is Present");
			Actions action= new Actions(driver);
			action.moveToElement(overview).perform();
			action.contextClick().perform();
			Thread.sleep(3000);
			WebElement overviewdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
			overviewdeletion.click();
			Thread.sleep(2000);
			System.out.println("Test Case for Deleting the Telephone No Pass ");
			}else
			{
			System.out.println("Telephone is Absent inside the document");
			}
		
		if(driver.findElements(By.xpath("//span[@class='tota']")).size() != 0)
		{
			WebElement totalexp=driver.findElement(By.xpath("//span[@class='tota']"));
			System.out.println("Element is Present");
			Actions action= new Actions(driver);
			action.moveToElement(totalexp).perform();
			action.contextClick().perform();
			Thread.sleep(3000);
			WebElement totalexpdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
			totalexpdeletion.click();
			Thread.sleep(2000);
			System.out.println("Test Case for Deleting the Total Exp Pass ");
			}else
			{
			System.out.println("Total Exp is Absent inside the document");
			}
		
		if(driver.findElements(By.xpath("//span[@class='skil']")).size() != 0)
		{
			WebElement skillset=driver.findElement(By.xpath("//span[@class='skil']"));
			System.out.println("Element is Present");
			Actions action= new Actions(driver);
			action.moveToElement(skillset).perform();
			action.contextClick().perform();
			Thread.sleep(3000);
			WebElement skillsetdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
			skillsetdeletion.click();
			Thread.sleep(2000);
			System.out.println("Test Case for Deleting the SkillSet Pass ");
			}else
			{
			System.out.println("SkillSet is Absent inside the document");
			}
		
		if(driver.findElements(By.xpath("//span[@class='addr']")).size() != 0)
		{
			WebElement address=driver.findElement(By.xpath("//span[@class='addr']"));
			System.out.println("Element is Present");
			Actions action= new Actions(driver);
			action.moveToElement(address).perform();
			action.contextClick().perform();
			Thread.sleep(3000);
			WebElement addressdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
			addressdeletion.click();
			Thread.sleep(2000);
			System.out.println("Test Case for Deleting the Address Pass ");
			}else
			{
			System.out.println("Address is Absent inside the document");
			
			}
		if(driver.findElements(By.xpath("//span[@class='foot']")).size() != 0)
		{
			WebElement footnote=driver.findElement(By.xpath("//span[@class='foot']"));
			System.out.println("Element is Present");
			Actions action= new Actions(driver);
			action.moveToElement(footnote).perform();
			action.contextClick().perform();
			Thread.sleep(3000);
			WebElement footnotedeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
			footnotedeletion.click();
			Thread.sleep(2000);
			System.out.println("Test Case for Deleting the FootNote Pass ");
			}else
			{
			System.out.println("FootNote is Absent inside the document");
			}
		if(driver.findElements(By.xpath("//span[@class='awar']")).size() != 0)
		{
			WebElement award=driver.findElement(By.xpath("//span[@class='awar']"));
			System.out.println("Element is Present");
			Actions action= new Actions(driver);
			action.moveToElement(award).perform();
			action.contextClick().perform();
			Thread.sleep(3000);
			WebElement awarddeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
			awarddeletion.click();
			Thread.sleep(2000);
			System.out.println("Test Case for Deleting the Award And Recognition Pass ");
			}else
			{
			System.out.println("Award and Recognition is Absent inside the document");
			}
		if(driver.findElements(By.xpath("//span[@class='cert']")).size() != 0)
		{
			WebElement certification=driver.findElement(By.xpath("//span[@class='cert']"));
			System.out.println("Element is Present");
			Actions action= new Actions(driver);
			action.moveToElement(certification).perform();
			action.contextClick().perform();
			Thread.sleep(3000);
			WebElement certificationdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
			certificationdeletion.click();
			Thread.sleep(2000);
			System.out.println("Test Case for Deleting the Certification Pass ");
			}else
			{
			System.out.println("Certification is Absent inside the document");
			}
		
		if(driver.findElements(By.xpath("//span[@class='educ']")).size() != 0)
		{
			WebElement education=driver.findElement(By.xpath("//span[@class='educ']"));
			System.out.println("Element is Present");
			Actions action= new Actions(driver);
			action.moveToElement(education).perform();
			action.contextClick().perform();
			Thread.sleep(3000);
			WebElement educationdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
			educationdeletion.click();
			Thread.sleep(2000);
			System.out.println("Test Case for Deleting the Education Pass ");
			}else
			{
			System.out.println("Education is Absent inside the document");
			}
		
		if(driver.findElements(By.xpath("//span[@class='Proj']")).size() != 0)
		{
			WebElement education=driver.findElement(By.xpath("//span[@class='Proj']"));
			System.out.println("Element is Present");
			Actions action= new Actions(driver);
			action.moveToElement(education).perform();
			action.contextClick().perform();
			Thread.sleep(3000);
			WebElement educationdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
			educationdeletion.click();
			Thread.sleep(2000);
			System.out.println("Test Case for Deleting the Project Pass ");
			}else
			{
			System.out.println("Project is Absent inside the document");
			}
		
		if(driver.findElements(By.xpath("//span[@class='comp']")).size() != 0)
		{
			WebElement education=driver.findElement(By.xpath("//span[@class='comp']"));
			System.out.println("Element is Present");
			Actions action= new Actions(driver);
			action.moveToElement(education).perform();
			action.contextClick().perform();
			Thread.sleep(3000);
			WebElement educationdeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
			educationdeletion.click();
			Thread.sleep(2000);
			System.out.println("Test Case for Deleting the Company Exp Pass ");
			}else
			{
			System.out.println("Company Exp is Absent inside the document");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
			
		/*
		Actions action= new Actions(driver);
		action.moveToElement(fullname).perform();
		action.contextClick().perform();
		Thread.sleep(3000);
		WebElement fullnamedeletion=driver.findElement(By.xpath("//*[@id='projectAnnotation']/li/a/span"));
		fullnamedeletion.click();
		*/
		
		WebElement saveannotations=driver.findElement(By.id("standardizeButtonId"));
		saveannotations.click();
		Thread.sleep(2000);
		WebElement confirmationok=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[1]"));
		confirmationok.click();
		Thread.sleep(3000);
		System.out.println("Test Case for Saving Annotations Pass");
		/*
		WebElement backtocorpus1=driver.findElement(By.id("backtocorpusbuttonid"));
		backtocorpus1.click();
		Thread.sleep(3000);
		*/
		
		
	    
		
		WebElement modelhtmltab=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[1]/div/ul/li[3]/a"));
		modelhtmltab.click();
		Thread.sleep(30000);
		Select communication=new Select(driver.findElement(By.id("communication")));
		communication.selectByVisibleText("Good");
		Thread.sleep(2000);
		Select agency=new Select(driver.findElement(By.id("selectAgency")));
		agency.selectByVisibleText("HR");
		Thread.sleep(2000);
		WebElement save =driver.findElement(By.id("saveButtonId"));
		save.click();
		System.out.println("Test Case for Saving Candidate Information Pass");
		Thread.sleep(2000);
		
		WebElement exporttosolr=driver.findElement(By.id("exportToSolrButtonId"));
		exporttosolr.click();
		Thread.sleep(2000);
		WebElement exporttosolrconfirmation=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[1]"));
		exporttosolrconfirmation.click();
		Thread.sleep(5000);
		System.out.println("Test Case for Exporting document to solr Pass");
		Thread.sleep(3000);
		
		WebElement candidatedetails= driver.findElement(By.xpath("//span[contains(text(),'CandidateDetails')]"));
		candidatedetails.click();
		Thread.sleep(2000);
		WebElement noticeperiod=driver.findElement(By.id("NoticePeriod"));
		noticeperiod.sendKeys("30");
		Thread.sleep(1000);
		WebElement currentctc=driver.findElement(By.id("CurrentCTC"));
		currentctc.sendKeys("10");
	    Thread.sleep(1000);
		WebElement expectedctc=driver.findElement(By.id("ExpectedCTC"));
		expectedctc.sendKeys("15");
		Thread.sleep(1000);
		WebElement savechanges=driver.findElement(By.xpath("//*[@id='missingInfoModal']/div/div/div[3]/button[2]"));
		savechanges.click();
		Thread.sleep(2000);
	
		WebElement backtocorpus=driver.findElement(By.id("backtocorpusbuttonid"));
		backtocorpus.click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
	}
	


}
