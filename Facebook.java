package week2.day1.browserlaunch;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
	
		//loadurl
		
		driver.get("https://www.facebook.com");
		
		//maximize page
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle(); 
		 System.out.println("Page Title is:"+title);
	}

}


