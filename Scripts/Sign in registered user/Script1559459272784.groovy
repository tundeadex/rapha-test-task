import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

def timeout = 5;

WebUI.openBrowser(null)
WebUI.navigateToUrl('https://www.rapha.cc')
WebUI.waitForPageLoad(timeout)
WebUI.click(findTestObject('Nav/My Account Icon'))
WebUI.click(findTestObject('Nav/Account_Sub_Menu/Sign In link'))
WebUI.sendKeys(findTestObject('Login_Page/Username field'), 'raphatest@test.cc')
WebUI.sendKeys(findTestObject('Login_Page/Password field'), 'T3st2019')
WebUI.click(findTestObject('Login_Page/Submit button'))
// make assertion
WebUI.click(findTestObject('Nav/My Account Icon'))
WebUI.verifyElementPresent(findTestObject('Nav/Account_Sub_Menu/Sign Out Link'), timeout)
WebUI.closeBrowser()

