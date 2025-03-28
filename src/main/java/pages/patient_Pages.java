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
		//write your logic here
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
		//write your logic here
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
		//write your logic here
		return null;
	}

	/**@Test2
	 * about this method verifyAllPresenceOfFieldIfPatientModuleIsPresent() 
	 * @param : null
	 * @description : Ensure the sub-modules "Search Patient" and "Register Patient" are available. 
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyAllPresenceOfFieldIfPatientModuleIsPresent() throws Exception {
		//write your logic here
				return false;
	}

	/**@Test3
	 * about this method verifyPlaceholderNameOfTexbox() 
	 * @param : null
	 * @description : Ensure that the Search text box correctly displays its placeholder text
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyPlaceholderNameOfTexbox() throws Exception {
		//write your logic here
		return null;
	}

	/**@Test4
	 * about this method verifyButtonIsPresent() 
	 * @param : null
	 * @description : Ensure the presence of the "Take a Snapshot" button.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyTakeASnapshotButtonIsPresent() throws Exception {
		//write your logic here
				return false;
	}

	/**@Test5
	 * about this method verifyErrorMessage() 
	 * @param : null
	 * @description : Ensure the error message for the "Phone number" field is "Primary Phone is required",
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyErrorMessage() throws Exception {
		//write your logic here
		return null;
	}


	/**@Test6
	 * about this method verifyTexboxIsPresentAndValidateEnteredValue() 
	 * @param : null
	 * @description : verify text box , then send value to that text box and validate the entered value
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTextboxIsPresentAndValidateEnteredValue(Map<String, String> expectedData) throws Exception {

		//write your logic here
		return null;
	}

}
