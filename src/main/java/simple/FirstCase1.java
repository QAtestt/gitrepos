package simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstCase1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.pfchangs.com");

		System.out.println("testing ");
		System.out.println("im making changes in teeebranch");


		System.out.println("im going to make a false commit");
		System.out.println("im re-do ing it");
		System.out.println("im trying for 2ndd time");
<<<<<<< HEAD
		System.out.println("im making a change in testbranch");

	

System.out.println("im in master");

=======
		system.out.println("merging conflict");
		system.out.println("checkin");
	

System.out.println("im in master");
>>>>>>> a3583ebf265c1b7c181d913f198d6d6f7eda09f2

	
	}

}
