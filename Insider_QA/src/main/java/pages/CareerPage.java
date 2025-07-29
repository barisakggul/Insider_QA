package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CareerPage {
private WebDriver driver;
private By findJob=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
private By filterDepartment=By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/span[1]/span[1]/span[1]/span[1]");
private By qualityAssurance =By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/span[1]/span[1]/span[1]/span[1]"); // bu örnek olarak QA seçeneği

public CareerPage(WebDriver driver) {//constractor
	this.driver=driver;
}
public void findJob() {
	 driver.findElement(findJob).click();}
public void filterDepartment() {
	 driver.findElement(filterDepartment).click();}
public void qualityAssuarance() {
	 driver.findElement(qualityAssurance).click();}
}




