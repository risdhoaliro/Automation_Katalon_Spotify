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

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Search/Search Song/button_Cookie Policy_onetrust-close-btn-han_ff4dd0'), 30)

WebUI.click(findTestObject('Search/Search Song/button_Cookie Policy_onetrust-close-btn-han_ff4dd0'))

WebUI.click(findTestObject('Search/Search Song/span_Log in'))

WebUI.setText(findTestObject('Search/Search Song/input_Email address or username_login-username'), 'testing.brins@gmail.com')

WebUI.setEncryptedText(findTestObject('Search/Search Song/input_Password_login-password'), 'RoIqZTIq+p7EmAbYLzW68w==')

WebUI.click(findTestObject('Search/Search Song/span_Log In (1)'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Search/Search Song/span_Search'))

WebUI.setText(findTestObject('Search/Search Song/input_Testing Brins_Type__TypeElement-sc-go_770b53'), 'Komang')

WebUI.waitForElementPresent(findTestObject('Search/Search Song/div_Komang'), 20)

WebUI.verifyElementText(findTestObject('Search/Search Song/div_Komang'), 'Komang')

WebUI.closeBrowser()

