package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;
	private By companyDropdown=By.xpath("//a[text()[normalize-space()='Company'] and contains(@class,'dropdown-toggle')]");
	private By career=By.xpath("//div[contains(@class,'dropdown-menu')]//a[text()='Careers']");
public HomePage(WebDriver driver) {//constractor
	this.driver=driver;
}
public void Company() {//XPATH AL
 driver.findElement(companyDropdown).click();}
public void Careers() {
driver.findElement(career).click();
}



}
