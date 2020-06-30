package SeleniumAssignment.InputForm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inputform.qa.pages.ContactUsInputForm;
import com.inputform.qa.testbase.TestBase;
import com.inputform.qa.utils.TestUtil;

public class ContactUsInputFormTest extends TestBase {

	ContactUsInputForm contactus;

	WebDriverWait wait;

	@BeforeMethod
	void setup() {

		intialisation();

		contactus = new ContactUsInputForm();

	}

	@Test
	void fillFormTest() {
		
		logger.info("............Test Execution Started Now...............");

		contactus.stateSelection();

		contactus.fillForm(prop.getProperty("UserFirstName"), prop.getProperty("UserLastName"),
				prop.getProperty("Email"), prop.getProperty("MobilePhone"), prop.getProperty("address"),
				prop.getProperty("City"), prop.getProperty("ZipCode"), prop.getProperty("website"),
				prop.getProperty("comment"));

		contactus.selectHosting();

		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		contactus.clickSendButton();
		
		logger.info("..................Test Execution Failed..............");

	}

	@AfterMethod
	void tearDown() {

		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.quit();
	}

}
