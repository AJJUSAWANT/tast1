package basic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class datetime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp = ldt.toString().replace(":","-");
		System.out.println(ldt);//
		
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/login/");
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 
       File ele = ts.getScreenshotAs(OutputType.FILE);
       File dest =new File("./Ajay/facebook"+timestamp+".png");
       FileUtils.copyFile(ele, dest);

	}

}
