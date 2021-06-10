package UPSCGov_Project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

 

public class UPSC_Gov_Project {

	 
		static WebDriver driver ; 
	
		
		 
	 	public static void main(String[] args) throws InterruptedException, IOException {
			 
			System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
			driver 	= new ChromeDriver();
			
			driver.get("https://www.upsc.gov.in/");
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
		
			
			UPSC_Gov_Project  u= new  UPSC_Gov_Project ();
			u.homep();
			u.HomePage();
			u.AboutUs();
			u.Examinations();
			u.recurit();
			u.Recuritrules();
			u.Appointments();
			u.services();
			u.uniont();
			u.stategov();
			u.others();
			u.forms();
			u.RTI();
			
	}
	 	public void homep() throws InterruptedException, IOException {
	 		//to Increase font size of home page
	 		Actions a=new Actions(driver);
	 		
	 		a.moveToElement(driver.findElement(By.xpath("//header/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/a[1]"))).perform();
	 		driver.findElement(By.xpath("//header/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/a[1]")).click();
	 		Thread.sleep(2000);
	 		
	 	
	 		
	 		//to decrease font sizenof home page
	 		driver.findElement(By.xpath("//header/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/a[1]")).click();
	 		Thread.sleep(2000);
	 		
	 		//to Reset font size of home page
	 		driver.findElement(By.xpath("//header/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/ul[1]/li[2]/a[1]")).click();
	 		Thread.sleep(2000);
	 		
	 		// to change page background dark colour
	 		a.moveToElement(driver.findElement(By.xpath("//header/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/ul[1]/li[4]/a[1]"))).perform();
	 		driver.findElement(By.xpath("//header/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/ul[1]/li[4]/a[1]")).click();
	 		Thread.sleep(2000);
	 		TakesScreenshot s = (TakesScreenshot) driver;
	 		
	 		File source= s.getScreenshotAs(OutputType.FILE);
	 		Files.copy(source, new File("C:\\Users\\shaba\\Pictures\\Screenshots\\UPSCBackground.png"));
	 		
	 		Thread.sleep(2000);
	 		//to restore default background
	 		
	 		driver.findElement(By.xpath("//header/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/ul[1]/li[5]/a[1]")).click(); 
	 		
	 		//Enter any data to search in upsc website
	 		
	 		driver.findElement(By.xpath("//input[@id='edit-search-block-form--2']")).sendKeys("question papers");
	 		
	 		driver.findElement(By.xpath("//header/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/form[1]/div[1]/div[1]/div[1]/span[1]/button[1]")).click();
	 		Thread.sleep(2000);
	 		driver.navigate().back();
	 		
	 		//to change  website language 
	 		
	 		driver.findElement(By.xpath("//*[@id=\"header-nav\"]/li[6]/a")).click();
	 		Set<String> window =driver.getWindowHandles();
	 		Iterator<String> it=window.iterator();
	 		String mainwindow=it.next();
	 		String childwindow=it.next();
	 		driver.switchTo().window(childwindow);
	 		Thread.sleep(2000);
	 		// get screenshot of the changed website
	 		
	 		File s2=s.getScreenshotAs(OutputType.FILE);
	 		Files.copy(s2, new File("C:\\Users\\shaba\\Pictures\\Screenshots\\UPSClanguage.png"));
	 		driver.close();
	 		driver.switchTo().window(mainwindow);
	 		
	 		
	 		//to click on site map
	 		
	 		driver.findElement(By.xpath("//a[contains(text(),'SiteMap')]")).click();
	 		Thread.sleep(2000);
	 		driver.navigate().back();
	 		
	 		//to skip the main content
	 		driver.findElement(By.xpath("//header/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
	 		Thread.sleep(2000);
	 		
	 		  JavascriptExecutor js =(JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(1000,0)");
				Thread.sleep(2000);
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 	}
	 	
	    public void HomePage() throws InterruptedException, IOException
	 	
	 	   {
	 		
	 		//*********************** Home-Icon****************************************
	 		
	 		   driver.findElement(By.xpath("//i[@class='fa fa-home']")).click(); //Home icon
	 		   Thread.sleep(2000);
	         
	         //********************Whatâ€™s New********************************************
	 		 
	          driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-stop']")).click(); //Stop-News button 
	          Thread.sleep(2000);
	          driver.findElement(By.xpath("//i[@class='glyphicon glyphicon-play']")).click(); // play-News button
	          Thread.sleep(2000);
	          driver.findElement(By.xpath("/html/body/header/section[3]/div[2]/div[3]/div/a")).click();//View-all news
	          Thread.sleep(2000);
	          System.out.println("Page Title:"+driver.getTitle()); //get the page title
	        
	          WebElement E= driver.findElement(By.xpath("//div[@class='inner-right']")); //display all the news console
	          System.out.println("What's New Title's  : " + E.getText());
	          driver.navigate().back();     //go the home page
	         
	       //********************* Highlights ***************************************************
	         
	         driver.findElement(By.linkText("View all")).click();  //View-all news
	         Thread.sleep(2000);
	         System.out.println("Page Title:" +driver.getTitle()); //get the page title
	         
	         WebElement E1 = driver.findElement(By.xpath("//div[@class='inner-right']"));  
	         System.out.println("Highlights Titles : " +E1.getText());  //display all the news console
	         driver.navigate().back();
	         
	        //********************************* About US On Home page***********************
	         
	         WebElement E2 = driver.findElement(By.xpath("//section[@id='block-menu-block-1']"));
	         
	         System.out.println("About Us field Size : " +E2.getSize());
	         System.out.println("About Us field Headlines :" +E2.getText());
	         
	         //********************************* Examination On Home page******************************
	         
	         WebElement E3 = driver.findElement(By.xpath("//body/section[2]/div/div/div[2]/div"));
	         System.out.println("Examinations :" +E3.getText());   //display Examination link on console 
	         
	         driver.findElement(By.xpath(" //*[@id=\"block-views-exams-block-1\"]/div/div[1]/div[1]/div/div/a/ul/li")).click(); //Open link 1
	         Thread.sleep(2000);   
	         System.out.println("Civil Services Examinations  :  " +driver.getTitle());
	           
	           
	         driver.findElement(By.linkText("FR-CDS-I-20-OTA-Engl-24052021.pdf")).click(); 
	         Thread.sleep(2000);
	          
	          //How many popups thr
	          Set<String> allHandles = driver.getWindowHandles();
	          
	          //Iterator for fetching sets value
	          Iterator<String>itr = allHandles.iterator();
	          
	          System.out.println(allHandles.size());
	          String mainWindow = itr.next();
	          String popup1 = itr.next();
	           
	          //move to 1st popup
	          driver.switchTo().window(popup1);
	          //get the title & url of popup
	          System.out.println("Title of Page : " +driver.getTitle());
	          System.out.println("URL of Page : " +driver.getCurrentUrl());
	          
	          //close popup1
	          driver.close();
	         
	         driver.switchTo().window(mainWindow);
	         System.out.println(driver.getTitle());
	         driver.findElement(By.linkText("Home")).click();
	         Thread.sleep(2000);
	         
	         driver.findElement(By.xpath("//*[@id=\"block-views-exams-block-1\"]/div/div[1]/div[2]/div/div/a/ul/li")).click(); //open link2
	         Thread.sleep(2000);
	         System.out.println("Title of page : " +driver.getTitle());
	         driver.navigate().back();
	         Thread.sleep(2000);
	           
	          driver.findElement(By.xpath("//*[@id=\"block-views-exams-block-2\"]/div/div[1]/div[1]/div/div/a/ul/li")).click(); //open link3
	          Thread.sleep(2000);
	          System.out.println("Title of Page : " + driver.getTitle());
	          driver.findElement(By.linkText("Home")).click();
	          Thread.sleep(2000);
	           
	          driver.findElement(By.xpath("//*[@id=\"block-views-exams-block-2\"]/div/div[1]/div[2]/div/div/a/ul/li")).click(); //open link4 
	          Thread.sleep(2000);
	          System.out.println("Title of page : " +driver.getTitle());
	          driver.findElement(By.linkText("Home")).click();
	           
	          
	          //********************************* Recruitment On Home page****************************** 
	           WebElement E4 = driver.findElement(By.xpath("//section[@id='block-menu-block-6']")); //Recruitment On Home page
	           Thread.sleep(2000);
	           System.out.println("Recruitment field size : " +E4.getSize()); //get  the size of the link
	           System.out.println("Recruitment field Headlines : " +E4.getText()); //get all links on console
	          
	          
	          //****************************Examination Notification*********************************
	          
	           driver.findElement(By.xpath("//span[contains(text(),'Examination Notifications')]")).click(); //Open Examination Notifications Page
	           Thread.sleep(2000);
	           
	           
	           System.out.println("Title of page : " +driver.getTitle());  
	           driver.findElement(By.xpath("//a[contains(text(),'View Archives')]")).click(); //open archives links
	        
	      
	           driver.findElement(By.xpath("//input[@id='edit-field-exam-name-value']")).sendKeys("Engineering Services (Preliminary) Examination"); //Name of Examination
	           driver.findElement(By.xpath("//input[@id='edit-field-year-tid']")).sendKeys("2021"); //Year
	           driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();//click on apply button
	           System.out.println("Title of page :  " +driver.getTitle()); 
	           driver.findElement(By.linkText("Home")).click();
	      
	          
	          //**************************** Recruitment Advertisements *********************** 
	          
	          driver.findElement(By.xpath("//span[contains(text(),'Recruitment Advertisements')]")).click(); //open Recruitment Advertisements page
	          Thread.sleep(2000);
	          System.out.println("Title of page : " +driver.getTitle());
	          driver.findElement(By.linkText("View Archives >>")).click(); //open archives links
	          driver.findElement(By.linkText("Home")).click();
	          
	       
	         //***************************** Apply Online ************************************
	           driver.findElement(By.xpath("//span[contains(text(),'Apply Online')]")).click(); //open Apply Online page
	           Thread.sleep(2000);
	           
	           System.out.println("Title of page : " +driver.getTitle());
	            
	             
	           driver.findElement(By.linkText("Online Recruitment Application (ORA) for various recruitment posts")).click(); //1st link
	           Thread.sleep(2000);
	           
	            //How many popups thr
	            Set<String> allHandles1 = driver.getWindowHandles();
	            
	            //Iterator for fetching sets value
	            Iterator<String> itr1 = allHandles1.iterator();
	            
	            System.out.println(allHandles1.size());
	            String mainWindow1 = itr1.next();
	            String popup2 = itr1.next();
	             
	            //move to 1st popup
	            driver.switchTo().window(popup2);
	            //get the title & url of popup
	            System.out.println("Title of Page : " +driver.getTitle());
	            System.out.println("URL of Page : " +driver.getCurrentUrl());
	            
	            //close popup1
	            driver.close();
	           
	            driver.switchTo().window(mainWindow1);
	            System.out.println(driver.getTitle());
	          
	            
	           driver.findElement(By.linkText("Online Application for Various Examinations")).click(); //2nd link
	           Thread.sleep(2000);
	           //How many popups thr
	           Set<String> allHandles2 = driver.getWindowHandles();
	         
	           //Iterator for fetching sets value
	           Iterator<String>itr2 = allHandles2.iterator();
	         
	          System.out.println(allHandles2.size());
	          String mainWindow2 = itr2.next();
	          String popup3 = itr2.next();
	          
	          //move to 1st popup
	          driver.switchTo().window(popup3);
	          //get the title & url of popup
	          System.out.println("Title of Page : " +driver.getTitle());
	          System.out.println("URL of Page : " +driver.getCurrentUrl());
	         
	         //close popup1
	         driver.close();
	        
	         driver.switchTo().window(mainWindow2);
	         System.out.println(driver.getTitle());
	       
	         driver.findElement(By.linkText("Online Application for Lateral Recruitment")).click(); //3rd link
	         Thread.sleep(2000);
	         
	         TakesScreenshot t = (TakesScreenshot) driver;
	         
	         File src = t.getScreenshotAs(OutputType.FILE);
	         
	         //Copy file to desired location
	        // Files.copy(src,  new File("D:\\ScreenShots\\p138.png"));
	         //How many popups thr
	         Set<String> allHandles3 = driver.getWindowHandles();
	         
	         //Iterator for fetching sets value
	         Iterator<String>itr3 = allHandles3.iterator();
	         
	         System.out.println(allHandles3.size());
	         String mainWindow3 = itr3.next();
	         String popup4 = itr3.next();
	           
	         //move to 1st popup
	         driver.switchTo().window(popup4);
	        
	         //get the title & url of popup
	          System.out.println("Title of Page : " +driver.getTitle());
	          System.out.println("URL of Page : " +driver.getCurrentUrl());
	         
	         //close popup1
	          driver.close();
	        
	          driver.switchTo().window(mainWindow3);
	          System.out.println(driver.getTitle());
	      
	          driver.findElement(By.linkText("Home")).click();
	       
	       
	       //***************************  Admit Cards ****************************
	       
	           driver.findElement(By.xpath("//span[contains(text(),'Admit Cards')]")).click(); // open Admit Cards page
	           Thread.sleep(2000);
	           System.out.println("Title of page : " +driver.getTitle());
	          
	           driver.findElement(By.linkText("E-Admit Cards for various Examinations of UPSC")).click();//1st link 
	           Thread.sleep(2000);
	          
	           //How many popups thr
	           Set<String> allHandles4 = driver.getWindowHandles();
	         
	           //Iterator for fetching sets value
	            Iterator<String>itr4 = allHandles4.iterator();
	         
	            System.out.println(allHandles4.size());
	            String mainWindow4 = itr4.next();
	            String popup5 = itr4.next();
	          
	            //move to 1st popup
	            driver.switchTo().window(popup5);
	         
	            //get the title & url of popup
	            System.out.println("Title of Page : " +driver.getTitle());
	          
	         
	            //close popup1
	            driver.close();
	        
	            driver.switchTo().window(mainWindow4);
	            System.out.println(driver.getTitle());
	          
	            driver.findElement(By.linkText("E-Admit Cards for various Recruitment Posts")).click(); //2nd link
	            Thread.sleep(2000);
	        
	            //How many popups thr
	            Set<String> allHandles5 = driver.getWindowHandles();
	        
	            //Iterator for fetching sets value
	            Iterator<String>itr5 = allHandles5.iterator();
	        
	              System.out.println(allHandles4.size());
	              String mainWindow5 = itr5.next();
	              String popup6 = itr5.next();
	         
	            //move to 1st popup
	            driver.switchTo().window(popup6);
	       
	            //get the title & url of popup
	             System.out.println("Title of Page : " +driver.getTitle());
	         
	        
	             //close popup1
	             driver.close();
	       
	             driver.switchTo().window(mainWindow5);
	             System.out.println(driver.getTitle());
	             driver.findElement(By.linkText("Home")).click();
	      
	     
	           //************************************ Written Results ***************************
	            driver.findElement(By.xpath("//span[contains(text(),'Written Results')]")).click();//open Written Results 
	            Thread.sleep(2000);
	       
	            driver.findElement(By.linkText("Examination Written Results")).click(); //1st link
	            Thread.sleep(2000);
	       
	        
	            //How many popups thr
	             Set<String> allHandles7 = driver.getWindowHandles();
	      
	            //Iterator for fetching sets value
	             Iterator<String>itr6 = allHandles7.iterator();
	      
	              System.out.println(allHandles7.size());
	              String mainWindow6 = itr6.next();
	              String popup7 = itr6.next();
	       
	            //move to 1st popup
	             driver.switchTo().window(popup7);
	           
	            //get the title & url of popup
	              System.out.println("Title of Page : " +driver.getTitle());
	       
	      
	            //close popup1
	             driver.close();
	     
	             driver.switchTo().window(mainWindow6);
	             System.out.println(driver.getTitle());
	    
	             driver.findElement(By.linkText("Recruitment Written Results (Recruitment Tests)")).click();//2nd link
	             Thread.sleep(2000);
	             System.out.println("Title of Page : " +driver.getTitle());
	    
	             Set<String> allHandles8 = driver.getWindowHandles();
	    
	            //Iterator for fetching sets value
	             Iterator<String>itr7 = allHandles8.iterator();
	    
	              System.out.println(allHandles8.size());
	              String mainWindow7 = itr7.next();
	              String popup8 = itr7.next();
	     
	            //move to 1st popup
	              driver.switchTo().window(popup8);
	    
	            //get the title & url of popup
	              System.out.println("Title of Page : " +driver.getTitle());
	     
	    
	            //close popup1
	             driver.close();
	   
	             driver.switchTo().window(mainWindow7);
	             System.out.println(driver.getTitle());
	      
	             driver.findElement(By.linkText("Home")).click();
	  
	             
	           //************************ Interviews *****************************
	             
	             driver.findElement(By.xpath("//span[contains(text(),'Interviews')]")).click(); // open Interviews page
	             Thread.sleep(2000);
	             System.out.println("Title of Page : " +driver.getTitle());
	             
	             driver.findElement(By.linkText("Interview Schedule")).click(); //1st link
	             Set<String> allHandles9 = driver.getWindowHandles();
	             
	             //Iterator for fetching sets value
	             Iterator<String>itr8 = allHandles9.iterator();
	   
	             System.out.println(allHandles9.size());
	             String mainWindow8 = itr8.next();
	             String popup9 = itr8.next();
	    
	             //move to 1st popup
	             driver.switchTo().window(popup9);
	   
	             //get the title & url of popup
	             System.out.println("Title of Page : " +driver.getTitle());
	    
	   
	            //close popup1
	            driver.close();
	  
	            driver.switchTo().window(mainWindow8);
	            System.out.println(driver.getTitle());
	            
	            driver.findElement(By.linkText("eSummon Letters")).click();//2nd link
	            Thread.sleep(2000);
	            Set<String> allHandles01 = driver.getWindowHandles();
	            
	            //Iterator for fetching sets value
	            Iterator<String>itr9 = allHandles01.iterator();
	  
	            System.out.println(allHandles01.size());
	            String mainWindow9 = itr9.next();
	            String popup01 = itr9.next();
	   
	            //move to 1st popup
	            driver.switchTo().window(popup01);
	  
	            //get the title & url of popup
	            System.out.println("Title of Page : " +driver.getTitle());
	   
	  
	            //close popup1
	            driver.close();

	            driver.switchTo().window(mainWindow9);
	            System.out.println(driver.getTitle());
	           
	            driver.findElement(By.linkText("Home")).click();
	          
	           //***************** Final Results *********************************
	           
	            driver.findElement(By.xpath("//span[contains(text(),'Final Results')]")).click(); //open Final Results page
	            Thread.sleep(2000);
	           
	            driver.findElement(By.linkText("Examination Final Results")).click();//1st link
	             
	            Set<String> allHandles02 = driver.getWindowHandles();
	             
	            //Iterator for fetching sets value
	            Iterator<String>itr01 = allHandles02.iterator();
	   
	            System.out.println(allHandles02.size());
	            String mainWindow01 = itr01.next();
	            String popup02 = itr01.next();
	    
	            //move to 1st popup
	            driver.switchTo().window(popup02);
	   
	            //get the title & url of popup
	             System.out.println("Title of Page : " +driver.getTitle());
	    
	   
	             //close popup1
	             driver.close();

	             driver.switchTo().window(mainWindow01);
	             System.out.println(driver.getTitle());
	              
	             driver.findElement(By.linkText("Recruitment Final Results")).click();//2nd link
	             Thread.sleep(2000);
	              
	             Set<String> allHandles03 = driver.getWindowHandles();
	             
	             //Iterator for fetching sets value
	             Iterator<String>itr02 = allHandles03.iterator();
	   
	             System.out.println(allHandles03.size());
	             String mainWindow02 = itr02.next();
	             String popup03 = itr02.next();
	    
	              //move to 1st popup
	              driver.switchTo().window(popup03);
	   
	              //get the title & url of popup
	              System.out.println("Title of Page : " +driver.getTitle());
	    
	   
	              //close popup1
	              driver.close();

	              driver.switchTo().window(mainWindow02);
	              System.out.println(driver.getTitle());
	            
	              driver.findElement(By.linkText("Home")).click();
	              
	           //*********************** Tenders ************************************
	              
	              driver.findElement(By.xpath("//span[contains(text(),'Tenders')]")).click(); //open Tender page
	              Thread.sleep(2000);
	              System.out.println("Title of Page : " +driver.getTitle());
	              
	              driver.findElement(By.linkText("Disposal of Unserviceable/condemned items")).click(); //open 1st pdf
	              Thread.sleep(2000);
	              System.out.println("Title of Page : " +driver.getTitle());
	              driver.navigate().back();
	              
	              driver.findElement(By.linkText("M/s Somya Pyrotek Services")).click(); //Open 2nd pdf
	              
	              Thread.sleep(2000);
	              Set<String> allHandles04 = driver.getWindowHandles();
	              
	              //Iterator for fetching sets value
	              Iterator<String>itr03 = allHandles04.iterator();
	    
	              System.out.println(allHandles04.size());
	              String mainWindow03 = itr03.next();
	              String popup04 = itr03.next();
	     
	              //move to 1st popup
	              driver.switchTo().window(popup04);
	    
	             //get the title & url of popup
	              System.out.println("Title of Page : " +driver.getTitle());
	     
	    
	             //close popup1
	              driver.close();

	              driver.switchTo().window(mainWindow03);
	              System.out.println(driver.getTitle());
	              
	           //**************************** Annual Reports ********************************
	               
	              driver.findElement(By.xpath("//span[contains(text(),'Annual Reports')]")).click(); //Open Annual Reports
	              Thread.sleep(2000);
	              System.out.println("Title of Page : " +driver.getTitle());
	              
	              driver.findElement(By.xpath("//p[contains(text(),'69th Annual Report')]")).click(); //1st pdf
	              Thread.sleep(2000);
	              System.out.println("Title of Page : " +driver.getTitle());
	              driver.navigate().back(); 
	              
	              driver.findElement(By.linkText("Other Statistical Information")).click(); //open link Other Statistical Information
	              Thread.sleep(2000);
	               
	              Set<String> allHandles05 = driver.getWindowHandles();
	              
	              //Iterator for fetching sets value
	              Iterator<String>itr04 = allHandles05.iterator();
	    
	              System.out.println(allHandles05.size());
	              String mainWindow04 = itr04.next();
	              String popup05 = itr04.next();
	     
	              //move to 1st popup
	               driver.switchTo().window(popup05);
	    
	              //get the title & url of popup
	               System.out.println("Title of Page : " +driver.getTitle());
	     
	    
	              //close popup1
	               driver.close();

	               driver.switchTo().window(mainWindow04);
	               System.out.println(driver.getTitle());
	               
	            // *************************** Single Window System / e-Appointment  ****************************** 
	               driver.findElement(By.xpath("//span[contains(text(),'Single Window System / e-Appointment')]")).click(); 
	               Thread.sleep(2000);
	               System.out.println("Title of Page : " +driver.getTitle());
	             
	               driver.findElement(By.linkText("Appointment Branch")).click(); //1st link
	               Thread.sleep(2000);
	               System.out.println("Title of Page : " +driver.getTitle());
	               
	               
	               Set<String> allHandles06 = driver.getWindowHandles();
	               
	               //Iterator for fetching sets value
	               Iterator<String>itr05 = allHandles06.iterator();
	     
	               System.out.println(allHandles06.size());
	               String mainWindow05 = itr05.next();
	               String popup06 = itr05.next();
	      
	               //move to 1st popup
	               driver.switchTo().window(popup06);
	     
	               //get the title & url of popup
	               System.out.println("Title of Page : " +driver.getTitle());
	      
	     
	               //close popup1
	                driver.close();

	                driver.switchTo().window(mainWindow05);
	                System.out.println(driver.getTitle());
	                
	                driver.findElement(By.linkText("Services - I Branch")).click();//2nd link
	                Thread.sleep(2000);
	                System.out.println("Title of Page : " +driver.getTitle());
	                
	                Set<String> allHandles07 = driver.getWindowHandles();
	                
	               //Iterator for fetching sets value
	                Iterator<String>itr06 = allHandles07.iterator();
	      
	                System.out.println(allHandles07.size());
	                String mainWindow06 = itr06.next();
	                String popup07 = itr06.next();
	       
	                //move to 1st popup
	                 driver.switchTo().window(popup07);
	      
	                //get the title & url of popup
	                 System.out.println("Title of Page : " +driver.getTitle());
	       
	      
	                //close popup1
	                 driver.close();

	                 driver.switchTo().window(mainWindow06);
	                 System.out.println(driver.getTitle());
	                 
	             //********************** Court Judgments ****************************
	                 driver.findElement(By.xpath("//span[contains(text(),'Court Judgments')]")).click();
	                 Thread.sleep(2000);
	                 System.out.println("Title of Page : " +driver.getTitle());
	                 Set<String> allHandles08 = driver.getWindowHandles();
	                 
	                //Iterator for fetching sets value
	                 Iterator<String>itr07 = allHandles08.iterator();
	       
	                 System.out.println(allHandles08.size());
	                 String mainWindow07 = itr07.next();
	                 String popup08 = itr07.next();
	        
	                 //move to 1st popup
	                  driver.switchTo().window(popup08);
	       
	                 //get the title & url of popup
	                  System.out.println("Title of Page : " +driver.getTitle());
	        
	       
	                 //close popup1
	                  driver.close();

	                  driver.switchTo().window(mainWindow07);
	                  System.out.println(driver.getTitle());
	                  
	               //*********************** Green Initiatives ******************************** 
	                  driver.findElement(By.xpath("//span[contains(text(),'Green Initiatives')]")).click(); 
	                  Thread.sleep(2000);
	                  System.out.println("Title of Page : " +driver.getTitle());
	                  driver.navigate().back();
	                  
	              //********************** swach bharat*******************************************
	                  driver.findElement(By.xpath("//a[@href=\"/swachh-bharat-abhiyan\"]")).click();
	                  Thread.sleep(2000);
	                  System.out.println("Title of Page : " +driver.getTitle());
	                  driver.navigate().back();
	               
	              //************************ Archives *******************************
	                  driver.findElement( By.xpath("//span[contains(text(),'Archives')]")).click();
	                  Thread.sleep(2000);
	                  System.out.println("Title of Page : " +driver.getTitle());
	                  
	                  driver.findElement(By.linkText("Annual Reports Archives")).click(); // Open Archives page
	                  Thread.sleep(2000);
	                  System.out.println("Title of Page : " +driver.getTitle());
	                  
	                  Set<String> allHandles09 = driver.getWindowHandles();
	                  
	                //Iterator for fetching sets value
	                 Iterator<String>itr08 = allHandles09.iterator();
	        
	                 System.out.println(allHandles09.size());
	                 String mainWindow08 = itr08.next();
	                 String popup09 = itr08.next();
	         
	                //move to 1st popup
	                 driver.switchTo().window(popup09);
	        
	                //get the title & url of popup
	                  System.out.println("Title of Page : " +driver.getTitle());
	         
	        
	                //close popup1
	                 driver.close();

	                 driver.switchTo().window(mainWindow08);
	                 System.out.println(driver.getTitle()); 
	                   
	                 driver.findElement(By.linkText("Home")).click();
	                  
	             //***************************** Externals Links *************************************************
	                 driver.findElement(By.xpath("//*[@id=\"quicktabs-tabpage-related_links-0\"]/div/div[1]/div/ul/li[1]/div/div/a")).click();
	                 Thread.sleep(2000);
	                 System.out.println("Title of Page : " +driver.getTitle());
	                 driver.navigate().back();
	                   
	                 driver.findElement(By.linkText("Department of Personnel & Training")).click(); 
	                 Thread.sleep(2000);
	                 System.out.println("Title of Page : " +driver.getTitle());
	                 driver.navigate().back();
	                   
	                 driver.findElement(By.linkText("State Public Service Commissions")).click(); 
	                 Thread.sleep(2000);
	                 System.out.println("Title of Page : " +driver.getTitle());
	                 driver.navigate().back();
	                   
	                 driver.findElement(By.linkText("SHe-Box")).click();
	                 Thread.sleep(2000);
	                 
	                 TakesScreenshot t1 = (TakesScreenshot) driver;
	                 
	                 File src1 = t1.getScreenshotAs(OutputType.FILE);
	                 
	                 //Copy file to desired location
	                 //Files.copy(src1,  new File("D:\\ScreenShots\\p136.png"));
	                 
	                 System.out.println("Title of Page : " +driver.getTitle());
	                 driver.navigate().back();
	                   
	                 driver.findElement(By.linkText("Commission of Scientific & Technical Terminology")).click();
	                 Thread.sleep(2000);
	                 TakesScreenshot t2 = (TakesScreenshot) driver;
	                 
	                 File src2 = t2.getScreenshotAs(OutputType.FILE);
	                 
	                 //Copy file to desired location
	                 //Files.copy(src,  new File("D:\\ScreenShots\\p130.png"));
	                 System.out.println("Title of Page : " +driver.getTitle());
	                 driver.navigate().back();
	                   
	              //************************* Hon'ble Chairman's Speech ****************************
	                 driver.findElement(By.linkText("Hon'ble Chairman's Speech")).click();
	                 Thread.sleep(2000);
	                 System.out.println("Title of Page : " +driver.getTitle());
	                   
	                 driver.findElement(By.linkText("(6.68 MB)")).click();
	                 Set<String> allHandles11 = driver.getWindowHandles();
	                   
	               //Iterator for fetching sets value
	                Iterator<String>itr09 = allHandles11.iterator();
	         
	                System.out.println(allHandles11.size());
	                String mainWindow09 = itr09.next();
	                String popup11 = itr09.next();
	          
	               //move to 1st popup
	                driver.switchTo().window(popup11);
	         
	                //get the title & url of popup
	                 System.out.println("Title of Page : " +driver.getTitle());
	          
	         
	                //close popup1
	                 driver.close();

	                 driver.switchTo().window(mainWindow09);
	                 System.out.println(driver.getTitle()); 
	                 driver.navigate().back();
	                    
	               //******************* Advisers Corner ***********************
	                 driver.findElement(By.linkText("Advisers Corner")).click();
	                 Thread.sleep(2000);
	                 System.out.println("Title of Page : " +driver.getTitle());
	                    
	                 driver.findElement(By.xpath("//*[@id=\"block-views-basic-page-block\"]/div/div/div/div[1]/div/p[1]/a")).click();
	                 Thread.sleep(2000);
	                 System.out.println("Title of Page : " +driver.getTitle());
	                 driver.navigate().back();
	                 
	                 driver.findElement(By.linkText("Downloadable Biodata proforma for empanelment as Adviser")).click();
	                 Thread.sleep(2000);
	                 System.out.println("Title of Page : " +driver.getTitle());
	                 driver.navigate().back();
	                 driver.findElement(By.linkText("Home")).click();
	                    
	                //*********************   "Employees Corner ************************************** 
	                    
	                 driver.findElement(By.linkText("Employees Corner")).click();
	                 Thread.sleep(2000);
	                 System.out.println("Title of Page : " +driver.getTitle());
	                   
	                 driver.findElement(By.linkText("Implementation of AEBAS in UPSC")).click();
	                 Thread.sleep(2000);
	                 System.out.println("Title of page :" +driver.getTitle());
	                    
	                 Set<String> allHandles12 = driver.getWindowHandles();
	                    
	               //Iterator for fetching sets value
	                Iterator<String>itr10 = allHandles12.iterator();
	          
	                System.out.println(allHandles12.size());
	                String mainWindow10 = itr10.next();
	                String popup12 = itr10.next();
	           
	              //move to 1st popup
	               driver.switchTo().window(popup12);
	          
	             //get the title & url of popup
	               System.out.println("Title of Page : " +driver.getTitle());
	           
	          
	             //close popup1
	              driver.close();

	              driver.switchTo().window(mainWindow10);
	              System.out.println(driver.getTitle()); 
	              driver.navigate().back();
	                     
	             //****************************** Work With Us *****************************
	               driver.findElement(By.linkText("Work With Us")).click();
	               Thread.sleep(2000);
	               System.out.println("Title of page : " +driver.getTitle());
	                    
	               driver.findElement(By.linkText("Click Here to Apply")).click();
	                     
	                     
	               Set<String> allHandles13 = driver.getWindowHandles();
	                     
	             //Iterator for fetching sets value
	               Iterator<String>itr11 = allHandles13.iterator();
	           
	               System.out.println(allHandles13.size());
	               String mainWindow11 = itr11.next();
	               String popup13= itr11.next();
	            
	            //move to 1st popup
	             driver.switchTo().window(popup13);
	           
	           //get the title & url of popup
	            System.out.println("Title of Page : " +driver.getTitle());
	            
	           
	            //close popup1
	              driver.close();

	              driver.switchTo().window(mainWindow11);
	              System.out.println(driver.getTitle()); 
	              driver.findElement(By.linkText("Home")).click();
	                      
	            //*************************** News Letters ***************************************
	                driver.findElement(By.linkText("News Letters")).click();
	                Thread.sleep(2000);
	                System.out.println("Title of Page : " +driver.getTitle());
	                driver.findElement(By.linkText("79th Issue")).click();
	                Thread.sleep(2000);
	                System.out.println("Title of Page : " +driver.getTitle()); 
	                driver.findElement(By.linkText("Home")).click();
	           
	            //************************* Website Policies *****************************************    
	                driver.findElement(By.linkText("Website Policies")).click();
	                Thread.sleep(2000);
	                System.out.println("Title of Page : " +driver.getTitle());
	                driver.findElement(By.linkText("Home")).click();
	                
	                
	           //******************************* Help *****************************************   
	               driver.findElement(By.linkText("Help")).click();
	               Thread.sleep(2000);
	               System.out.println("Title of Page : " +driver.getTitle());
	               driver.findElement(By.xpath("//*[@id=\"block-views-basic-page-block\"]/div/div/div/div[1]/div/div[2]/table/tbody/tr[6]/td[2]/a")).click();
	               Thread.sleep(2000);
	               System.out.println("Title of Page : " +driver.getTitle());
	                
	               Set<String> allHandles14 = driver.getWindowHandles();
	                
	            //Iterator for fetching sets value
	              Iterator<String>itr12 = allHandles14.iterator();
	      
	              System.out.println(allHandles14.size());
	              String mainWindow12 = itr12.next();
	              String popup14= itr12.next();
	       
	           //move to 1st popup
	             driver.switchTo().window(popup14);
	      
	          //get the title & url of popup
	            System.out.println("Title of Page : " +driver.getTitle());
	       
	      
	          //close popup1
	            driver.close();

	            driver.switchTo().window(mainWindow12);
	            System.out.println(driver.getTitle()); 
	            driver.navigate().back();
	     
	         //************************** Contact us *******************************************     
	                 
	             driver.findElement(By.linkText("Contact us")).click();
	             Thread.sleep(2000);
	             driver.navigate().back();
	         
	        //************************** Web Information Manager  *******************************      
	            driver.findElement(By.linkText("Web Information Manager")).click();
	            Thread.sleep(2000);
	            driver.navigate().back();
	             
	        //******************* Feedback *****************************************   
	           driver.findElement(By.linkText("Feedback")).click();
	           Thread.sleep(2000);
	           driver.navigate().back();
	                 
	        //***************************** Privacy Policy ************************
	                 
	           driver.findElement(By.linkText("Privacy Policy")).click();
	           Thread.sleep(2000);
	           driver.navigate().back();
	            
	        //****************************** Disclaimer **************************
	             
	           driver.findElement(By.linkText("Disclaimer")).click();
	           Thread.sleep(2000);
	           driver.navigate().back();
	         
	 	    }
	 	

	 	
	 	
	 	
	 	public void AboutUs() throws InterruptedException
	 	{
	 	
	 	//********************AboutUs************************************************************************************
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"))).perform();
		

		//*********************Historical Persceptive*********************************************************************
		driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(2000);
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		 

		//*********************Constitutional Provision*******************************************************************
		a.moveToElement( driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"))).perform();
		driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]")).click();
		 

		driver.findElement(By.xpath("//a[contains(text(),'Article-315. Public Service Commissions for the Un')]")).click();
		 
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		 

		driver.findElement(By.xpath("//a[contains(text(),'Article-316. Appointment and term of office of mem')]")).click();
		 
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		 

		driver.findElement(By.xpath("//a[contains(text(),'Article-317. Removal and suspension of a member of')]")).click();
		 
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Article-318. Power to make regulations as to condi')]")).click();
		 
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Article-319. Prohibition as to the holding of offi')]")).click();
		 
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		 

		driver.findElement(By.xpath("//a[contains(text(),'Article-320. Functions of Public Service Commissio')]")).click();
		 
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		 

		driver.findElement(By.xpath("//a[contains(text(),'Article-321. Power to extend functions of Public S')]")).click();
		 
		System.out.println("Title of Page : " +  driver.getTitle());
		driver.navigate().back();
		 

		driver.findElement(By.xpath("//a[contains(text(),'Article-322. Expenses of Public Service Commission')]")).click();
		 
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		 

		driver.findElement(By.xpath("//a[contains(text(),'Article-323. Reports of Public Service Commissions')]")).click();
		 
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.linkText("Home")).click();

		//********************* The Commission ************************************************************************
		a.moveToElement( driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"))).perform();
		driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[3]/a[1]")).click();
		System.out.println("Title of Page : " + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"block-views-basic-page-block\"]/div/div/div/div[1]/div/div[2]/table/tbody/tr[2]/td[2]/p/a")).click();
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		 
		driver.findElement(By.xpath("//*[@id=\"block-views-basic-page-block\"]/div/div/div/div[1]/div/div[2]/table/tbody/tr[3]/td[2]/p/a")).click();
	    System.out.println("Title of Page : " + driver.getTitle());
	    driver.navigate().back();
		
	    driver.findElement(By.xpath("//*[@id=\"block-views-basic-page-block\"]/div/div/div/div[1]/div/div[2]/table/tbody/tr[4]/td[2]/p/a")).click();
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"block-views-basic-page-block\"]/div/div/div/div[1]/div/div[2]/table/tbody/tr[5]/td[2]/p/a/strong")).click();
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"block-views-basic-page-block\"]/div/div/div/div[1]/div/div[2]/table/tbody/tr[6]/td[2]/p/a")).click();
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"block-views-basic-page-block\"]/div/div/div/div[1]/div/div[2]/table/tbody/tr[7]/td[2]/p/a")).click();
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"block-views-basic-page-block\"]/div/div/div/div[1]/div/div[2]/table/tbody/tr[7]/td[2]/p/a")).click();
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"block-views-basic-page-block\"]/div/div/div/div[1]/div/div[2]/table/tbody/tr[9]/td[2]/p/a")).click();
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"block-views-basic-page-block\"]/div/div/div/div[1]/div/div[2]/table/tbody/tr[10]/td[2]/p/a")).click();
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		
		driver.findElement(By.linkText("Home")).click();

		
		//*********************Functions****************************************************************************************
		a.moveToElement( driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"))).perform();
		driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[4]/a[1]")).click();
		 
		System.out.println("Title of Page : " +driver.getTitle());
		driver.navigate().back();
		 

		//*********************Securities****************************************************************************************
		 a.moveToElement( driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"))).perform();
		 driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[5]/a[1]")).click();
		 
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		 
		//*********************Divisions******************************************************************************************
	 	a.moveToElement(driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"))).perform();
	 	driver.findElement(By.linkText("Divisions")).click();
		System.out.println("Title of Page : " + driver.getTitle());
		
		
		driver.findElement(By.linkText("Administration")).click();
		Thread.sleep(2000);
		System.out.println("Title of Page : " + driver.getTitle());
		
		driver.findElement(By.linkText("Introduction")).click();
		Thread.sleep(2000);
	    System.out.println("Title of Page : " + driver.getTitle());
	    driver.navigate().back();
		
	    driver.findElement(By.linkText("Personnel")).click();
	    Thread.sleep(2000);
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		
		driver.findElement(By.linkText("Functions")).click();
		Thread.sleep(2000);
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		
		driver.findElement(By.linkText("Recruitment Rules")).click();
		Thread.sleep(2000);
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		
		driver.findElement(By.linkText("Work with Us")).click();
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.linkText("Home")).click();
		
		

	 	//*********************Directory******************************************************************************************
		a.moveToElement( driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"))).perform();
		driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[7]/a[1]")).click();
		Thread.sleep(2000);
		System.out.println("Title of Page : " + driver.getTitle());
		driver.navigate().back();
		 

	 	//*********************Museum**********************************************************************************************
		a.moveToElement( driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"))).perform();
		driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[8]/a[1]")).click();
		Thread.sleep(2000);
		System.out.println("Title of Page : " + driver.getTitle());
		 

		//*********************Museum>>Overview*****************************************************************************************

		driver.findElement(By.xpath("//a[contains(text(),'(17.66 MB)')]")).click();
		 
		Set<String> window =  driver.getWindowHandles();
		//Iterator for fetching sets value
		Iterator<String>itr = window.iterator();
		System.out.println(window.size());
		String mainWindow = itr.next();
		String popup = itr.next();
		//move to 1st popup
		driver.switchTo().window(popup);
		//get the title & url of popup
		System.out.println("Title of Page : " + driver.getTitle());
		System.out.println("URL of Page : " + driver.getCurrentUrl());
		//close popup1
		driver.close();
		driver.switchTo().window(mainWindow);
		System.out.println( driver.getTitle());
		 
		//*********************Museum >> Virtual Tour Of Museum*************************************************************************
		driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[2]/li[1]/a[1]")).click();
		 Thread.sleep(50000);
	 	Set<String> window1 =  driver.getWindowHandles();
		//Iterator for fetching sets value
		Iterator<String>itr1 = window1.iterator();
		System.out.println(window1.size());
		String mainWindow1 = itr1.next();
		String popup1 = itr1.next();
		//move to 1st popup
		driver.switchTo().window(popup1);
		//get the title & url of popup
		System.out.println("Title of Page : " + driver.getTitle());
		System.out.println("URL of Page : " + driver.getCurrentUrl());
		//close popup1
		driver.close();
		driver.switchTo().window(mainWindow1);
		 System.out.println( driver.getTitle());   
		 
		//*********************Museum >> Archived Documents in Museum***********************************************************

		 driver.findElement(By.linkText("Archived Documents in Museum")).click();
		
		System.out.println("Title of Page : " + driver.getTitle());
		 Set<String> window2 = driver.getWindowHandles();
		//Iterator for fetching sets value
		Iterator<String>itr2 = window2.iterator();
		System.out.println(window2.size());
		String mainWindow2 = itr2.next();
		String popup2 = itr2.next();
		//move to 1st popup
		driver.switchTo().window(popup2);
		//get the title & url of popup
		System.out.println("Title of Page : " + driver.getTitle());
		System.out.println("URL of Page : " + driver.getCurrentUrl());
		//close popup1
		driver.close();
		driver.switchTo().window(mainWindow1);
		System.out.println(driver.getTitle());  
		
		driver.findElement(By.linkText("Home")).click();
		 

		//*********************Museum >> Archived Documents in Museum >> Document Download pdf1 *************************

	  // d.findElement(By.xpath("//body/section[2]/div/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td[4]/ul/li/a")).click();
		 
	/*	 Set<String> window3 = d.getWindowHandles();
		//Iterator for fetching sets value
		Iterator<String>itr3 = window3.iterator();
		System.out.println(window3.size());
		String mainWindow3 = itr3.next();
		String popup3 = itr3.next();
		//move to popup
		d.switchTo().window(popup3);
		//get the title & url of popup
		System.out.println("Title of Page : " +d.getTitle());
		System.out.println("URL of Page : " +d.getCurrentUrl());
		//close popup
		d.close();
		d.switchTo().window(mainWindow3);
		System.out.println(d.getTitle()); */

		//*********************Museum >> Archived Documents in Museum >> Document Download pdf2 *************************

		//d.findElement(By.cssSelector("body > section.wrapper.body-wrapper > div > div.col-xs-12.col-sm-9.col-md-9.content-container.fontSize > div > div > div > div.scroll-table1 > table > tbody > tr:nth-child(2) > td.views-field.views-field-php > ul > li > a")).click();
		 
		/*Set<String> window4 = d.getWindowHandles();
		//Iterator for fetching sets value
		Iterator<String>itr4 = window4.iterator();
		System.out.println(window4.size());
		String mainWindow4 = itr4.next();
		String popup4 = itr4.next();
		//move to 2nd popup
		d.switchTo().window(popup4);
		//get the title & url of popup
		System.out.println("Title of Page : " +d.getTitle());
		System.out.println("URL of Page : " +d.getCurrentUrl());
		//close popup2
		d.close();
		d.switchTo().window(mainWindow4);
		System.out.println(d.getTitle());   */
		 
		
		 
		 

			}
	 	 public void Examinations() throws InterruptedException, IOException {
	  	    
	  		//********************* Examination **************************************************   
	  		    
	  		     Actions A = new Actions( driver);
	  		     A.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a"))).perform();
	  		 

	  		//*********************  Calendar *****************************************  
	  		     driver.findElement(By.linkText("Calendar")).click();
	  		     Thread.sleep(2000);
	  		     System.out.println("Title of page :" +driver);
	  		     driver.findElement(By.linkText("Annual Calendar 2021")).click();
	  		    
	  		     Set<String> allHandles15 = driver.getWindowHandles();
	  	        
	  	        //Iterator for fetching sets value
	  	         Iterator<String>itr15 = allHandles15.iterator();
	  	        
	  	         System.out.println(allHandles15.size());
	  	         String mainWindow15 = itr15.next();
	  	         String popup15 = itr15.next();
	  	         
	  	        //move to 1st popup
	  	          driver.switchTo().window(popup15);
	  	       
	  	         //get the title & url of popup
	  	          System.out.println("Title of Page : " +driver.getTitle());
	  	          System.out.println("URL of Page : " +driver.getCurrentUrl());
	  	        
	  	         //close popup1
	  	          driver.close();
	  	       
	  	          driver.switchTo().window(mainWindow15);
	  	          System.out.println(driver.getTitle());
	  	      
	  	          driver.findElement(By.linkText( "Revised Annual Calendar - 2020")).click();
	  	          Thread.sleep(2000);
	  	          Set<String> allHandles16 = driver.getWindowHandles();
	  	      
	  	        //Iterator for fetching sets value
	  	          Iterator<String>itr16 = allHandles16.iterator();
	  	      
	  	          System.out.println(allHandles16.size());
	  	          String mainWindow16 = itr16.next();
	  	          String popup16 = itr16.next();
	  	       
	  	         //move to 1st popup
	  	          driver.switchTo().window(popup16);
	  	        
	  	         //get the title & url of popup
	  	          System.out.println("Title of Page : " +driver.getTitle());
	  	          System.out.println("URL of Page : " +driver.getCurrentUrl());
	  	      
	  	         //close popup1
	  	          driver.close();
	  	     
	  	          driver.switchTo().window(mainWindow16);
	  	          System.out.println(driver.getTitle());
	  	    
	  	          driver.navigate().back();
	  	    
	  	      //********************* Examination **************************************************  
	  	         A.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a"))).perform();
	  	    
	  	     //************************** Active Examinations *************************
	  	        driver.findElement(By.linkText("Active Examinations")).click();
	  	        Thread.sleep(2000);
	  	        System.out.println("Title of Page : " +driver.getTitle());
	  	    
	  	        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div/div/div[1]/div/div/a/ul/li")).click();
	  	        Thread.sleep(2000);
	  	        System.out.println("Title of Page : " +driver.getTitle());
	  	   
	  	        driver.findElement(By.linkText("FR-CDS-I-20-OTA-Engl-24052021.pdf")).click();
	  	        Thread.sleep(2000);
	  	    
	  	        Set<String> allHandles17 = driver.getWindowHandles();
	  	    
	  	      //Iterator for fetching sets value
	  	       Iterator<String>itr17 = allHandles17.iterator();
	  	    
	  	       System.out.println(allHandles17.size());
	  	       String mainWindow17 = itr17.next();
	  	       String popup17 = itr17.next();
	  	     
	  	     //move to 1st popup
	  	      driver.switchTo().window(popup17);
	  	        
	  	     //get the title & url of popup
	  	      System.out.println("Title of Page : " +driver.getTitle());
	  	      System.out.println("URL of Page : " +driver.getCurrentUrl());
	  	    
	  	     //close popup1
	  	      driver.close();
	  	   
	  	      driver.switchTo().window(mainWindow17);
	  	      System.out.println(driver.getTitle());
	  	  
	  	      driver.navigate().back();
	  	        
	  	      driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div/div/div[2]/div/div/a/ul/li")).click();
	  	      Thread.sleep(2000);
	  	      System.out.println("Title of Page : " +driver.getTitle());
	  	               
	  	      driver.findElement(By.linkText("Press Note_CSE_2020-19042021.pdf")).click();
	  	      Thread.sleep(2000);
	  	               
	  	      Set<String> allHandles18 = driver.getWindowHandles();
	  	               
	  	      //Iterator for fetching sets value
	  	       Iterator<String>itr18 = allHandles18.iterator();
	  	             
	  	       System.out.println(allHandles18.size());
	  	       String mainWindow18 = itr18.next();
	  	       String popup18 = itr18.next();
	  	              
	  	      //move to 1st popup
	  	       driver.switchTo().window(popup18);
	  	                 
	  	     //get the title & url of popup
	  	      System.out.println("Title of Page : " +driver.getTitle());
	  	      System.out.println("URL of Page : " +driver.getCurrentUrl());
	  	             
	  	     //close popup1
	  	      driver.close();
	  	            
	  	     driver.switchTo().window(mainWindow18);
	  	     System.out.println(driver.getTitle());
	  	           
	  	     driver.navigate().back();
	  	                     
	  	                       
	  	     driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div/div/div[3]/div/div/a/ul/li")).click();
	  	     Thread.sleep(2000);
	  	     System.out.println("Title of Page : " +driver.getTitle());
	  	               
	  	     driver.findElement(By.linkText("CAPF-Exam-2021-final.pdf")).click();
	  	     Thread.sleep(2000);      
	  	     Set<String> allHandles19 = driver.getWindowHandles();
	  	                
	  	    //Iterator for fetching sets value
	  	      Iterator<String>itr19 = allHandles19.iterator();
	  	              
	  	      System.out.println(allHandles19.size());
	  	      String mainWindow19 = itr19.next();
	  	      String popup19 = itr19.next();
	  	               
	  	      //move to 1st popup
	  	      driver.switchTo().window(popup19);
	  	                  
	  	      //get the title & url of popup
	  	      System.out.println("Title of Page : " +driver.getTitle());
	  	      System.out.println("URL of Page : " +driver.getCurrentUrl());
	  	              
	  	     //close popup1
	  	       driver.close();
	  	             
	  	       driver.switchTo().window(mainWindow19);
	  	       System.out.println(driver.getTitle());
	  	            
	  	       driver.navigate().back();       
	  	       driver.findElement(By.linkText("Home")).click();
	  	                        
	  	     //********************* Examination **************************************************  
	  	       A.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a"))).perform();   
	  	                   
	  	    //************************* "Forthcoming Examinations ***********************************  
	  	       driver.findElement(By.linkText("Forthcoming Examinations")).click();
	  	       Thread.sleep(2000);
	  	      TakesScreenshot t = (TakesScreenshot) driver;
	           
	           File src = t.getScreenshotAs(OutputType.FILE);
	           
	           //Copy file to desired location
	          // Files.copy(src,  new File("D:\\ScreenShots\\p133.png"));
	  	       System.out.println("Title of Page : " +driver.getTitle());
	  	       driver.findElement(By.linkText("Home")).click();
	  	                
	  	   //********************* Examination **************************************************  
	  	       A.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a"))).perform();   
	  	                     
	  	  //************************* " Previous Question Papers " ***********************************
	  	                   
	  	        driver.findElement(By.linkText("Previous Question Papers")).click();
	  	        Thread.sleep(2000);
	  	        System.out.println("Title of Page : " +driver.getTitle());
	  	                   
	  	        driver.findElement(By.xpath("//input[@id='edit-field-exam-name-value']")).sendKeys("Indian Forest Service (Main) Examination, 2020");
	  	        driver.findElement(By.xpath("//button[@id='edit-submit-exam-rel-info']")).click();
	  	        driver.findElement(By.linkText("Chemical Engineering Paper - I")).click();
	  	                     
	  	       Set<String> allHandles20 = driver.getWindowHandles();
	  	                     
	  	      //Iterator for fetching sets value
	  	       Iterator<String>itr20 = allHandles20.iterator();
	  	                   
	  	       System.out.println(allHandles20.size());
	  	       String mainWindow20 = itr20.next();
	  	       String popup20 = itr20.next();
	  	                    
	  	     //move to 1st popup
	  	       driver.switchTo().window(popup20);
	  	                       
	  	     //get the title & url of popup
	  	       System.out.println("Title of Page : " +driver.getTitle());
	  	       System.out.println("URL of Page : " +driver.getCurrentUrl());
	  	                   
	  	    //close popup1
	  	      driver.close();
	  	                  
	  	      driver.switchTo().window(mainWindow20);
	  	      System.out.println(driver.getTitle());
	  	                 
	  	      driver.navigate().back();       
	  	      driver.findElement(By.linkText("Home")).click();
	  	                       
	  	   //********************* Examination **************************************************  
	  	       A.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a"))).perform();   
	  	                             
	  	  //************************* " Cut-off Marks " ***********************************  
	  	       driver.findElement(By.linkText("Cut-off Marks")).click();
	  	       Thread.sleep(2000);
	  	       System.out.println("Title of Page : " +driver.getTitle());
	  	                             
	  	      driver.findElement(By.xpath("//input[@id='edit-field-exam-name-value']")).sendKeys("Engineering Services (Main) Examination");
	  	      driver.findElement(By.xpath("//button[@id='edit-submit-exam-rel-info']")).click();
	  	                             
	  	      driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr/td[2]/ul/li/a")).click();
	  	      Set<String> allHandles21 = driver.getWindowHandles();
	  	                             
	  	   //Iterator for fetching sets value
	  	     Iterator<String>itr21 = allHandles21.iterator();
	  	                           
	  	     System.out.println(allHandles21.size());
	  	     String mainWindow21 = itr21.next();
	  	     String popup21 = itr21.next();
	  	                            
	  	    //move to 1st popup
	  	      driver.switchTo().window(popup21);
	  	                               
	  	    //get the title & url of popup
	  	      System.out.println("Title of Page : " +driver.getTitle());
	  	      System.out.println("URL of Page : " +driver.getCurrentUrl());
	  	                           
	  	     //close popup1
	  	       driver.close();
	  	                          
	  	      driver.switchTo().window(mainWindow21);
	  	      System.out.println(driver.getTitle());
	  	                         
	  	      driver.navigate().back();       
	  	      driver.findElement(By.linkText("Home")).click();
	  	                     
	  	                                
	  	   //********************* Examination **************************************************  
	  	   
	  	        A.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a"))).perform();   
	  	                                
	     
	  	   //************************* " Answer Keys " ***********************************             
	  	                                  
	  	        driver.findElement(By.linkText("Answer Keys")).click();
	  	        Thread.sleep(2000);
	  	        System.out.println("Title of Page : " +driver.getTitle());
	  	                            
	  	        driver.findElement(By.xpath("//input[@id='edit-field-exam-name-value']")).sendKeys("Engineering Services (Preliminary) Examination");
	  	        driver.findElement(By.xpath("//button[@id='edit-submit-exam-rel-info']")).click();
	  	                           
	  	        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr/td[2]/ul/li[4]/a")).click(); 
	  	                           
	  	        Set<String> allHandles22 = driver.getWindowHandles();
	  	                            
	  	     //Iterator for fetching sets value
	  	       Iterator<String>itr22 = allHandles22.iterator();
	  	                          
	  	       System.out.println(allHandles22.size());
	  	       String mainWindow22 = itr22.next();
	  	       String popup22 = itr22.next();
	  	                           
	  	     //move to 1st popup
	  	      driver.switchTo().window(popup22);
	  	                              
	  	    //get the title & url of popup
	  	      System.out.println("Title of Page : " +driver.getTitle());
	  	      System.out.println("URL of Page : " +driver.getCurrentUrl());
	  	                          
	  	   //close popup1
	  	      driver.close();
	  	                         
	  	      driver.switchTo().window(mainWindow22);
	  	      System.out.println(driver.getTitle());
	  	                        
	  	      driver.navigate().back();       
	  	      driver.findElement(By.linkText("Home")).click();
	  	                    
	  	  //********************* Examination **************************************************  
	  	       A.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a"))).perform();   
	  	                                
	  	 //************************* " Marks Information " ***********************************    
	  	      driver.findElement(By.linkText("Marks Information")).click();
	  	      Thread.sleep(2000);
	  	      
	  	      System.out.println("Title of Page : " +driver.getTitle());
	  	                            
	  	      driver.navigate().back(); 
	  	                       
	  	 //********************* Examination **************************************************  
	  	     A.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a"))).perform();   
	  	                                
	     //************************* "Public Disclosure of marks & other details of non-recommended willing candidates" ***********************************        
	  	                            
	  	      driver.findElement(By.linkText("Public Disclosure of marks & other details of non-recommended willing candidates")).click();    
	  	      Thread.sleep(2000);
	  	      System.out.println("Title of Page : " +driver.getTitle());
	  	                       
	  	      driver.findElement(By.linkText("(86.26 KB)")).click();
	  	                     
	  	      Set<String> allHandles23 = driver.getWindowHandles();
	  	                     
	  	     //Iterator for fetching sets value
	  	       Iterator<String>itr23 = allHandles23.iterator();
	  	                   
	  	       System.out.println(allHandles23.size());
	  	       String mainWindow23 = itr23.next();
	  	       String popup23 = itr23.next();
	  	                    
	  	    //move to 1st popup
	  	      driver.switchTo().window(popup23);
	  	                       
	  	   //get the title & url of popup
	  	     System.out.println("Title of Page : " +driver.getTitle());
	  	     System.out.println("URL of Page : " +driver.getCurrentUrl());
	  	                   
	  	    //close popup1
	  	      driver.close();
	  	                  
	  	      driver.switchTo().window(mainWindow23);
	  	      System.out.println(driver.getTitle());
	  	                 
	  	       driver.findElement(By.linkText("Home")).click(); 
	  	                        
	  	   //********************* Examination **************************************************  
	  	     
	  	         A.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a"))).perform();  
	  	  
	  	   //***************** Model Question Cum Answer Booklet (QCAB) ********************************
	  	               
	  	        driver.findElement(By.linkText("Model Question Cum Answer Booklet (QCAB)")).click();
	  	        Thread.sleep(2000);
	  	        System.out.println("Title of Page : " +driver.getTitle());
	  	                 
	  	        driver.findElement(By.linkText("Home")).click(); 
	  	            
	  	      //********************* Examination **************************************************  
	  	         A.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a"))).perform(); 
	  	                 
	  	      //************************ Common mistakes committed by the candidates in Conventional Papers ***********************
	  	          
	  	       driver.findElement(By.linkText("Common mistakes committed by the candidates in Conventional Papers")).click();
	  	       Thread.sleep(2000);
	  	       System.out.println("Title of Page : " +driver.getTitle());
	  	                
	  	       driver.findElement(By.linkText("Home")).click(); 
	  	                
	  	      //********************* Examination **************************************************  
	  	       A.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a"))).perform();   
	  	                
	  	     //**************************** Revised Syllabus and Scheme *******************************
	  	      
	  	       driver.findElement(By.linkText("Revised Syllabus and Scheme")).click();
	  	       Thread.sleep(2000);
	  	       System.out.println("Title of Page : " +driver.getTitle());
	  	            
	  	       driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr/td[2]/ul/li/a")).click();
	  	                
	  	       Set<String> allHandles24 = driver.getWindowHandles();
	  	           
	  	      //Iterator for fetching sets value
	  	        Iterator<String>itr24 = allHandles24.iterator();
	  	         
	  	        System.out.println(allHandles24.size());
	  	        String mainWindow24 = itr24.next();
	  	        String popup24 = itr24.next();
	  	          
	  	       //move to 1st popup
	  	       driver.switchTo().window(popup24);
	  	             
	  	      //get the title & url of popup
	  	       System.out.println("Title of Page : " +driver.getTitle());
	  	       System.out.println("URL of Page : " +driver.getCurrentUrl());
	  	         
	  	      //close popup1
	  	       driver.close();
	  	        
	  	       driver.switchTo().window(mainWindow24);
	  	       System.out.println(driver.getTitle());
	  	       
	  	       driver.findElement(By.linkText("Home")).click(); 
	  	              
	  	     //********************* Examination **************************************************  
	  	      
	  	       A.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a"))).perform();   
	  	           
	  	     //************************ Representation on Question Papers *****************************   
	  	          
	  	       driver.findElement(By.linkText("Representation on Question Papers")).click();
	  	       Thread.sleep(2000);
	  	       System.out.println("Title of Page : " +driver.getTitle());
	  	             
	  	       driver.findElement(By.linkText("Home")).click(); 
	  	             
	  	    //********************* Examination **************************************************  
	  	            
	  	       A.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a"))).perform();
	  	             
	  	    //***************************** Demo Files ****************************************
	  	            
	  	        driver.findElement(By.linkText("Demo Files")).click();
	  	        Thread.sleep(2000);
	  	        System.out.println("Title of Page : " +driver.getTitle());
	  	             
	  	        driver.findElement(By.linkText("Click Here")).click();
	  	        Set<String> allHandles25 = driver.getWindowHandles();
	  	             
	  	       //Iterator for fetching sets value
	  	        Iterator<String>itr25 = allHandles25.iterator();
	  	           
	  	        System.out.println(allHandles25.size());
	  	        String mainWindow25 = itr25.next();
	  	        String popup25 = itr25.next();
	  	            
	  	        //move to 1st popup
	  	         driver.switchTo().window(popup25);
	  	               
	  	       //get the title & url of popup
	  	        System.out.println("Title of Page : " +driver.getTitle());
	  	        System.out.println("URL of Page : " +driver.getCurrentUrl());
	  	           
	  	      //close popup1
	  	        driver.close();
	  	          
	  	        driver.switchTo().window(mainWindow25);
	  	        System.out.println(driver.getTitle());
	  	         
	  	       driver.findElement(By.linkText("Home")).click(); 
	  	             
	  	           
	  	     }
	  	  
	 	 public void recurit() throws InterruptedException {
	 		
		    	Actions a=new Actions(driver);
		    
		    	
		    	
		    	//*******************************Recruitment ****************************
		    	a.moveToElement(driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"))).perform();
		    	
		    	//*************************Advertisements Tab in Recuritment Drop down*******************
		    	
		    	driver.findElement(By.xpath("//a[contains(text(),'Advertisements')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//a[contains(text(),'View Archives >>')]")).click();
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/span[1]/ul[1]/li[1]/a[1]")).click();
		    	Thread.sleep(2000);
		    	Set <String> windows7=driver.getWindowHandles();
		    	ArrayList <String> tab7=new ArrayList(windows7);
		    	driver.switchTo().window(tab7.get(0));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/a[2]")).click();
		    	Thread.sleep(2000);
		    	//*******************************Recruitment ****************************
		    	a.moveToElement(driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"))).perform();
		    	

		    	//*************************Online Application for Lateral Recruitment Tab in Recuritment Drop down*******************
		    	
		    	driver.findElement(By.xpath("//a[contains(text(),'Online Application for Lateral Recruitment')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	//*******************************Recruitment ****************************
		    	a.moveToElement(driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"))).perform();
		    	
		    	
		    	//*************************Online Recruitment Application  Tab in Recuritment Drop down*******************
		    	
		    	driver.findElement(By.xpath("//a[contains(text(),'Online Recruitment Application (ORA)')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	Set<String> windows8=driver.getWindowHandles();
		    	ArrayList<String> tab8=new ArrayList(windows8);
		    	driver.switchTo().window(tab8.get(1));
		    	driver.close();
		    	driver.switchTo().window(tab8.get(0));
		    	Thread.sleep(2000);
		    	System.out.println(driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/strong[1]/span[1]")).getText());
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[1]/a[1]")).click();
		    	
		    	Thread.sleep(4000);
		    	driver.switchTo().window(tab8.get(0));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a[1]")).click();
		    	
		    	Thread.sleep(2000);
		    	driver.switchTo().window(tab8.get(0));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a[1]")).click();
		    	
		    	Thread.sleep(2000);
		    	driver.switchTo().window(tab8.get(0));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//a[contains(text(),'पहले से पंजीकृत/Already Registered')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("hksj");
		    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("hsugus");
		    	driver.findElement(By.xpath("//input[@id='phrase']")).sendKeys("jshiu");
		    	driver.findElement(By.xpath("//body/div[@id='container']/div[@id='main']/div[@id='content']/div[@id='loginform']/div[2]/form[1]/div[2]/input[1]")).click();
		    	Thread.sleep(2000);
		    	System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'Confirmation of random image failed')]")).getText());
				
				////**********************ORA page- New registration********************
				
				driver.findElement(By.cssSelector("#loginform > div:nth-child(3) > form > div:nth-child(2) > a:nth-child(4) > input")).click();
				System.out.println("Title of Page : " + driver.getTitle());
				driver.findElement(By.xpath("//input[@id='fstname']")).sendKeys("sha");
				driver.findElement(By.xpath("//input[@id='middlename']")).sendKeys("sha");
				driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("sha");
				driver.findElement(By.xpath("//input[@id='fatherfstname']")).sendKeys("aDDS");
				driver.findElement(By.xpath("//input[@id='fathermiddlename']")).sendKeys("BAAB");
				driver.findElement(By.xpath("//input[@id='fatherlastname']")).sendKeys("SJBHS");
				driver.findElement(By.xpath("//input[@id='motherfstname']")).sendKeys("shaB");
				driver.findElement(By.xpath("//input[@id='mothermiddlename']")).sendKeys("sCha");
				driver.findElement(By.xpath("//input[@id='motherlastname']")).sendKeys("shaSSS");
				Select gen=new Select(driver.findElement(By.xpath("//select[@id='sex']")));
				gen.selectByIndex(1);
				Thread.sleep(2000);
				Select community=new Select(driver.findElement(By.xpath("//select[@id='community']")));
				community.selectByIndex(1);
				Thread.sleep(2000);
				Select dis=new Select(driver.findElement(By.xpath("//select[@id='handicapp']")));
				dis.selectByIndex(1);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//img[@id='dobim ']")).click();
				Select date2=new Select(driver.findElement(By.xpath("//tbody/tr[1]/td[1]/select[1]")));
				date2.selectByIndex(1);
				Select year2=new Select(driver.findElement(By.xpath("//tbody/tr[1]/td[2]/select[1]")));
				year2.selectByValue("1994");
				driver.findElement(By.xpath("//td[contains(text(),'24')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='pob']")).sendKeys("giddalur");
				Select state=new Select(driver.findElement(By.xpath("//select[@id='sob']")));
				state.selectByIndex(1);
				Thread.sleep(2000);
			    JavascriptExecutor js =(JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0,2000)");
				Thread.sleep(2000);
				Select nation=new Select(driver.findElement(By.xpath("//select[@id='nationality']")));
				nation.selectByIndex(1);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='mobileno']")).sendKeys("9490211416");
				driver.findElement(By.xpath("//input[@id='mobileno_confirm']")).sendKeys("9490211416");
				driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shabanainthu@gmail.com");
				driver.findElement(By.xpath("//input[@id='confirmEmail']")).sendKeys("shabanainthu@gmail.com");
				driver.findElement(By.xpath("//input[@id='DesiredPassword']")).sendKeys("Bismill@h9");
				driver.findElement(By.xpath("//tbody/tr[25]/td[2]/div[2]/img[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("bismill@h9");
				driver.findElement(By.xpath("//input[@id='phrase']")).click();
				Alert a4 =driver.switchTo().alert();
				System.out.println(a4.getText());
				Thread.sleep(2000);
				a4.accept();
				driver.findElement(By.xpath("//input[@id='phrase']")).sendKeys("6584616");
				driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/input[2]")).click();
				Alert a5 =driver.switchTo().alert();
				System.out.println(a5.getText());
				Thread.sleep(2000);
				a5.accept();
				driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/input[1]")).click();
				driver.navigate().back();
				/*d.switchTo().window(tab8.get(0));
				Thread.sleep(2000);
				d.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[3]/a[1]")).click();
				System.out.println("Title of Page : " + d.getTitle());
		    	Thread.sleep(2000);
		    	Set<String> windows9=d.getWindowHandles();
		    	ArrayList<String> tab9=new ArrayList(windows9);
		    	d.switchTo().window(tab9.get(4));
		    	Thread.sleep(2000);*/
		    
				//ORA Page -Already Registration-Forgot Registration Id page******************
				
				
				driver.findElement(By.xpath("//a[contains(text(),'Forgot Registration ID')]")).click();
				System.out.println("Title of Page : " + driver.getTitle());
				driver.findElement(By.xpath("//input[@id='email2']")).sendKeys("jhsuyg");
				WebElement date=driver.findElement(By.xpath("//tbody/tr[2]/td[2]/select[1]"));
				WebElement month=driver.findElement(By.xpath("//tbody/tr[2]/td[2]/select[2]"));
				WebElement year=driver.findElement(By.xpath("//tbody/tr[2]/td[2]/select[3]"));
				Select dat=new Select(date);
				dat.selectByIndex(2);
				Alert a1 =driver.switchTo().alert();
				System.out.println(a1.getText());
				Thread.sleep(2000);
				a1.accept();
				driver.navigate().back();
				driver.navigate().back();
				driver.navigate().back();
				driver.navigate().back();
				Set<String> windows9=driver.getWindowHandles();
		    	ArrayList<String> tab9=new ArrayList(windows9);
		    	driver.switchTo().window(tab9.get(1));
		    	driver.close();
		    	driver.switchTo().window(tab9.get(2));
		    	driver.close();
		    	driver.switchTo().window(tab9.get(3));
		    	driver.close();
		    	
		    	driver.switchTo().window(tab9.get(0));
		    	Thread.sleep(2000);
		    	//*******************************Recruitment ****************************
		    	a.moveToElement(driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"))).perform();
		    	
		    	
		    	//*************Status of Recruitment Cases (Advertisement-wise) Tab in Recruitment drop down***************
		    	driver.findElement(By.xpath(" //a[contains(text(),'Status of Recruitment Cases (Advertisement-wise)')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	//********************Status of Recruitment Cases (Advertisement-wise) Tab-Applicant's List***********
		    	driver.findElement(By.xpath("//a[contains(text(),\"Applicant's List\")]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//input[@id='edit-field-advertisement-number-value']")).sendKeys("05 - 2020");
		    	driver.findElement(By.xpath("//input[@id='edit-field-vacancy-number-value']")).sendKeys("20030510414");
		    	driver.findElement(By.xpath("//input[@id='edit-field-name-of-post-vaccancy-value']")).sendKeys("02 Posts of Assistant Employment Officer in NCSC");
		    	driver.findElement(By.xpath("//button[@id='edit-submit-recruitment']")).click();
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/ul[1]/li[1]/a[1]")).click();
		    	Thread.sleep(2000);
		    	driver.switchTo().window(tab9.get(0));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//button[@id='edit-reset']")).click();
		    	Thread.sleep(2000);
		    	//*******************Status of Recruitment Cases (Advertisement-wise) Tab-Notices****************
		    	driver.findElement(By.xpath("//a[contains(text(),'Notices')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	driver.findElement(By.xpath("//input[@id='edit-field-advertisement-number-value']")).sendKeys("10 - 2020");
		    	driver.findElement(By.xpath("//input[@id='edit-field-vacancy-number-value']")).sendKeys("20091001112");
		    	driver.findElement(By.xpath("//input[@id='edit-field-name-of-post-vaccancy-value']")).sendKeys("03 Posts of Livestock Officer in Department of Animal Husbandry and Dairying");
		    	driver.findElement(By.xpath("//button[@id='edit-submit-recruitment']")).click();
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/ul[1]/li[1]/a[1]")).click();
		    	driver.switchTo().window(tab9.get(0));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//button[@id='edit-reset']")).click();
		    	Thread.sleep(2000);
		    	
		    	//********************Status of Recruitment Cases (Advertisement-wise) Tab-Corrigendum**********
		    	driver.findElement(By.xpath("//a[contains(text(),'Corrigendum')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	driver.findElement(By.xpath("//input[@id='edit-field-advertisement-number-value']")).sendKeys("10 - 2020");
		    	driver.findElement(By.xpath("//input[@id='edit-field-vacancy-number-value']")).sendKeys("20091001112");
		    	driver.findElement(By.xpath("//input[@id='edit-field-name-of-post-vaccancy-value']")).sendKeys("03 Posts of Livestock Officer in Department of Animal Husbandry and Dairying");
		    	driver.findElement(By.xpath("//button[@id='edit-submit-recruitment']")).click();
		    	driver.findElement(By.xpath("//button[@id='edit-reset']")).click();
		    	driver.findElement(By.xpath("//a[contains(text(),'Scrutiny')]")).click();
		    	driver.findElement(By.xpath("//input[@id='edit-field-advertisement-number-value']")).sendKeys("12 - 2019");
		    	driver.findElement(By.xpath("//input[@id='edit-field-vacancy-number-value']")).sendKeys("19091203128");
		    	driver.findElement(By.xpath("//input[@id='edit-field-name-of-post-vaccancy-value']")).sendKeys("01 Post of Drug Inspector (Unani) in the Directorate of AYUSH, GNCTD");
		    	driver.findElement(By.xpath("//button[@id='edit-submit-recruitment']")).click();
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/ul[1]/li[1]/a[1]")).click();
		    	Thread.sleep(2000);
		    	driver.switchTo().window(tab9.get(0));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//button[@id='edit-reset']")).click();
		    	Thread.sleep(2000);
		    	//******************Status of Recruitment Cases (Advertisement-wise) Tab-Interview Schedules**********
		    	driver.findElement(By.xpath("//a[contains(text(),'Interview Schedules')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	driver.findElement(By.xpath("//input[@id='edit-field-advertisement-number-value']")).sendKeys("03 - 2020");
		    	driver.findElement(By.xpath("//input[@id='edit-field-vacancy-number-value']")).sendKeys("20020308508");
		    	driver.findElement(By.xpath("//input[@id='edit-field-name-of-post-vaccancy-value']")).sendKeys("05 posts of System Analyst in Union Public Service Commission");
		    	driver.findElement(By.xpath("//button[@id='edit-submit-recruitment']")).click();
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/ul[1]/li[1]/a[1]")).click();
		    	Thread.sleep(2000);
		    	driver.switchTo().window(tab9.get(0));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//button[@id='edit-reset']")).click();
		    	Thread.sleep(2000);
		    	

		    	//******************Status of Recruitment Cases (Advertisement-wise) Tab-Results*******************
		    	driver.findElement(By.xpath("//a[contains(text(),'Results')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	driver.findElement(By.xpath("//a[contains(text(),'Final Results')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	driver.findElement(By.xpath("//input[@id='edit-field-advertisement-number-value']")).sendKeys("03 - 2020");
		    	driver.findElement(By.xpath("//input[@id='edit-field-vacancy-number-value']")).sendKeys("20020303208");
		    	driver.findElement(By.xpath("//input[@id='edit-field-name-of-post-vaccancy-value']")).sendKeys("01 Post of Scientist 'B' (Chemistry), Ministry of Jal Shakti");
		    	driver.findElement(By.xpath("//button[@id='edit-submit-recruitment']")).click();
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/ul[1]/li[1]/a[1]")).click();
		    	Thread.sleep(2000);
		    	driver.switchTo().window(tab9.get(0));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//button[@id='edit-reset']")).click();
		    	Thread.sleep(2000);
		    	Set<String> windows10=driver.getWindowHandles();
		    	ArrayList <String> tab10=new ArrayList(windows10);
		    	driver.switchTo().window(tab10.get(5));
		    	driver.close();
		    	driver.switchTo().window(tab10.get(4));
		    	driver.close();
		    	driver.switchTo().window(tab10.get(3));
		    	driver.close();
		    	driver.switchTo().window(tab10.get(2));
		    	driver.close();
		    	driver.switchTo().window(tab10.get(1));
		    	driver.close();
		    	driver.switchTo().window(tab10.get(0));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/a[3]")).click();
		    	Thread.sleep(2000);
		    	//***************************Marks Information**********************
		    	driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[7]/a[1]")).click();
                System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	Set<String> windows11=driver.getWindowHandles();
		    	ArrayList <String> tab11=new ArrayList(windows11);
		    	driver.switchTo().window(tab11.get(1));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[5]/a[1]/strong[1]")).click();
		    	 System.out.println("Title of page: "+driver.getTitle());
		    	driver.findElement(By.xpath("//input[@id='candidate_rollno']")).sendKeys("1234");
		    	driver.findElement(By.xpath("//img[@id='dobim']")).click();
		    	Select date1=new Select(driver.findElement(By.xpath("//tbody/tr[1]/td[1]/select[1]")));
		    	date1.selectByIndex(3);
		    	Select year1=new Select(driver.findElement(By.xpath("//tbody/tr[1]/td[2]/select[1]")));
		    	year1.selectByVisibleText("2020");
		    	driver.findElement(By.xpath("//td[contains(text(),'25')]")).click();
		    	driver.findElement(By.xpath("//input[@id='letters_code']")).click();
		    	Alert a2=driver.switchTo().alert();
		    	System.out.println(a2.getText());
		    	Thread.sleep(2000);
		    	a2.accept();
		    	driver.close();
		    	driver.switchTo().window(tab11.get(0));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/a[2]")).click();
		    	//*******************************Recruitment ****************************
		    	a.moveToElement(driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"))).perform();
		    	
		    	//*************Forms for Certificates Tab in Recruitment drop down*********************
		    	
		    	driver.findElement(By.xpath("//a[contains(text(),'Forms for Certificates')]")).click();
		    	 System.out.println("Title of page: "+driver.getTitle());
		    	//*******************************Recruitment ****************************
			    	a.moveToElement(driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"))).perform();
			    	
		    	//*************Recruitment Tests Tab in Recruitment drop down*********************
		    	 
		    	driver.findElement(By.xpath("//a[contains(text(),'Recruitment Tests')]")).click();
		    	 System.out.println("Title of page: "+driver.getTitle());
		    	 
		    	 //*******************Recruitment Tests Tab-Schedule for Recruitment Tests & Interviews***************
		    	 
		    	driver.findElement(By.xpath("//a[contains(text(),'Schedule for Recruitment Tests & Interviews')]")).click();
		    	 
		    	Thread.sleep(2000);
		    	Set<String> windows12=driver.getWindowHandles();
		    	ArrayList <String> tab12=new ArrayList(windows12);
		    	driver.switchTo().window(tab12.get(1));
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//input[@id='edit-field-advertisement-number-value']")).sendKeys("03 - 2020");
		    	driver.findElement(By.xpath("//input[@id='edit-field-vacancy-number-value']")).sendKeys("20020308508");
		    	driver.findElement(By.xpath("//input[@id='edit-field-name-of-post-vaccancy-value']")).sendKeys("01 Post of Scientist 'B' (Chemistry), Ministry of Jal Shakti");
		    	driver.findElement(By.xpath("//button[@id='edit-submit-recruitment']")).click();
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//button[@id='edit-reset']")).click();
		    	Thread.sleep(2000);
		    	driver.close();
		    	driver.switchTo().window(tab12.get(0));
		    	Thread.sleep(2000);
		    	 //*******************Recruitment Tests Tab-Notice***************
		    	 
		    	driver.findElement(By.xpath("//a[contains(text(),'Notice')]")).click();
		    	 
		    	Set<String> windows13=driver.getWindowHandles();
		    	ArrayList <String> tab13=new ArrayList(windows13);
		    	driver.switchTo().window(tab13.get(1));
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//input[@id='edit-field-advertisement-number-value']")).sendKeys("51 - 2020");
		    	driver.findElement(By.xpath("//input[@id='edit-field-vacancy-number-value']")).sendKeys("20015101411");
		    	driver.findElement(By.xpath("//input[@id='edit-field-name-of-post-vaccancy-value']")).sendKeys("421 Posts of Enforcement Officer - Accounts Officer, EPFO");
		    	driver.findElement(By.xpath("//button[@id='edit-submit-recruitment']")).click();
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/ul[1]/li[1]/a[1]")).click();	
		    	Thread.sleep(2000);
		    	driver.switchTo().window(tab13.get(1));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//button[@id='edit-reset']")).click();
		    	Thread.sleep(2000);
		    	driver.close();
		    	driver.switchTo().window(tab13.get(0));
		    	Thread.sleep(2000);
		    	//*******************Recruitment Tests Tab-e-admit card***************
		    	
		    	driver.findElement(By.xpath("//a[contains(text(),'e-admit Card')]")).click();//one new window open
		    	 System.out.println("Title of page: "+driver.getTitle());
		    		Thread.sleep(2000);
		    	driver.switchTo().window(tab13.get(0));
		    	//*******************Recruitment Tests Tab-Demo Files for all Cbrt's***************
		    	driver.findElement(By.xpath("//a[contains(text(),'Demo Files for all CBRTs')]")).click();//one new window open
		    	Thread.sleep(2000);
		   	 System.out.println("Title of page: "+driver.getTitle());
		    	driver.switchTo().window(tab13.get(0));
		    	Thread.sleep(2000);
		    	
		    	//*******************Recruitment Tests Tab-Results***************
		    	driver.findElement(By.xpath("//a[contains(text(),'Results')]")).click();
		   	 System.out.println("Title of page: "+driver.getTitle());
		    	Set<String> windows14=driver.getWindowHandles();
		    	ArrayList <String> tab14=new ArrayList(windows14);
		    	driver.switchTo().window(tab14.get(1));
		    	driver.close();
		    	driver.switchTo().window(tab14.get(3));
		    	driver.close();
		    	driver.switchTo().window(tab14.get(2));
		    	driver.close();
		    	Set<String> windows15=driver.getWindowHandles();
		    	ArrayList <String> tab15=new ArrayList(windows15);
		    	driver.switchTo().window(tab15.get(1));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//a[contains(text(),'Written Results')]")).click();
		   	 System.out.println("Title of page: "+driver.getTitle());
		    	Set<String> windows16=driver.getWindowHandles();
		    	ArrayList <String> tab16=new ArrayList(windows16);
		    	driver.switchTo().window(tab16.get(2));
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//a[contains(text(),'View Archives >>')]")).click();
		    	driver.findElement(By.xpath("//input[@id='edit-field-advertisement-number-value']")).sendKeys("09 - 2020");
		    	driver.findElement(By.xpath("//input[@id='edit-field-vacancy-number-value']")).sendKeys("20080904122	");
		    	driver.findElement(By.xpath("//input[@id='edit-field-name-of-post-vaccancy-value']")).sendKeys("07 Posts of General Duty Medical Officer (Homoeopathy), GNCTD");
		    	driver.findElement(By.xpath("//button[@id='edit-submit-recruitment']")).click();
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/ul[1]/li[1]/a[1]")).click();
		    	Thread.sleep(2000);
		    	driver.switchTo().window(tab16.get(2));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//button[@id='edit-reset']")).click();
		    	driver.close();
		    	driver.switchTo().window(tab16.get(1));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//a[contains(text(),'Final Results')]")).click();
		   	 System.out.println("Title of page: "+driver.getTitle());
		    	Set<String> windows17=driver.getWindowHandles();
		    	ArrayList <String> tab17=new ArrayList(windows17);
		    	driver.switchTo().window(tab17.get(2));
		    	driver.close();
		    	driver.switchTo().window(tab17.get(3));
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//a[contains(text(),'View Archives >>')]")).click();
		    	driver.findElement(By.xpath("//input[@id='edit-field-advertisement-number-value']")).sendKeys("19 - 2018");
		    	driver.findElement(By.xpath("//input[@id='edit-field-vacancy-number-value']")).sendKeys("18101903613	");
		    	driver.findElement(By.xpath("//input[@id='edit-field-name-of-post-vaccancy-value']")).sendKeys("07 Posts of Deputy Architect in Military Engineer Service, MOD");
		    	driver.findElement(By.xpath("//button[@id='edit-submit-recruitment']")).click();
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/ul[1]/li[1]/a[1]")).click();
		    	Thread.sleep(2000);
		    	driver.switchTo().window(tab17.get(3));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//button[@id='edit-reset']")).click();
		    	driver.close();
		    	driver.switchTo().window(tab17.get(1));
		    	driver.close();
		    	driver.switchTo().window(tab17.get(0));
		    	Thread.sleep(2000);
		    	
		    	//*************************Recruitment test Tab-cut-off Marks***************************
		    	
		    	driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[6]/li[1]/a[1]")).click();
		   	 System.out.println("Title of page: "+driver.getTitle());
		    	Set<String> windows18=driver.getWindowHandles();
		    	ArrayList <String> tab18=new ArrayList(windows18);
		    	driver.switchTo().window(tab18.get(1));
		    	driver.close();
		    	Thread.sleep(2000);
		    	driver.switchTo().window(tab18.get(2));
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//a[contains(text(),'View Archives >>')]")).click();
		    	driver.findElement(By.xpath("//input[@id='edit-field-advertisement-number-value']")).sendKeys("03 - 2019");
		    	driver.findElement(By.xpath("//input[@id='edit-field-vacancy-number-value']")).sendKeys("19040302213	");
		    	driver.findElement(By.xpath("//input[@id='edit-field-name-of-post-vaccancy-value']")).sendKeys("50 Posts of Assistant Hydrogeologist in Central Ground Water Board");
		    	driver.findElement(By.xpath("//button[@id='edit-submit-recruitment']")).click();
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/ul[1]/li[1]/a[1]")).click();
		    	Thread.sleep(2000);
		    	driver.switchTo().window(tab18.get(2));
		    	Thread.sleep(2000);
		    	
		    	driver.findElement(By.xpath("//button[@id='edit-reset']")).click();
		    	Thread.sleep(2000);
		    	driver.close();
		    	driver.switchTo().window(tab18.get(0));
		    	Thread.sleep(2000);
		    	//*************************Recruitment test Tab-Result Details***************************
		    	driver.findElement(By.xpath("//a[contains(text(),'Result Details')]")).click();
		   	 System.out.println("Title of page: "+driver.getTitle());
		    	Set<String> windows19=driver.getWindowHandles();
		    	ArrayList <String> tab19=new ArrayList(windows19);
		    	driver.switchTo().window(tab19.get(1));
		    	driver.close();
		    	driver.switchTo().window(tab19.get(2));
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//a[contains(text(),'View Archives >>')]")).click();
		    	driver.findElement(By.xpath("//input[@id='edit-field-advertisement-number-value']")).sendKeys("14 - 2018");
		    	driver.findElement(By.xpath("//input[@id='edit-field-vacancy-number-value']")).sendKeys("18071401428	");
		    	driver.findElement(By.xpath("//input[@id='edit-field-name-of-post-vaccancy-value']")).sendKeys("01 Post of Administrative Officer in Central Sheep Breeding Farm");
		    	driver.findElement(By.xpath("//button[@id='edit-submit-recruitment']")).click();
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/ul[1]/li[1]/a[1]")).click();
		    	Thread.sleep(2000);
		    	driver.switchTo().window(tab19.get(2));
		    	Thread.sleep(2000);
		    	
		    	driver.findElement(By.xpath("//button[@id='edit-reset']")).click();
		    	Thread.sleep(2000);
		    	driver.close();
		    	driver.switchTo().window(tab19.get(0));
		    	Thread.sleep(2000);
		    	
		    	//*************************Recruitment test Tab-Answer keys***************************
		    	driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[8]/li[1]/a[1]")).click();
		   	 System.out.println("Title of page: "+driver.getTitle());
		    	Set<String> windows20=driver.getWindowHandles();
		    	ArrayList <String> tab20=new ArrayList(windows20);
		    	driver.switchTo().window(tab20.get(1));
		    	driver.close();
		    	driver.switchTo().window(tab20.get(2));
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//a[contains(text(),'View Archives >>')]")).click();
		    	driver.findElement(By.xpath("//input[@id='edit-field-advertisement-number-value']")).sendKeys("19 - 2018");
		    	driver.findElement(By.xpath("//input[@id='edit-field-vacancy-number-value']")).sendKeys("18101903613	");
		    	driver.findElement(By.xpath("//input[@id='edit-field-name-of-post-vaccancy-value']")).sendKeys("07 Posts of Deputy Architect in Military Engineer Service, MOD");
		    	driver.findElement(By.xpath("//button[@id='edit-submit-recruitment']")).click();
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/ul[1]/li[1]/a[1]")).click();
		    	Thread.sleep(2000);
		    	driver.switchTo().window(tab20.get(2));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//button[@id='edit-reset']")).click();
		    	Thread.sleep(2000);
		    	driver.close();
		    	driver.switchTo().window(tab20.get(0));
		    	Thread.sleep(2000);
		    	//*************************Recruitment test Tab-Marks Information***************************
		    	
		    	driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[9]/li[1]/a[1]")).click();
		   	 System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	Set<String> windows21=driver.getWindowHandles();
		    	ArrayList <String> tab21=new ArrayList(windows21);
		    	driver.switchTo().window(tab21.get(1));
		    	driver.close();
		    	driver.switchTo().window(tab21.get(2));
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//tbody/tr[4]/td[2]/h1[1]/p[1]/a[1]")).click();
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//font[contains(text(),'Click Here')]")).click();
		    	Thread.sleep(2000);
		    	
		    	driver.findElement(By.xpath("//input[@id='candidate_rollno']")).sendKeys("65989");
		    	driver.findElement(By.xpath("//input[@id='dob']")).click();
		    	Select date4=new Select(driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")));
		    	date4.selectByIndex(1);
		    	Select year4=new Select(driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[2]")));
		    	year4.selectByValue("1994");
		    	driver.findElement(By.xpath("//a[contains(text(),'24')]")).click();
		    	driver.findElement(By.xpath("//input[@id='letters_code']")).sendKeys("hbygy");
		    	driver.findElement(By.xpath("//tbody/tr[5]/td[1]/input[4]")).click();
		    	Alert a3=driver.switchTo().alert();
		    	System.out.println(a3.getText());
		    	Thread.sleep(2000);
		    	a3.accept();
		    	
		    	driver.close();
		    	
		    	driver.switchTo().window(tab21.get(0));
		    	Thread.sleep(2000);
		    	
		    	//*************************Recruitment test Tab-Question Papers***************************
		    	
		    	driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[10]/li[1]/a[1]")).click();
		   	 System.out.println("Title of page: "+driver.getTitle());
		    	Set<String> windows22=driver.getWindowHandles();
		    	ArrayList <String> tab22=new ArrayList(windows22);
		    	driver.switchTo().window(tab22.get(1));
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	
		    	driver.findElement(By.xpath("//input[@id='edit-field-advertisement-number-value']")).sendKeys("02 - 2020");
		    	driver.findElement(By.xpath("//input[@id='edit-field-vacancy-number-value']")).sendKeys("20010201125");
		    	driver.findElement(By.xpath("//input[@id='edit-field-name-of-post-vaccancy-value']")).sendKeys("37 Posts of Medical Officer - Research Officer (Ayurveda) in Ministry of AYUSH");
		    	driver.findElement(By.xpath("//button[@id='edit-submit-recruitment']")).click();
		    	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/ul[1]/li[1]/a[1]")).click();
		    	Thread.sleep(2000);
		    	driver.switchTo().window(tab22.get(1));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//button[@id='edit-reset']")).click();
		    	Thread.sleep(2000);
		    	driver.close();
		    	driver.switchTo().window(tab22.get(0));
		    	Thread.sleep(2000);

		    	//*******************************Recruitment ****************************
		    	a.moveToElement(driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"))).perform();
		    	
		    	
		    	//*************************Recruitment Requisition Tab from Recruitment Drop Down***************************
		    	
		    	driver.findElement(By.xpath("//a[contains(text(),'Recruitment Requisition')]")).click();
		   	 System.out.println("Title of page: "+driver.getTitle());
		    	Set<String> windows24=driver.getWindowHandles();
		    	ArrayList <String> tab24=new ArrayList(windows24);
		    	driver.switchTo().window(tab24.get(1));
		    	driver.close();
		    	driver.switchTo().window(tab24.get(0));
		    	Thread.sleep(2000);

		    	//*******************************Recruitment ****************************
		    	a.moveToElement(driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"))).perform();
		    	
		    	//************Recruitment cases kept on hold on account of Pending Litigations Tab from Recruitment Drop Down***************************
		    	
		    	driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[8]/a[1]")).click();
		   	 System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);

		    	//*******************************Recruitment ****************************
		    	a.moveToElement(driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"))).perform();
		    	
		    	//*************************Representation on Question Papers Tab from Recruitment Drop Down***************************
		    	
		    	driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[9]/a[1]")).click();
		   	 System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000); 
		    	driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		    	System.out.println("Title of Page : " + driver.getTitle());
		    	
		    	
		    }

		public void Recuritrules() throws InterruptedException {
			
           
			Actions a =new Actions(driver);
			
			a.moveToElement(driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]"))).perform();
			//*************************Central Government******************
			
			driver.findElement(By.xpath("//a[contains(text(),'Central Government')]")).click();
			//In central Government check recruitment rules
			System.out.println("Title of Page : " + driver.getTitle());
			driver.findElement(By.xpath("//a[contains(text(),'Recruitment Rules')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			//To handle the recruitment rules page
			Set <String> windows=driver.getWindowHandles();
			Iterator <String> it =windows.iterator();
			String parent_window=it.next();
			String child_window= it.next();
			driver.switchTo().window(child_window);
			Thread.sleep(2000);
		
			// To check the Pdf link in recruitment rules- Forms and downloads  page //New window will open for pdf link
			
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[3]/span[1]/ul[1]/li[1]/a[1]")).click();
			Thread.sleep(2000);
			//To switch back to Recruitment page
			driver.switchTo().window(child_window);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[3]/span[1]/ul[1]/ul[1]/li[1]/a[1]")).click();
			Thread.sleep(2000);
			driver.switchTo().window(child_window);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[3]/span[1]/ul[1]/ul[1]/ul[1]/li[1]/a[1]")).click();
			Thread.sleep(2000);
			driver.switchTo().window(child_window);
			Thread.sleep(2000);
			
			//****************To Check Introduction in Recuritment rules page*****************
			
			driver.findElement(By.xpath("//a[contains(text(),'Introduction')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			
			JavascriptExecutor js =(JavascriptExecutor) driver;
			
			//**********To Check Personnel in Recuritment rules page************
			
			driver.findElement(By.xpath("//a[contains(text(),'Personnel')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			
			//To Check Personnel pdf link  in Recuritment rules page
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/h1[1]/a[1]")).click();
			Thread.sleep(2000);
			//To switch back to Recruitment page
			driver.switchTo().window(child_window);
			Thread.sleep(2000);
			//****************To Check Functions in Recuritment rules page************
			
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[3]/a[1]")).click();
			Thread.sleep(2000);
			System.out.println("Title of Page : " + driver.getTitle());
			//To Check Functions pdf link  in Recuritment rules page
			
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/h1[1]/a[1]")).click();
			Thread.sleep(2000);
			//To switch back to Recruitment page
			
			driver.switchTo().window(child_window);
			Thread.sleep(2000);
			
			// To scroll down the Recuritment rules page
			
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			
			//*****To check Instructions and Guidelines in Recuritment rules page*******
			
			driver.findElement(By.xpath("//a[contains(text(),'Instructions and Guidelines')]")).click();
			Thread.sleep(2000);
			System.out.println("Title of Page : " + driver.getTitle());
			
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/h1[1]/a[1]")).click();
			Thread.sleep(2000);
			driver.switchTo().window(child_window);
			Thread.sleep(2000);
			//***************To check FAQ's in Recuritment page************
			
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[6]/a[1]")).click();
			Thread.sleep(2000);
			System.out.println("Title of Page : " + driver.getTitle());
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/ul[1]/li[1]/a[1]")).click();
			Thread.sleep(2000);
			driver.switchTo().window(child_window);
			Thread.sleep(2000);
			//************* To check the Important Court JUdgements in the recruitment page****************
			driver.findElement(By.xpath("//a[contains(text(),'Important Court Judgements')]")).click();
			Thread.sleep(2000);
			System.out.println("Title of Page : " + driver.getTitle());
			driver.switchTo().window(child_window);
			Thread.sleep(2000);
			driver.close();
			Set <String> windows1=driver.getWindowHandles();
			ArrayList <String> tabs =new ArrayList(windows1);
			driver.switchTo().window(tabs.get(8));
			Thread.sleep(2000);
			
			//**************Important court and judgements login page***********
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shabana");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shaba56a");
			driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
			System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Note :- Only for authorized Government users')]")).getText());
			driver.findElement(By.xpath("//a[contains(text(),'Clicking Here')]")).click();
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("shabana");
			driver.findElement(By.xpath("//input[@id='designation']")).sendKeys("officer");
			driver.findElement(By.xpath("//input[@id='emailid']")).sendKeys("shabanainthu59@gmail.com");
			driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys("1326465");
			driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).click();
			System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Invalid Captcha')]")).getText());
			driver.findElement(By.xpath("//font[contains(text(),'Login Page')]")).click();
			driver.close();
			driver.switchTo().window(tabs.get(1));
			driver.close();
			driver.switchTo().window(tabs.get(2));
			driver.close();
			driver.switchTo().window(tabs.get(3));
			driver.close();
			driver.switchTo().window(tabs.get(4));
			driver.close();
			driver.switchTo().window(tabs.get(5));
			driver.close();
			driver.switchTo().window(tabs.get(6));
			driver.close();
			driver.switchTo().window(tabs.get(7));
			driver.close();
	
			driver.switchTo().window(tabs.get(0));
			Thread.sleep(2000);
			}

		public void Appointments() throws InterruptedException {
			
			//******************Appointments in Central goverment*********************
			
			driver.findElement(By.xpath("//a[contains(text(),'Appointments')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Set <String> windows2=driver.getWindowHandles();
			ArrayList <String> tabs1 =new ArrayList(windows2);
			driver.switchTo().window(tabs1.get(1));
			Thread.sleep(2000);
			//********************Central Government-Functions Page Appointment by promotion***************
			
			driver.findElement(By.xpath("//a[contains(text(),'Appointment by Promotion')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			Set <String> windows3=driver.getWindowHandles();
			ArrayList <String> tab3 =new ArrayList(windows3);
			driver.switchTo().window(tab3.get(2));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Salient aspects of DPC proposals')]")).click();
			
			Thread.sleep(2000);
			driver.switchTo().window(tab3.get(2));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Procedure for receipt of DPC proposals in UPSC')]")).click();
			
			Thread.sleep(2000);
			driver.switchTo().window(tab3.get(2));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Forwarding of DPC proposal: Guidance for Ministrie')]")).click();
			
			Thread.sleep(2000);
			driver.switchTo().window(tab3.get(2));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Samples of deficiency letters in respect of DPC pr')]")).click();
			
			Thread.sleep(2000);
			driver.switchTo().window(tab3.get(2));
			Thread.sleep(2000);
			driver.close();
			Set <String> windows4=driver.getWindowHandles();
			ArrayList <String> tab4 =new ArrayList(windows4);
			driver.switchTo().window(tab4.get(2));
			driver.close();
			driver.switchTo().window(tab4.get(3));
			driver.close();
			driver.switchTo().window(tab4.get(4));
			driver.close();
			driver.switchTo().window(tab4.get(5));
			driver.close();
			driver.switchTo().window(tab4.get(1));
			Thread.sleep(2000);
			
			//***********************Functions page- Appointment by deputation/absorption*********************
			
			driver.findElement(By.xpath("//a[contains(text(),'Appointment by Deputation/Absorption')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			Set <String> windows5=driver.getWindowHandles();
			ArrayList <String> tab5 =new ArrayList(windows5);
			driver.switchTo().window(tab5.get(2));
			Thread.sleep(2000);
			JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//a[contains(text(),'Procedure for receipt of Deputation proposals in U')]")).click();
			
			Thread.sleep(2000);
			driver.switchTo().window(tab5.get(2));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Salient aspects of Deputation proposals')]")).click();
			
			Thread.sleep(2000);
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(2000);	
			driver.switchTo().window(tab5.get(2));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Forwarding of Deputation proposal: Guidance for Mi')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			driver.switchTo().window(tab5.get(2));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Samples of deficiency letters in respect of Deputa')]")).click();
			
			Thread.sleep(2000);
			Set <String> windows6=driver.getWindowHandles();
			ArrayList <String> tab6 =new ArrayList(windows6);
			driver.switchTo().window(tab6.get(6));
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Illustrative cases of common deficiencies found du')]")).click();
			
			Thread.sleep(2000);
			driver.switchTo().window(tab6.get(2));
			driver.close();
			driver.switchTo().window(tab6.get(3));
			driver.close();
			driver.switchTo().window(tab6.get(4));
			driver.close();
			driver.switchTo().window(tab6.get(5));
			driver.close();
			driver.switchTo().window(tab6.get(6));
			driver.close();
			driver.switchTo().window(tab6.get(1));
			Thread.sleep(2000);
			
			//*******************Central Government-Appointment page -Introduction tab***************
			
			driver.findElement(By.xpath("//a[contains(text(),'Introduction')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			
			//*******************Central Government-Appointment page -Personnel tab***************
			
			driver.findElement(By.xpath("//a[contains(text(),'Personnel')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			//*******************Central Government-Appointment page -Instructions and Guidelines tab***************
			
			driver.findElement(By.xpath("//a[contains(text(),'Instructions and Guidelines')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Promotions')]"	)).click();
			Thread.sleep(2000);
			driver.switchTo().window(tab6.get(1));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Deputation')]")).click();
			Thread.sleep(2000);
			driver.switchTo().window(tab6.get(1));
			Thread.sleep(2000);
			
			//*******************Central Government-Appointment page -Forms and downloads tab***************
			
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[5]/a[1]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Checklist for submission of DPC proposals under Si')]")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Checklist for submission of Deputation proposals u')]")).click();
			
			Thread.sleep(2000);
			Set <String> windows8=driver.getWindowHandles();
			ArrayList <String> tab8 =new ArrayList(windows8);
			driver.switchTo().window(tab8.get(4));
			driver.close();
			driver.switchTo().window(tab8.get(3));
			driver.close();
			driver.switchTo().window(tab8.get(2));
			driver.close();
			driver.switchTo().window(tab8.get(5));
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Checklist Deputation Single Window.pdf')]")).click();
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(tab8.get(6));
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Checklist for bringing DPC cases under Single Wind')]")).click();
			Thread.sleep(2000);
			driver.close();
			
			driver.switchTo().window(tab8.get(1));
			Thread.sleep(2000);
			//*******************Central Government-Appointment page -FAQ's tab***************
			
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[6]/a[1]")).click();
			Thread.sleep(2000);
			System.out.println("Title of Page : " + driver.getTitle());
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/h1[1]/a[1]")).click();
			Thread.sleep(2000);
			Set <String> windows9=driver.getWindowHandles();
			ArrayList <String> tab9 =new ArrayList(windows9);
			driver.switchTo().window(tab9.get(4));
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(tab9.get(3));
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(tab9.get(2));
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(tab9.get(1));
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(tab9.get(0));
			Thread.sleep(2000);

			driver.findElement(By.cssSelector("#block-views-basic-page-block > div > div > div > div.views-field.views-field-field-link > div > ul:nth-child(3) > li > a")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			System.out.println("Recruitment in central government is redirected to recruitment in home page");
			Set <String> windows10=driver.getWindowHandles();
			ArrayList <String> tab10 =new ArrayList(windows10);
			driver.switchTo().window(tab10.get(1));
			driver.close();
			driver.switchTo().window(tab10.get(0));
			Thread.sleep(2000);
			
			
		}
		
		public void services() throws InterruptedException {
			
			//****************************Central Government-Services page**********************
			
			
			driver.findElement(By.xpath("//a[contains(text(),'Services (for Disciplinary Proceedings)')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			Set <String> windows9=driver.getWindowHandles();
			ArrayList <String> tab9=new ArrayList(windows9);
			driver.switchTo().window(tab9.get(1));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Introduction')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Personnel')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[3]/a[1]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[5]/a[1]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			driver.switchTo().window(tab9.get(1));
			driver.close();
			driver.switchTo().window(tab9.get(0));
		}

		public void uniont() throws InterruptedException {

			Actions a =new Actions(driver);
			
			a.moveToElement(driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]"))).perform();
			
			
			//***************Union Territories Government****************************
			
			driver.findElement(By.xpath("//a[contains(text(),'Union Territories Government')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			
			//*******************Union Territories Government-Recruitment Rules******************************
			
			driver.findElement(By.xpath("//a[contains(text(),'Recruitment Rules')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Set <String> windows1=driver.getWindowHandles();
			ArrayList <String> tab1=new ArrayList(windows1);
			driver.switchTo().window(tab1.get(1));
			System.out.println("Title of Page : " + driver.getTitle());
			System.out.println("Recruitment rules in central government and union Territories Government are same");
			Thread.sleep(2000);
			driver.close();
			/*//*************Union Territories Government-Recruitment Rules page-Forms & downloads Tab***********
			
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[3]/span[1]/ul[1]/li[1]/a[1]")).click();
			
			driver.switchTo().window(tab1.get(1));
			Thread.sleep(2000);
			
			//*************Union Territories Government-Recruitment Rules page-Introduction Tab***********
			
			driver.findElement(By.xpath("//a[contains(text(),'Introduction')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			
			//*************Union Territories Government-Recruitment Rules page-Personnel Tab***********
			
			driver.findElement(By.xpath("//a[contains(text(),'Personnel')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[3]/a[1]")).click();
			Thread.sleep(2000);
			//*************Union Territories Government-Recruitment Rules page-Instructions and Guidelines Tab***********
			
			driver.findElement(By.xpath("//a[contains(text(),'Instructions and Guidelines')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[6]/a[1]")).click();
			Thread.sleep(2000);
			
			//*************Union Territories Government-Recruitment Rules page-Important Court Judgements Tab***********
			
			driver.findElement(By.xpath("//a[contains(text(),'Important Court Judgements')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			Set <String> windows2=driver.getWindowHandles();
			ArrayList <String> tab2=new ArrayList(windows2);
			driver.switchTo().window(tab2.get(2));
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(tab2.get(3));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("shabana");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shaba56a");
			driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
			System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Note :- Only for authorized Government users')]")).getText());
			driver.findElement(By.xpath("//a[contains(text(),'Clicking Here')]")).click();
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("shabana");
			driver.findElement(By.xpath("//input[@id='designation']")).sendKeys("officer");
			driver.findElement(By.xpath("//input[@id='emailid']")).sendKeys("shabanainthu59@gmail.com");
			driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys("1326465");
			driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).click();
			System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Invalid Captcha')]")).getText());
			driver.findElement(By.xpath("//font[contains(text(),'Login Page')]")).click();
			driver.close();
			driver.switchTo().window(tab2.get(1));
			Thread.sleep(2000);
			driver.close();*/
			driver.switchTo().window(tab1.get(0));
			Thread.sleep(2000);
			
			//*************Union Territories Government-Appointments page*************************
			
			driver.findElement(By.xpath("//a[contains(text(),'Appointments')]")).click();
		
			Thread.sleep(2000);
			Set <String> windows3=driver.getWindowHandles();
			ArrayList <String> tab3=new ArrayList(windows3);
			driver.switchTo().window(tab3.get(1));
			System.out.println("Title of Page : " + driver.getTitle());
			System.out.println("Appointments in Central government and Union Territories is same");
			driver.close();
			
			/*driver.findElement(By.xpath("//a[contains(text(),'Appointment by Promotion')]")).click();
			
			driver.switchTo().window(tab3.get(1));
		
			driver.findElement(By.xpath("//a[contains(text(),'Appointment by Deputation/Absorption')]")).click();
			
			driver.switchTo().window(tab3.get(1));
			Thread.sleep(2000);
			Set <String> windows4=driver.getWindowHandles();
			ArrayList <String> tab4=new ArrayList(windows4);
			driver.switchTo().window(tab4.get(2));
			System.out.println("Title of Page : " + driver.getTitle());
			
			//*****************Appointment by promotion page****************************
			
			driver.findElement(By.xpath("//a[contains(text(),'Procedure for receipt of DPC proposals in UPSC')]")).click();
		
			
			driver.switchTo().window(tab4.get(2));
			
			driver.findElement(By.xpath("//a[contains(text(),'Salient aspects of DPC proposals')]")).click();
			
		
			driver.switchTo().window(tab4.get(2));
		
			driver.findElement(By.xpath("//a[contains(text(),'Forwarding of DPC proposal: Guidance for Ministrie')]")).click();
			
		
			driver.switchTo().window(tab4.get(2));
		
			driver.findElement(By.xpath("//a[contains(text(),'Samples of deficiency letters in respect of DPC pr')]")).click();
			
			
			driver.switchTo().window(tab4.get(2));
		
			driver.close();
			driver.switchTo().window(tab4.get(3));
			System.out.println("Title of Page : " + driver.getTitle());
			
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			
			//********************Appointment by Deputation/Absorption page***********************
			
			
			driver.findElement(By.xpath("//a[contains(text(),'Procedure for receipt of Deputation proposals in U')]")).click();
			
			
			driver.switchTo().window(tab4.get(3));
			driver.findElement(By.xpath("//a[contains(text(),'Salient aspects of Deputation proposals')]")).click();
			
			
			driver.switchTo().window(tab4.get(3));
		
			driver.findElement(By.xpath("//a[contains(text(),'Forwarding of Deputation proposal: Guidance for Mi')]")).click();
			
			
			driver.switchTo().window(tab4.get(3));
		
			driver.findElement(By.xpath("//a[contains(text(),'Samples of deficiency letters in respect of Deputa')]")).click();
			
		
			driver.switchTo().window(tab4.get(3));
			
			driver.close();
			Set <String> windows5=driver.getWindowHandles();
			ArrayList <String> tab5=new ArrayList(windows5);
			driver.switchTo().window(tab5.get(9));
			
			driver.close();
			driver.switchTo().window(tab5.get(8));
			
			driver.close();
			driver.switchTo().window(tab5.get(7));
			
			driver.close();
			driver.switchTo().window(tab5.get(6));
			
			driver.close();
			driver.switchTo().window(tab5.get(5));
			
			driver.close();
			driver.switchTo().window(tab5.get(4));
			
			driver.close();
			driver.switchTo().window(tab5.get(3));
			
			driver.close();
			driver.switchTo().window(tab5.get(2));
			
			driver.close();
			driver.switchTo().window(tab5.get(1));
			
			
			//*************Union Territories Government-Appointments page-Introduction tab*************************
			
			
			driver.findElement(By.xpath("//a[contains(text(),'Introduction')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			
			//*************Union Territories Government-Appointments page-Personnel tab*************************
			
			driver.findElement(By.xpath("//a[contains(text(),'Personnel')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			
			//*************Union Territories Government-Appointments page-Instructions and Guidelines tab*************************
			
			driver.findElement(By.xpath("//a[contains(text(),'Instructions and Guidelines')]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			
			driver.findElement(By.xpath("//a[contains(text(),'Promotions')]")).click();
			
			driver.switchTo().window(tab5.get(1));
			
			driver.findElement(By.xpath("//a[contains(text(),'Deputation')]")).click();
			
			driver.switchTo().window(tab5.get(1));
			
			
			//************Union Territories Government-Appointments page-Forms and downloads tab***********************8
			
			
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[5]/a[1]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Checklist for submission of DPC proposals under Si')]")).click();
		
			driver.switchTo().window(tab5.get(1));
			
			driver.findElement(By.xpath("//a[contains(text(),'Checklist for submission of Deputation proposals u')]")).click();
			
			driver.switchTo().window(tab5.get(1));
			Thread.sleep(2000);
			Set <String> windows6=driver.getWindowHandles();
			ArrayList <String> tab6=new ArrayList(windows6);
			driver.switchTo().window(tab6.get(5));
			driver.close();
			driver.switchTo().window(tab6.get(4));
			driver.close();
			driver.switchTo().window(tab6.get(3));
			driver.close();
			driver.switchTo().window(tab6.get(2));
			driver.close();
			driver.switchTo().window(tab6.get(1));
			Thread.sleep(2000);
			
			//******************Union Territories Government-Appointments page-FAQ'S tab **************************
			
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[6]/a[1]")).click();
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			driver.close();*/
			driver.switchTo().window(tab3.get(0));
			Thread.sleep(2000);
			
			//******************Union Territories Government-Recruitment page-Recruitment Requisition Tab************************************
			
			driver.findElement(By.cssSelector("#block-views-basic-page-block > div > div > div > div.views-field.views-field-field-link > div > ul:nth-child(3) > li > a")).click();
			Set<String> windows4=driver.getWindowHandles();
			ArrayList <String> tab4=new ArrayList(windows4);
			driver.switchTo().window(tab4.get(1));
			System.out.println("Title of Page : " + driver.getTitle());
			System.out.println("Recuritment in Union territories govt is same as home page recuritment section ");
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(tab4.get(0));
			
			
			//All India Services
			driver.findElement(By.xpath("//a[contains(text(),'All India Services')]")).click();
			Thread.sleep(2000);
			Set<String> windows24=driver.getWindowHandles();
			ArrayList <String> tab24=new ArrayList(windows24);
			
			driver.switchTo().window(tab24.get(1));
			System.out.println("Title of Page : " + driver.getTitle());
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Check-list/Proforma for sending Proposals by the S')]")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(By.xpath("//a[contains(text(),'Introduction')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Personnel')]")).click();
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[3]/a[1]")).click();
			driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[5]/a[1]")).click();
			driver.close();
			driver.switchTo().window(tab24.get(0));
			
		}
		    public void  stategov() throws InterruptedException{
		    	Actions a =new Actions(driver);
				
				a.moveToElement(driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]"))).perform();
				
		    	driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/ul[1]/li[3]/a[1]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	driver.findElement(By.xpath("//a[contains(text(),'Services (for Disciplinary Proceedings)')]")).click();
		    	
		    	Set<String> windows1=driver.getWindowHandles();
		    	ArrayList <String> tab1=new ArrayList(windows1);
		    	driver.switchTo().window(tab1.get(1));
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//a[contains(text(),'Introduction')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	driver.findElement(By.xpath("//a[contains(text(),'Personnel')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[5]/a[1]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	driver.close();
		    	driver.switchTo().window(tab1.get(0));
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//a[contains(text(),'All India Services')]")).click();
		    	
		    	Set<String> windows2=driver.getWindowHandles();
		    	ArrayList <String> tab2=new ArrayList(windows2);
		    	driver.switchTo().window(tab2.get(1));
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//a[contains(text(),'Check-list/Proforma for sending Proposals by the S')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.close();
		    	driver.switchTo().window(tab2.get(0));
		    	driver.findElement(By.xpath("//a[contains(text(),'All India Services')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	Set<String> windows3=driver.getWindowHandles();
		    	ArrayList <String> tab3=new ArrayList(windows3);
		    	driver.switchTo().window(tab3.get(1));
		    	driver.findElement(By.xpath("//a[contains(text(),'Introduction')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	driver.findElement(By.xpath("//a[contains(text(),'Personnel')]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[5]/a[1]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	driver.close();
		    	driver.switchTo().window(tab3.get(0));
		    	
		    	
		    	
		    	
		    }
		    public void others() throws InterruptedException{
		    	Actions a =new Actions(driver);
				
				a.moveToElement(driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]"))).perform();
				
		    	
		    	driver.findElement(By.xpath("//header/section[@id='menu']/div[1]/nav[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/ul[1]/li[4]/a[1]")).click();
		    	System.out.println("Title of page: "+driver.getTitle());
		    	driver.findElement(By.xpath("//a[contains(text(),'Recruitment Rules')]")).click();
		    	
		    	Set <String> windows1=driver.getWindowHandles();
		    	ArrayList <String> tab1=new ArrayList(windows1);
		    	driver.switchTo().window(tab1.get(1));
		    	Thread.sleep(2000);
		    	System.out.println("Title of page: "+driver.getTitle());
		    	System.out.println("Recruitment Rules in others is same as Recruitment rules in Central and union Territories Government");
		        driver.close();
		        driver.switchTo().window(tab1.get(0));
		        Thread.sleep(2000);
		   /* 	d.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[3]/span[1]/ul[1]/li[1]/a[1]")).click();
		    	d.switchTo().window(tab1.get(1));
		   
		    	d.findElement(By.xpath("//a[contains(text(),'Introduction')]")).click();
		    	
		    	d.findElement(By.xpath("//a[contains(text(),'Personnel')]")).click();
		    	
		    	d.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		    	
		    	d.findElement(By.xpath("//a[contains(text(),'Instructions and Guidelines')]")).click();
		    	
		    	d.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[6]/a[1]")).click();
		    	
		    	d.findElement(By.xpath("//a[contains(text(),'Important Court Judgements')]")).click();
		    	Thread.sleep(2000);
		    	Set <String> windows2=d.getWindowHandles();
		    	ArrayList <String> tab2=new ArrayList(windows2);
		    	d.switchTo().window(tab2.get(2));
		    	Thread.sleep(2000);
		    	d.close();
		    	d.switchTo().window(tab2.get(3));
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//input[@id='username']")).sendKeys("shabana");
		    	d.findElement(By.xpath("//input[@id='password']")).sendKeys("shaba56a");
		    	d.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
		    	System.out.println(d.findElement(By.xpath("//div[contains(text(),'Note :- Only for authorized Government users')]")).getText());
		    	d.findElement(By.xpath("//a[contains(text(),'Clicking Here')]")).click();
		    	d.findElement(By.xpath("//input[@id='name']")).sendKeys("shabana");
		    	d.findElement(By.xpath("//input[@id='designation']")).sendKeys("officer");
		    	d.findElement(By.xpath("//input[@id='emailid']")).sendKeys("shabanainthu59@gmail.com");
		    	d.findElement(By.xpath("//input[@id='captcha']")).sendKeys("1326465");
		    	d.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).click();
		    	System.out.println(d.findElement(By.xpath("//span[contains(text(),'Invalid Captcha')]")).getText());
		    	d.findElement(By.xpath("//font[contains(text(),'Login Page')]")).click();
		    	d.close();
		    	d.switchTo().window(tab2.get(1));
		    	Thread.sleep(2000);
		    	d.close();
		    	d.switchTo().window(tab2.get(0));
		    	Thread.sleep(2000);*/
		    	driver.findElement(By.xpath("//a[contains(text(),'Appointments')]")).click();
		    	Thread.sleep(2000);
		    	
		    	Set <String> windows3=driver.getWindowHandles();
		    	ArrayList <String> tab3=new ArrayList(windows3);
		    	driver.switchTo().window(tab3.get(1));
		    	System.out.println("Title of page: "+driver.getTitle());
		    	System.out.println("Appointments in others is same as central gov and union territories gov");
		    	
		    	Thread.sleep(2000);
		    	driver.close();
		    	driver.switchTo().window(tab3.get(0));
		    	Thread.sleep(2000);
		    	/*d.findElement(By.xpath("//a[contains(text(),'Appointment by Promotion')]")).click();
		    	Thread.sleep(2000);
		    	d.switchTo().window(tab3.get(1));
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Appointment by Deputation/Absorption')]")).click();
		    	Thread.sleep(2000);
		    	d.switchTo().window(tab3.get(1));
		    	Thread.sleep(2000);
		    	Set <String> windows4=d.getWindowHandles();
		    	ArrayList <String> tab4=new ArrayList(windows4);
		    	d.switchTo().window(tab4.get(2));
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Procedure for receipt of DPC proposals in UPSC')]")).click();
		    	Thread.sleep(2000);
		    	d.switchTo().window(tab4.get(2));
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Salient aspects of DPC proposals')]")).click();
		    	Thread.sleep(2000);
		    	d.switchTo().window(tab4.get(2));
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Forwarding of DPC proposal: Guidance for Ministrie')]")).click();
		    	Thread.sleep(2000);
		    	d.switchTo().window(tab4.get(2));
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Samples of deficiency letters in respect of DPC pr')]")).click();
		    	Thread.sleep(2000);
		    	d.switchTo().window(tab4.get(2));
		    	Thread.sleep(2000);
		    	d.close();
		    	d.switchTo().window(tab4.get(3));
		    	Thread.sleep(2000);
		    	JavascriptExecutor js= (JavascriptExecutor) d;
		    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Procedure for receipt of Deputation proposals in U')]")).click();
		    	Thread.sleep(2000);
		    	d.switchTo().window(tab4.get(3));
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Salient aspects of Deputation proposals')]")).click();
		    	Thread.sleep(2000);
		    	d.switchTo().window(tab4.get(3));
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Forwarding of Deputation proposal: Guidance for Mi')]")).click();
		    	Thread.sleep(2000);
		    	d.switchTo().window(tab4.get(3));
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Samples of deficiency letters in respect of Deputa')]")).click();
		    	Thread.sleep(2000);
		    	d.switchTo().window(tab4.get(3));
		    	Thread.sleep(2000);
		    	d.close();
		    	Set <String> windows5=d.getWindowHandles();
		    	ArrayList <String> tab5=new ArrayList(windows5);
		    	d.switchTo().window(tab5.get(9));
		    	Thread.sleep(2000);
		    	d.close();
		    	d.switchTo().window(tab5.get(8));
		    	Thread.sleep(2000);
		    	d.close();
		    	d.switchTo().window(tab5.get(7));
		    	Thread.sleep(2000);
		    	d.close();
		    	d.switchTo().window(tab5.get(6));
		    	Thread.sleep(2000);
		    	d.close();
		    	d.switchTo().window(tab5.get(5));
		    	Thread.sleep(2000);
		    	d.close();
		    	d.switchTo().window(tab5.get(4));
		    	Thread.sleep(2000);
		    	d.close();
		    	d.switchTo().window(tab5.get(3));
		    	Thread.sleep(2000);
		    	d.close();
		    	d.switchTo().window(tab5.get(2));
		    	Thread.sleep(2000);
		    	d.close();
		    	d.switchTo().window(tab5.get(1));
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Introduction')]")).click();
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Personnel')]")).click();
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Instructions and Guidelines')]")).click();
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Promotions')]")).click();
		    	Thread.sleep(2000);
		    	d.switchTo().window(tab5.get(1));
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Deputation')]")).click();
		    	Thread.sleep(2000);
		    	d.switchTo().window(tab5.get(1));
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[5]/a[1]")).click();
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Checklist for submission of DPC proposals under Si')]")).click();
		    	Thread.sleep(2000);
		    	d.switchTo().window(tab5.get(1));
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//a[contains(text(),'Checklist for submission of Deputation proposals u')]")).click();
		    	Thread.sleep(2000);
		    	d.switchTo().window(tab5.get(1));
		    	Thread.sleep(2000);
		    	Set <String> windows6=d.getWindowHandles();
		    	ArrayList <String> tab6=new ArrayList(windows6);
		    	d.switchTo().window(tab6.get(5));
		    	d.close();
		    	d.switchTo().window(tab6.get(4));
		    	d.close();
		    	d.switchTo().window(tab6.get(3));
		    	d.close();
		    	d.switchTo().window(tab6.get(2));
		    	d.close();
		    	d.switchTo().window(tab6.get(1));
		    	Thread.sleep(2000);
		    	d.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[6]/a[1]")).click();
		    	Thread.sleep(2000);
		    	d.close();
		    	d.switchTo().window(tab6.get(0));*/
		    	
		    	driver.findElement(By.xpath("//body/section[2]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[3]/li[1]/a[1]")).click();
		    	Thread.sleep(2000);
		    	Set <String> windows6=driver.getWindowHandles();
		    	ArrayList <String> tab6=new ArrayList(windows6);
		    	driver.switchTo().window(tab6.get(1));
		    	System.out.println("Title of Page: "+driver.getTitle());
		    	System.out.println("Recruitment in others is same as home page Recruitment section");
		    	driver.close();
		    	driver.switchTo().window(tab6.get(0));
		    	Thread.sleep(2000);
		    
		    	
		    
		    	
		    }
		    public void forms() throws InterruptedException {
		    	driver.findElement(By.xpath("//a[contains(text(),'Forms & Downloads')]")).click();
		    	System.out.println("Title of Page: "+driver.getTitle());
		    	Set<String> windows1=driver.getWindowHandles();
		    	ArrayList <String> tab1=new ArrayList(windows1);
		    	driver.findElement(By.cssSelector("body > section.wrapper.body-wrapper > div > div.col-xs-12.col-sm-9.col-md-9.content-container.fontSize > div > div > div > div.views-row.views-row-2.views-row-even > div > span > ul > li > a")).click();
		    	
		    	driver.switchTo().window(tab1.get(0));
		    	
		    	driver.findElement(By.cssSelector("body > section.wrapper.body-wrapper > div > div.col-xs-12.col-sm-9.col-md-9.content-container.fontSize > div > div > div > div.views-row.views-row-4.views-row-even > div > span > ul > li > a")).click();
		    	
		    	driver.switchTo().window(tab1.get(0));
		    	
		    	driver.findElement(By.xpath("//a[contains(text(),'Introduction')]")).click();
		    	System.out.println("Title of Page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//a[contains(text(),'Personnel')]")).click();
		    	System.out.println("Title of Page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		    	System.out.println("Title of Page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//a[contains(text(),'Instructions and Guidelines')]")).click();
		    	System.out.println("Title of Page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/ul[1]/li[6]/a[1]")).click();
		    	System.out.println("Title of Page: "+driver.getTitle());
		    	Thread.sleep(2000);
		    	Set<String> windows2=driver.getWindowHandles();
		    	ArrayList <String> tab2=new ArrayList(windows2);
		    	driver.switchTo().window(tab2.get(2));
		    	driver.close();
		    	driver.switchTo().window(tab2.get(1));
		    	driver.close();
		    	driver.switchTo().window(tab2.get(0));	
		    	Thread.sleep(2000);
		    
		    }
		   
		    public void FAQs() {
		    	 //************************ FAQs **********************************
		         
		        driver.findElement(By.linkText("FAQs")).click();
		        System.out.println("Title of Page : " + driver.getTitle());
		        
		     //********************** Services - II ***************************************
		        driver.findElement(By.linkText("Services - II")).click();
		        System.out.println("Title of Page : " + driver.getTitle());
		        //driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div/div[1]/div/div[1]/div[2]/div/div[1]/span/ul/li/a")).click();
		        
		       driver.findElement(By.xpath("//*[@id=\"collapse0\"]/div[1]/div[1]/span[1]/ul[1]/li[1]/a[1]")).click();
		        //driver.findElement(By.cssSelector("#collapse0 > div > div.views-field.views-field-php > span > ul > li > a")).click();
		       Set<String> allHandles26 =  driver.getWindowHandles();
		       
		       //Iterator for fetching sets value
		         Iterator<String>itr26 = allHandles26.iterator();
		     
		         System.out.println(allHandles26.size());
		         String mainWindow26 = itr26.next();
		         String popup26 = itr26.next();
		      
		         //move to 1st popup
		         driver.switchTo().window(popup26);
		         
		         //get the title & url of popup
		         System.out.println("Title of Page : " + driver.getTitle());
		         System.out.println("URL of Page : " +  driver.getCurrentUrl());
		     
		         //close popup1
		         driver.close();
		    
		          driver.switchTo().window(mainWindow26);
		          System.out.println(driver.getTitle());
		   
		       //********************** Services - I *************************************** 
		       
		         driver.findElement(By.linkText("Services I")).click();
		         System.out.println("Title of Page : " + driver.getTitle());
		         
		         driver.findElement(By.xpath("//body/section[2]/div/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div[1]/span/ul/li/a")).click();
		          Set<String> allHandles27 = driver.getWindowHandles();
		         
		         //Iterator for fetching sets value
		           Iterator<String>itr27 = allHandles27.iterator();
		       
		           System.out.println(allHandles27.size());
		           String mainWindow27 = itr27.next();
		           String popup27 = itr27.next();
		        
		           //move to 1st popup
		           driver.switchTo().window(popup27);
		           
		           //get the title & url of popup
		           System.out.println("Title of Page : " + driver.getTitle());
		           System.out.println("URL of Page : " +  driver.getCurrentUrl());
		       
		           //close popup1
		           driver.close();
		      
		            driver.switchTo().window(mainWindow27);
		            System.out.println(driver.getTitle());   
		     
		          //********************** Recruitment Rules  ***************************************   
		         
		       driver.findElement(By.linkText("Recruitment Rules") ).click();
		       System.out.println("Title of Page : " + driver.getTitle());
		        
		       driver.findElement(By.xpath("//*[@id=\"collapse2\"]/div/div[1]/span/ul/li/a")).click();
		       
		        Set<String> allHandles28 = driver.getWindowHandles();
		       
		       //Iterator for fetching sets value
		         Iterator<String>itr28 = allHandles28.iterator();
		     
		         System.out.println(allHandles28.size());
		         String mainWindow28 = itr28.next();
		         String popup28 = itr28.next();
		      
		         //move to 1st popup
		         driver.switchTo().window(popup28);
		         
		         //get the title & url of popup
		         System.out.println("Title of Page : " + driver.getTitle());
		         System.out.println("URL of Page : " +  driver.getCurrentUrl());
		     
		         //close popup1
		         driver.close();
		    
		          driver.switchTo().window(mainWindow28);
		          System.out.println(driver.getTitle());   
		   
		       
		        //********************** Examination   *************************************** 
		       
		         driver.findElement(By.xpath("//*[@id=\"views-bootstrap-accordion-1\"]/div[4]/div[1]/h4/a")).click();
		         System.out.println("Title of Page : " + driver.getTitle());
		         
		         driver.findElement(By.xpath("//*[@id=\"collapse3\"]/div/div[1]/span/ul/li/a")).click();
		         
		         Set<String> allHandles29 = driver.getWindowHandles();
		         
		         //Iterator for fetching sets value
		           Iterator<String>itr29 = allHandles29.iterator();
		       
		           System.out.println(allHandles29.size());
		           String mainWindow29 = itr29.next();
		           String popup29 = itr29.next();
		        
		           //move to 1st popup
		           driver.switchTo().window(popup29);
		           
		           //get the title & url of popup
		           System.out.println("Title of Page : " + driver.getTitle());
		           System.out.println("URL of Page : " +  driver.getCurrentUrl());
		       
		           //close popup1
		           driver.close();
		      
		            driver.switchTo().window(mainWindow29);
		            System.out.println(driver.getTitle());   
		     
		         
		          //********************** All India Services   *************************************** 
		        driver.findElement(By.linkText("All India Services")).click();
		        System.out.println("Title of Page : " + driver.getTitle());
		        
		        driver.findElement(By.xpath("//*[@id=\"collapse4\"]/div/div[1]/span/ul/li/a")).click();
		        
		        Set<String> allHandles30 = driver.getWindowHandles();
		        
		        //Iterator for fetching sets value
		          Iterator<String>itr30 = allHandles30.iterator();
		      
		          System.out.println(allHandles30.size());
		          String mainWindow30 = itr30.next();
		          String popup30 = itr30.next();
		       
		          //move to 1st popup
		          driver.switchTo().window(popup30);
		          
		          //get the title & url of popup
		          System.out.println("Title of Page : " + driver.getTitle());
		          System.out.println("URL of Page : " +  driver.getCurrentUrl());
		      
		          //close popup1
		          driver.close();
		     
		           driver.switchTo().window(mainWindow30);
		           System.out.println(driver.getTitle());   
		    
		         //********************** Appointment Branch   ***************************************    
		         driver.findElement(By.linkText("Appointment Branch")).click();
		         System.out.println("Title of Page : " + driver.getTitle());
		         
		         driver.findElement(By.xpath("//*[@id=\"collapse5\"]/div/div[1]/span/ul/li/a")).click();
		         
		         Set<String> allHandles31 = driver.getWindowHandles();
		         
		         //Iterator for fetching sets value
		           Iterator<String>itr31 = allHandles31.iterator();
		       
		           System.out.println(allHandles31.size());
		           String mainWindow31 = itr31.next();
		           String popup31 = itr31.next();
		        
		           //move to 1st popup
		           driver.switchTo().window(popup31);
		           
		           //get the title & url of popup
		           System.out.println("Title of Page : " + driver.getTitle());
		           System.out.println("URL of Page : " +  driver.getCurrentUrl());
		       
		           //close popup1
		           driver.close();
		      
		            driver.switchTo().window(mainWindow31);
		            System.out.println(driver.getTitle());
		            
		          //********************** Recruitment  *************************************** 
		        driver.findElement(By.xpath("//*[@id=\"views-bootstrap-accordion-1\"]/div[7]/div[1]/h4/a")).click();
		        System.out.println("Title of Page : " + driver.getTitle());
		        
		        driver.findElement(By.xpath("//*[@id=\"collapse6\"]/div/div[1]/span/ul/li[1]/a")).click();
		        
		        Set<String> allHandles32 = driver.getWindowHandles();
		        
		        //Iterator for fetching sets value
		          Iterator<String>itr32 = allHandles32.iterator();
		      
		          System.out.println(allHandles32.size());
		          String mainWindow32 = itr32.next();
		          String popup32 = itr32.next();
		       
		          //move to 1st popup
		          driver.switchTo().window(popup32);
		          
		          //get the title & url of popup
		          System.out.println("Title of Page : " + driver.getTitle());
		          System.out.println("URL of Page : " +  driver.getCurrentUrl());
		      
		          //close popup1
		          driver.close();
		     
		           driver.switchTo().window(mainWindow32);
		           System.out.println(driver.getTitle());
		        
		        driver.findElement(By.linkText("(109.59 KB)")).click(); 
		       Set<String> allHandles33 = driver.getWindowHandles();
		        
		        //Iterator for fetching sets value
		          Iterator<String>itr33 = allHandles33.iterator();
		      
		          System.out.println(allHandles33.size());
		          String mainWindow33 = itr33.next();
		          String popup33 = itr33.next();
		       
		          //move to 1st popup
		          driver.switchTo().window(popup33);
		          
		          //get the title & url of popup
		          System.out.println("Title of Page : " + driver.getTitle());
		          System.out.println("URL of Page : " +  driver.getCurrentUrl());
		      
		          //close popup1
		          driver.close();
		     
		           driver.switchTo().window(mainWindow33);
		           System.out.println(driver.getTitle());
		           
		           driver.findElement(By.linkText("Home")).click();
		           
		        
		    	
		    }
		    public void RTI() {
		    	//************************* RTI ****************************************************	
				driver.findElement(By.linkText("RTI")).click();
		        System.out.println("Title of page :" +driver.getTitle());
		        
		    //********************* Link 1*****************************************************  
				driver.findElement(By.linkText("Click here")).click();
				 
				 Set<String> allHandles34 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr34 = allHandles34.iterator();
			      
			          System.out.println(allHandles34.size());
			          String mainWindow34 = itr34.next();
			          String popup34 = itr34.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup34);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow34);
			           System.out.println(driver.getTitle()); 
			          
			         //**************************link3 *****************************************************  
			         driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr[3]/td[2]/li/a")).click();
				     
			         Set<String> allHandles35 = driver.getWindowHandles();
				        
				        //Iterator for fetching sets value
				          Iterator<String>itr35 = allHandles35.iterator();
				      
				          System.out.println(allHandles35.size());
				          String mainWindow35 = itr35.next();
				          String popup35 = itr35.next();
				       
				          //move to 1st popup
				          driver.switchTo().window(popup35);
				          
				          //get the title & url of popup
				          System.out.println("Title of Page : " + driver.getTitle());
				          System.out.println("URL of Page : " +  driver.getCurrentUrl());
				      
				          //close popup1
				          driver.close();
				     
				           driver.switchTo().window(mainWindow35);
				           System.out.println(driver.getTitle()); 
				           
				         //***************************** Link 4 **************************************************       
				         driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr[4]/td[2]/li/a")) .click();
				         
				         Set<String> allHandles36 = driver.getWindowHandles();
					        
					        //Iterator for fetching sets value
					          Iterator<String>itr36 = allHandles36.iterator();
					      
					          System.out.println(allHandles36.size());
					          String mainWindow36 = itr36.next();
					          String popup36 = itr36.next();
					       
					          //move to 1st popup
					          driver.switchTo().window(popup36);
					          
					          //get the title & url of popup
					          System.out.println("Title of Page : " + driver.getTitle());
					          System.out.println("URL of Page : " +  driver.getCurrentUrl());
					      
					          //close popup1
					          driver.close();
					     
					           driver.switchTo().window(mainWindow36);
					           System.out.println(driver.getTitle()); 
				         
		        
			  
		        
			                  driver.findElement(By.linkText("(153.17 KB)")).click();
			                  
			                  Set<String> allHandles37 = driver.getWindowHandles();
						        
						        //Iterator for fetching sets value
						          Iterator<String>itr37 = allHandles37.iterator();
						      
						          System.out.println(allHandles37.size());
						          String mainWindow37 = itr37.next();
						          String popup37 = itr37.next();
						       
						          //move to 1st popup
						          driver.switchTo().window(popup37);
						          
						          //get the title & url of popup
						          System.out.println("Title of Page : " + driver.getTitle());
						          System.out.println("URL of Page : " +  driver.getCurrentUrl());
						      
						          //close popup1
						          driver.close();
						     
						           driver.switchTo().window(mainWindow37);
						           System.out.println(driver.getTitle()); 
			                  
		        
			    	driver.findElement(By.linkText("(41.71 KB)")).click();
			    	
			    	Set<String> allHandles38 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr38 = allHandles38.iterator();
			      
			          System.out.println(allHandles38.size());
			          String mainWindow38 = itr38.next();
			          String popup38 = itr38.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup38);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow38);
			           System.out.println(driver.getTitle()); 
		          
			    	
		        
				 driver.findElement(By.linkText("(184.51 KB)")).click();
		        
				 Set<String> allHandles39 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr39 = allHandles39.iterator();
			      
			          System.out.println(allHandles39.size());
			          String mainWindow39 = itr39.next();
			          String popup39 = itr39.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup39);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow39);
			           System.out.println(driver.getTitle()); 
		       
				  
			      
		        
				 driver.findElement(By.linkText("(114.74 KB)")).click();
				 
				 Set<String> allHandles40 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr40 = allHandles40.iterator();
			      
			          System.out.println(allHandles40.size());
			          String mainWindow40 = itr40.next();
			          String popup40 = itr40.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup40);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow40);
			           System.out.println(driver.getTitle()); 
		    
		        
			 	driver.findElement(By.linkText("(54.78 KB)")).click();
			 	
			 	 Set<String> allHandles41 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr41 = allHandles41.iterator();
			      
			          System.out.println(allHandles41.size());
			          String mainWindow41 = itr41.next();
			          String popup41 = itr41.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup41);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow41);
			           System.out.println(driver.getTitle()); 
		    
			 	
				driver.findElement(By.linkText("(19.12 KB)")).click();
				
				 Set<String> allHandles42 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr42 = allHandles42.iterator();
			      
			          System.out.println(allHandles42.size());
			          String mainWindow42 = itr42.next();
			          String popup42 = itr42.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup42);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow42);
			           System.out.println(driver.getTitle()); 
		 
				
				driver.findElement(By.linkText("(19.37 KB)")).click();
				
				 Set<String> allHandles43 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr43 = allHandles43.iterator();
			      
			          System.out.println(allHandles43.size());
			          String mainWindow43 = itr43.next();
			          String popup43 = itr43.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup43);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow43);
			           System.out.println(driver.getTitle()); 
		 
				
				driver.findElement(By.linkText("(320.12 KB)")).click();
				
				 Set<String> allHandles44 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr44 = allHandles44.iterator();
			      
			          System.out.println(allHandles44.size());
			          String mainWindow44 = itr44.next();
			          String popup44 = itr44.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup44);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow44);
			           System.out.println(driver.getTitle()); 
		 
				
				driver.findElement(By.linkText("(23.52 KB)")).click();
				
				 Set<String> allHandles45 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr45 = allHandles45.iterator();
			      
			          System.out.println(allHandles45.size());
			          String mainWindow45 = itr45.next();
			          String popup45 = itr45.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup45);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow45);
			           System.out.println(driver.getTitle()); 
		 
		        
				driver.findElement(By.linkText("(81.93 KB)")).click();
				
				 Set<String> allHandles46 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr46 = allHandles46.iterator();
			      
			          System.out.println(allHandles46.size());
			          String mainWindow46 = itr46.next();
			          String popup46 = itr46.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup46);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow46);
			           System.out.println(driver.getTitle()); 
		 
		        
				driver.findElement(By.linkText("(7.54 MB)")).click();
				
				 Set<String> allHandles47 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr47 = allHandles47.iterator();
			      
			          System.out.println(allHandles47.size());
			          String mainWindow47 = itr47.next();
			          String popup47 = itr47.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup47);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow47);
			           System.out.println(driver.getTitle()); 
		 
		        
				driver.findElement(By.linkText("(187.99 KB)")).click();
				
				 Set<String> allHandles48 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr48 = allHandles48.iterator();
			      
			          System.out.println(allHandles48.size());
			          String mainWindow48 = itr48.next();
			          String popup48 = itr48.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup48);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow48);
			           System.out.println(driver.getTitle()); 
		 
		        
				driver.findElement(By.xpath("//tbody/tr[17]/td[2]/li[1]/a[1]")).click();
				
				 Set<String> allHandles49 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr49 = allHandles49.iterator();
			      
			          System.out.println(allHandles49.size());
			          String mainWindow49 = itr49.next();
			          String popup49 = itr49.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup49);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow49);
			           System.out.println(driver.getTitle()); 
		 
		        
				driver.findElement(By.linkText("(435.22 KB)")).click();
				
				 Set<String> allHandles50 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr50 = allHandles50.iterator();
			      
			          System.out.println(allHandles50.size());
			          String mainWindow50 = itr50.next();
			          String popup50 = itr50.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup50);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow50);
			           System.out.println(driver.getTitle()); 
		 
		        
				driver.findElement(By.linkText("(89.11 KB)")).click();
				
				 Set<String> allHandles51 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr51 = allHandles51.iterator();
			      
			          System.out.println(allHandles51.size());
			          String mainWindow51 = itr51.next();
			          String popup51 = itr51.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup51);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow51);
			           System.out.println(driver.getTitle()); 
		 
		        
				driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div/div/div[1]/div[2]/table/tbody/tr[17]/td[2]/li/a")).click();
				
				 Set<String> allHandles52 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr52 = allHandles52.iterator();
			      
			          System.out.println(allHandles52.size());
			          String mainWindow52 = itr52.next();
			          String popup52 = itr52.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup52);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow52);
			           System.out.println(driver.getTitle()); 
		 
		        
			 	driver.findElement(By.linkText("(7.64 MB)")).click();
				
				 Set<String> allHandles53 = driver.getWindowHandles();
			        
			        //Iterator for fetching sets value
			          Iterator<String>itr53 = allHandles53.iterator();
			      
			          System.out.println(allHandles53.size());
			          String mainWindow53 = itr53.next();
			          String popup53 = itr53.next();
			       
			          //move to 1st popup
			          driver.switchTo().window(popup53);
			          
			          //get the title & url of popup
			          System.out.println("Title of Page : " + driver.getTitle());
			          System.out.println("URL of Page : " +  driver.getCurrentUrl());
			      
			          //close popup1
			          driver.close();
			     
			           driver.switchTo().window(mainWindow53);
			           System.out.println(driver.getTitle()); 
		 
		        
				driver.findElement(By.linkText(">> View Archives")).click();
				driver.findElement(By.linkText("(8.02 KB)")).click();
				Set<String> allHandles54 = driver.getWindowHandles();
		        
		        //Iterator for fetching sets value
		          Iterator<String>itr54 = allHandles54.iterator();
		      
		          System.out.println(allHandles54.size());
		          String mainWindow54 = itr54.next();
		          String popup54 = itr54.next();
		       
		          //move to 1st popup
		          driver.switchTo().window(popup54);
		          
		          //get the title & url of popup
		          System.out.println("Title of Page : " + driver.getTitle());
		          System.out.println("URL of Page : " +  driver.getCurrentUrl());
		      
		          //close popup1
		          driver.close();
		     
		           driver.switchTo().window(mainWindow54);
		           System.out.println(driver.getTitle()); 

				driver.findElement(By.linkText("(3.78 MB)")).click(); 
				Set<String> allHandles55 = driver.getWindowHandles();
		        
		        //Iterator for fetching sets value
		          Iterator<String>itr55 = allHandles55.iterator();
		      
		          System.out.println(allHandles55.size());
		          String mainWindow55 = itr55.next();
		          String popup55 = itr55.next();
		       
		          //move to 1st popup
		          driver.switchTo().window(popup55);
		          
		           //get the title & url of popup
		          System.out.println("Title of Page : " + driver.getTitle());
		          System.out.println("URL of Page : " +  driver.getCurrentUrl());
		      
		          //close popup1
		          driver.close();
		     
		           driver.switchTo().window(mainWindow55);
		           System.out.println(driver.getTitle()); 
		           driver.findElement(By.linkText("Home")).click();
		           driver.quit();
		           
		           
		           
			 
		    }

	}

	 	

 
