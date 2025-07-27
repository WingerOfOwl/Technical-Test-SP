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

Username = username

Password = password

switch (Username) {
    case 'standard_user':
        WebUI.setText(findTestObject('Login Page/Page_Swag Labs/Input Username'), username)

        WebUI.setEncryptedText(findTestObject('Login Page/Page_Swag Labs/Input Password'), password)

        WebUI.click(findTestObject('Login Page/Page_Swag Labs/Login Button'))

        if (Password == 'qcu24s4901FyWDTwXGr6XA==') {
            WebUI.verifyElementPresent(findTestObject('Login Page/Page_Swag Labs/Verify with Product name'), 0)
        } else {
            WebUI.verifyElementPresent(findTestObject('Login Page/Page_Swag Labs/Alert Password Required'), 0)
        }
        
        WebUI.closeBrowser()

        break
    case 'locked_out_user':
        WebUI.setText(findTestObject('Login Page/Page_Swag Labs/Input Username'), username)

        WebUI.setEncryptedText(findTestObject('Login Page/Page_Swag Labs/Input Password'), password)

        WebUI.click(findTestObject('Login Page/Page_Swag Labs/Login Button'))

        WebUI.verifyElementPresent(findTestObject('Login Page/Page_Swag Labs/Error Icon'), 0)

        WebUI.closeBrowser()

        break
    case 'problem_user':
        WebUI.setText(findTestObject('Login Page/Page_Swag Labs/Input Username'), username)

        WebUI.setEncryptedText(findTestObject('Login Page/Page_Swag Labs/Input Password'), password)

        WebUI.click(findTestObject('Login Page/Page_Swag Labs/Login Button'))

        WebUI.verifyElementPresent(findTestObject('Login Page/Page_Swag Labs/Verify with Product name'), 0)

        WebUI.closeBrowser()

        break
    case 'performance_glitch_user':
        WebUI.setText(findTestObject('Login Page/Page_Swag Labs/Input Username'), username)

        WebUI.setEncryptedText(findTestObject('Login Page/Page_Swag Labs/Input Password'), password)

        WebUI.click(findTestObject('Login Page/Page_Swag Labs/Login Button'))

        WebUI.verifyElementPresent(findTestObject('Login Page/Page_Swag Labs/Verify with Product name'), 0)

        WebUI.closeBrowser()

        break
    case 'error_user':
        WebUI.setText(findTestObject('Login Page/Page_Swag Labs/Input Username'), username)

        WebUI.setEncryptedText(findTestObject('Login Page/Page_Swag Labs/Input Password'), password)

        WebUI.click(findTestObject('Login Page/Page_Swag Labs/Login Button'))

        WebUI.verifyElementPresent(findTestObject('Login Page/Page_Swag Labs/Verify with Product name'), 0)

        WebUI.closeBrowser()

        break
    case 'visual_user':
        WebUI.setText(findTestObject('Login Page/Page_Swag Labs/Input Username'), username)

        WebUI.setEncryptedText(findTestObject('Login Page/Page_Swag Labs/Input Password'), password)

        WebUI.click(findTestObject('Login Page/Page_Swag Labs/Login Button'))

        WebUI.verifyElementPresent(findTestObject('Login Page/Page_Swag Labs/Verify with Product name'), 0)

        WebUI.closeBrowser()

        break
    case '':
        WebUI.setText(findTestObject('Login Page/Page_Swag Labs/Input Username'), username)

        WebUI.setEncryptedText(findTestObject('Login Page/Page_Swag Labs/Input Password'), password)

        WebUI.click(findTestObject('Login Page/Page_Swag Labs/Login Button'))

        WebUI.verifyElementPresent(findTestObject('Login Page/Page_Swag Labs/Alert Username Required'), 0)

        WebUI.closeBrowser()

        break
    case '':
        WebUI.setText(findTestObject('Login Page/Page_Swag Labs/Input Username'), username)

        WebUI.setEncryptedText(findTestObject('Login Page/Page_Swag Labs/Input Password'), password)

        WebUI.click(findTestObject('Login Page/Page_Swag Labs/Login Button'))

        WebUI.verifyElementPresent(findTestObject('Login Page/Page_Swag Labs/Alert Username Required'), 0)

        WebUI.closeBrowser()

        break
    case 'standard_user':
        WebUI.setText(findTestObject('Login Page/Page_Swag Labs/Input Username'), username)

        WebUI.setEncryptedText(findTestObject('Login Page/Page_Swag Labs/Input Password'), password)

        WebUI.click(findTestObject('Login Page/Page_Swag Labs/Login Button'))

        break
    case 'mamang':
        WebUI.setText(findTestObject('Login Page/Page_Swag Labs/Input Username'), username)

        WebUI.setEncryptedText(findTestObject('Login Page/Page_Swag Labs/Input Password'), password)

        WebUI.click(findTestObject('Login Page/Page_Swag Labs/Login Button'))

        WebUI.verifyElementPresent(findTestObject('Login Page/Page_Swag Labs/Error Icon'), 0)

        WebUI.closeBrowser()

        break
}

