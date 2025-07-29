package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class HomepageTest extends BaseTest{// homePage child of BaseTest 
@Test	
public void  testHomePage() {
	HomePage homePage=new HomePage(driver);
	homePage.Company();
	homePage.Careers();
}

}
