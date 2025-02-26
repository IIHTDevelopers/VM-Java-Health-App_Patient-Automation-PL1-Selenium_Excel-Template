package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class patient_Pages extends StartupPage {
	
//	TC-1 Locators
	By usernameTextfield = null;
	By usernameTextbox = null;
	By passwordTextbox = null;
	By signInButton = null;
	By patientModuleByElement = null;
//	TC-2 Locators
	By patientModuleToggleIconByElement = null;
	By searchPatientSubModuleByElement = null;
	By registerPatientSubModuleByElement = null;
//	TC-3 Locators
	By searchPatientTextboxByElement = null;
//	TC-4 Locators
	By cameraIconByElement = null;
	By newPhotoButtonByElement = null;
	By takeASnapShotButtonByElement = null;
	By cancelButtonByElement = null;
//	TC-5 Locators
	By basicInformationLinkByElement = null;
	By regPatientSubmitButtonByElement = null;
	By errorMessageOfPhoneNumberTextboxByElement = null;
//	TC-6 Locators
	By firstNameTextboxByElement = null;
	By middleNameTextboxByElement = null;
	By lastNameTextboxByElement = null;
	By ageTextboxByElement = null;
	By phoneTextboxByElement = null;
//	TC-7 & 8 Locators
	By bloodGroupDropdownByElement = null;


	String pageName = this.getClass().getSimpleName();
	public patient_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1.1
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
	 * @description : "Verify that Patient module is present or not ?"
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyAllPresenceOfFieldIfPatientModuleIsPresent() throws Exception {
		return false;
	}

	/**@Test3
	 * about this method verifyPlaceholderNameOfTexbox() 
	 * @param : null
	 * @description : "On the "Patient" Module's "Search Patient" page
	 * verify & clicking on the "Search (Minimum 3 Character)" textbox.
	 * "and get the Placeholder name of "Search (Minimum 3 Character)" textbox. 
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyPlaceholderNameOfTexbox() throws Exception {
		return null;
	}

	/**@Test4
	 * about this method verifyButtonIsPresent() 
	 * @param : null
	 * @description :"On the "Patient" Module's"
			+ "clicking on "Register Patient" sub module"
			+ "and verify that the "+ New Photo" button is present or not ?"
			+ "After validation of "+ New Photo" button,"
			+ "then click on it, Then verify \"Take A Snapshot\" button is present or not?") 
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
	 * @description : "On the \"Basic Information\" form of \"Register Patient\" sub module, 
	 * "scroll to the bottom of the \"Basic Information\" form.
	 * Then verify the \"Blood Group\" Dropdown is present or not?"
	 * @return : String
	 * @author : YAKSHA
	 */
	public Boolean scrollToBottomAndVerifyFieldIsPresent() throws Exception {
		return false;
	}

	/**@Test8
	 * about this method scrollToBottomVerifyFieldAndHighlight() 
	 * @param : null
	 * @description : "On the bottom of the \"Basic Information" form
			+ "of "Register Patient" sub module,"
			+ "If "Blood Group" Dropdown is present"
			+ "then highlight the "Blood Group" Dropdown"
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean highlightTheElement() throws Exception {
		return false;
	}

}
