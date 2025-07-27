import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.baseURL)

WebUI.setText(findTestObject('Login Page/Page_Swag Labs/Input Username'), username)

WebUI.setEncryptedText(findTestObject('Login Page/Page_Swag Labs/Input Password'), password)

WebUI.click(findTestObject('Login Page/Page_Swag Labs/Login Button'))

WebUI.verifyElementPresent(findTestObject('Login Page/Page_Swag Labs/Verify with Product name'), 0)

BTN = btn

switch (BTN) {
    case 'all':
        WebUI.click(findTestObject('Main Menu Page/Page_Swag Labs/Image Product 1'))

        WebUI.click(findTestObject('Main Menu Page/Page_Swag Labs/button Open Menu'))

        WebUI.click(findTestObject('Main Menu Page/Page_Swag Labs/All Items'))

        WebUI.verifyElementVisible(findTestObject('Main Menu Page/Page_Swag Labs/Validate All Items'))
		WebUI.closeBrowser()
        break
    case 'about':
        WebUI.click(findTestObject('Main Menu Page/Page_Swag Labs/button Open Menu'))

        WebUI.click(findTestObject('Main Menu Page/Page_Swag Labs/About'))

        //		WebUI.verifyElementVisible(findTestObject('Main Menu Page/Page_Sauce Labs Cross Browser Testing, Selenium Testing  Mobile Testing/Validate About'))
		WebUI.closeBrowser()
		break
    case 'logout':
        WebUI.click(findTestObject('Main Menu Page/Page_Swag Labs/button Open Menu'))

        WebUI.click(findTestObject('Main Menu Page/Page_Swag Labs/Logout'))

        WebUI.verifyElementVisible(findTestObject('Main Menu Page/Page_Swag Labs/Validate Logout'))
		WebUI.closeBrowser()
        break
    case 'reset':
        WebUI.click(findTestObject('Main Menu Page/Page_Swag Labs/button Open Menu'))

        WebUI.click(findTestObject('Main Menu Page/Page_Swag Labs/Reset App State'))

        WebUI.verifyElementVisible(findTestObject('Main Menu Page/Page_Swag Labs/Validate Reset App State'))
		
		WebUI.closeBrowser()

        break
}



