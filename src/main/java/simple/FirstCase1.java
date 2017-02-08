package simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstCase1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.pfchangs.com");
		System.out.println("testing ");
<<<<<<< HEAD
	System.out.println("im in master");
=======
		System.out.println("i have made changes in branch");
>>>>>>> teeebranch

	}

}
