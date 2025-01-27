package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class patient_Pages extends StartupPage {
	
	//Locators of L1 Scenarios
		//login locators
		By usernameTextfield = By.id(" ");
		By usernameTextbox = By.xpath(" ");
		By passwordTextbox = By.xpath(" ");
		By signInButton = By.xpath(" ");

		By patientModuleByElement = By.xpath(" ");

		By patientModuleToggleIconByElement = By.xpath(" ");
		By searchPatientSubModuleByElement = By.xpath(" ");
		By registerPatientSubModuleByElement = By.xpath(" ");

		By searchPatientTextboxByElement = By.xpath(" ");

		By cameraIconByElement = By.xpath(" ");
		By newPhotoButtonByElement = By.xpath(" ");
		By takeASnapShotButtonByElement = By.xpath(" ");
		By cancelButtonByElement = By.xpath(" ");

		By basicInformationLinkByElement = By.xpath(" ");
		By regPatientSubmitButtonByElement = By.xpath(" ");
		By errorMessageOfPhoneNumberTextboxByElement = By.xpath(" ");

		By firstNameTextboxByElement = By.xpath(" ");
		By middleNameTextboxByElement = By.xpath(" ");
		By lastNameTextboxByElement = By.xpath(" ");
		By ageTextboxByElement = By.xpath(" ");
		By phoneTextboxByElement = By.xpath("  ");

		By bloodGroupDropdownByElement = By.xpath(" ");

		By guarantorLinkByElement = By.xpath(" ");
		By maleRadioButtonByElement = By.xpath(" ");
		By feMaleRadioButtonByElement = By.xpath(" ");

		By selfCheckboxByElement = By.xpath(" ");
		By notificationPopupMessageElement = By.xpath(" ");
		By statusNotificationMessageByElement = By.xpath(" ");
		By mainNotificationMessageByElement = By.xpath(" ");

		By kinEmergencyContactLinkByElement = By.xpath(" ");
		By commentsTextboxByElement = By.xpath(" ");

		By alexAlexaTextNameByElement = By.xpath(" ");
		By printButtonByElement = By.xpath(" ");
		By lastButtonByElement = By.xpath(" ");

		By vaccinationModuleByElement = By.xpath(" ");
		By vaccinationModulesToggleIconByElement = By.xpath(" ");
		By patientListSubModuleByElement = By.xpath(" ");
		By titleNameOfVaccinationPatientRegisterFormByElement = By.xpath(" ");

	


	String pageName = this.getClass().getSimpleName();
	public patient_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1
	 * about this method loginTohealthAppByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		
		return false;
	}

	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTitleOfThePage() throws Exception {
		return null;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyURLOfThePage() throws Exception {
		return null;
	}

	/**@Test2
	 * about this method verifyAllPresenceOfFieldIfPatientModuleIsPresent() 
	 * @param : null
	 * @description : 
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyAllPresenceOfFieldIfPatientModuleIsPresent() throws Exception {
		return false;
	}

	/**@Test3
	 * about this method verifyPlaceholderNameOfTexbox() 
	 * @param : null
	 * @description : verify the placeholder name of text box 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyPlaceholderNameOfTexbox() throws Exception {
		return null;
	}

	/**@Test4
	 * about this method verifyButtonIsPresent() 
	 * @param : null
	 * @description : 
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyButtonIsPresent() throws Exception {
		return false;
	}

	/**@Test5
	 * about this method verifyErrorMessage() 
	 * @param : null
	 * @description : verify the error message
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyErrorMessage() throws Exception {
		return null;
	}


	/**@Test6
	 * about this method verifyTexboxIsPresentAndValidateEnteredValue() 
	 * @param : null
	 * @description : verify text box , then send value to that text box and validate the entered value
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTexboxIsPresentAndValidateEnteredValue(Map<String, String> expectedData) throws Exception {

		return null;
	}

	/**@Test7
	 * about this method scrollToBottomAndVerifyFieldIsPresent() 
	 * @param : null
	 * @description : 
	 * @return : String
	 * @author : YAKSHA
	 */
	public Boolean scrollToBottomAndVerifyFieldIsPresent() throws Exception {
		return false;
	}

	/**@Test8
	 * about this method scrollToBottomVerifyFieldAndHighlight() 
	 * @param : null
	 * @description : 
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean highlightTheElement() throws Exception {
		return false;
	}

	/**@Test9
	 * about this method verifyOptionIsSelectedFromDropdown() 
	 * @param : get the data from Excel file as type Map<String, String> expectedData
	 * @description : it will select the option as per Excel expected data
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyOptionIsSelectedFromDropdown(Map<String, String> expectedData) throws Exception {

		return null;

	}

	/**@Test10
	 * about this method verifyRadioButton() 
	 * @param : null
	 * @description :
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyRadioButton() throws Exception {
		return false;
	}

	/**@Test11
	 * about this method verifyNotificationPopupMessageIfCheckboxIsSelected() 
	 * @param : null
	 * @description : verify the error message using hard assert
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyNotificationPopupMessageIfCheckboxIsSelected() throws Exception {
		return null;
	}

	/**@Test12
	 * about this method performJavaScriptOperation() 
	 * @param : null
	 * @description : 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String performJavaScriptOperation(Map<String, String> expectedData) throws Exception {

		return null;
	}

}
