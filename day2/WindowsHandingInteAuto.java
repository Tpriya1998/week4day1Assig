package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsHandingInteAuto {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on CRSfma
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		String windowHandle1 = driver.getWindowHandle();
		System.out.println("Parent address is:"+windowHandle1);
				
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("All Window is :"+windowHandles);
			
		//Convert Set into List
		List <String> convert= new ArrayList<String>(windowHandles);
		System.out.println("The List is :"+convert);
		//transfer the driver focus
		driver.switchTo().window(convert.get(1));
		
		//Click on lick on the first resulting contact.
				driver.findElement(By.xpath("//a[@class='linktext']")).click();
			
		//Back to pre existing driver
		
		driver.switchTo().window(convert.get(0));
		
		// Click on the widget of the "To Contact". 
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']//following::a")).click();
		
				
				Set<String> toContact = driver.getWindowHandles();
				System.out.println("All Window is :"+toContact);
				//Convert Set into List
				List <String> contact= new ArrayList<String>(toContact);
				System.out.println("The List is :"+contact);
				
				driver.switchTo().window(contact.get(1));
				
				// Click on the second resulting contact. 
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();			
										
		//Back to pre existing driver
		driver.switchTo().window(convert.get(0));
		//Click on the Merge	
		driver.findElement(By.linkText("Merge")).click();
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		String titleOfParents = driver.getTitle();
		System.out.println("After Switching:"+titleOfParents);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
