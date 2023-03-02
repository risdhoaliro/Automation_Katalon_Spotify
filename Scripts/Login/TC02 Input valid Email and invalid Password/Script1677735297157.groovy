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

WebUI.navigateToUrl('https://open.spotify.com/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Login/Btn_Login(1)'))

WebUI.setText(findTestObject('Object Repository/Login/input_Email address or username_login-username'), 'testing.brins@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/input_Password_login-password'), 'RoIqZTIq+p7EmAbYLzW68w==')

WebUI.click(findTestObject('Login/Btn_Login(2)'))

WebUI.waitForPageLoad(10)

WebUI.verifyElementText(findTestObject('Login/verify_erorMessage'), 'Incorrect username or password.')

WebUI.waitForPageLoad(50)

WebUI.closeBrowser()

