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
WebUI.navigateToUrl('https://www.rapha.cc/gb/en/mens-products/jerseys/category/jerseys')
WebUI.waitForPageLoad(timeout)
WebUI.scrollToElement(findTestObject('Product_Cell/Black Classic Jersey II'), timeout)
WebUI.waitForElementClickable(findTestObject('Product_Cell/Black Classic Jersey II'), timeout)
WebUI.click(findTestObject('Product_Cell/Black Classic Jersey II'))
WebUI.waitForPageLoad(timeout)
WebUI.click(findTestObject('Product_Page/Size Selector'))
WebUI.click(findTestObject('Product_Page/Size Selector Medium'))

WebUI.click(findTestObject('Product_Page/Add To Basket'))

WebUI.click(findTestObject('Mini_Bag_Sidebar/Go To Basket'))

WebUI.waitForPageLoad(timeout)
WebUI.click(findTestObject('Checkout_Page/Checkout button'))


WebUI.waitForPageLoad(timeout)
WebUI.click(findTestObject('Login_Page/Guest checkout')) 

WebUI.waitForPageLoad(timeout)
WebUI.sendKeys(findTestObject('Guest_Checkout_Page/Email field'), 'something@fakeemail.com')
WebUI.click(findTestObject('Guest_Checkout_Page/Checkout as guest button'))

WebUI.waitForPageLoad(timeout)
WebUI.click(findTestObject('Shipping_Address_Page/Title'))
WebUI.click(findTestObject('Shipping_Address_Page/Mr option'))
WebUI.sendKeys(findTestObject('Shipping_Address_Page/First name'), 'John')
WebUI.sendKeys(findTestObject('Shipping_Address_Page/Last name'), 'Doe')
WebUI.sendKeys(findTestObject('Shipping_Address_Page/Phone'), '012345678900')
WebUI.sendKeys(findTestObject('Shipping_Address_Page/Line 1'), '1 Some place')
WebUI.sendKeys(findTestObject('Shipping_Address_Page/Town City'), 'London')
WebUI.sendKeys(findTestObject('Shipping_Address_Page/Postcode'), 'NW1 2RE')
WebUI.waitForElementClickable(findTestObject('Shipping_Address_Page/Continue with shopping'), timeout, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Shipping_Address_Page/Continue with shopping'))

WebUI.waitForPageLoad(timeout)
WebUI.click(findTestObject('Shipping_Method_Page/Continue'))

WebUI.waitForPageLoad(timeout)
WebUI.verifyElementPresent(findTestObject('Payment_Page/Card Form container'), timeout)

WebUI.closeBrowser()












