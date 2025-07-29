package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.CareerPage;
import pages.HomePage;

public class HomepageTest extends BaseTest{// homePage child of BaseTest 
@Test	
public void  testHomePage() {
	HomePage homePage=new HomePage(driver);
	CareerPage careerPage=new CareerPage(driver);
	homePage.Company();
	homePage.Careers();
	careerPage.findJob();
	careerPage.filterDepartment();
	careerPage.qualityAssuarance();
	
	
}

}
