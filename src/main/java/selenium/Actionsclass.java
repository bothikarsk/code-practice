package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        Actions actions = new Actions(driver);
    }
}
