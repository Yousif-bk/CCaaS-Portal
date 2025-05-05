import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

import internal.GlobalVariable as GlobalVariable


// Set Chrome options to allow microphone access
ChromeOptions options = new ChromeOptions()
Map<String, Object> prefs = new HashMap<String, Object>()
prefs.put("profile.default_content_setting_values.media_stream_mic", 1)  // 1 = allow, 2 = block
prefs.put("profile.default_content_setting_values.media_stream_camera", 1)
options.setExperimentalOption("prefs", prefs)

WebDriver driver = new ChromeDriver(options)
DriverFactory.changeWebDriver(driver)

// Now continue your test
WebUI.navigateToUrl('https://cxagent.nicecxone.com/')

WebUI.setText(findTestObject('Object Repository/Nice CXone Agent OR/Page_Sign In/input_Sign In_username'), '800engagex_aabaker@eand.com')

WebUI.click(findTestObject('Object Repository/Nice CXone Agent OR/Page_Sign In/button_NEXT'))

WebUI.setEncryptedText(findTestObject('Object Repository/Nice CXone Agent OR/Page_Sign In/input_Sign In_password'), 'rBxUql4cWJqz1D4sF7V5lQ==')

WebUI.click(findTestObject('Object Repository/Nice CXone Agent OR/Page_Sign In/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Nice CXone Agent OR/Page_NICE CXone/svg_Dialed number is invalid_MuiSvgIcon-roo_0221d2'))

WebUI.setText(findTestObject('Object Repository/Nice CXone Agent OR/Page_NICE CXone/input__searchField'), '+971554573936')

WebUI.click(findTestObject('Object Repository/Nice CXone Agent OR/Page_NICE CXone/div_Voice Call'))

WebUI.click(findTestObject('Object Repository/Nice CXone Agent OR/Page_NICE CXone/path_Dialed number is invalid_Path_12738'))

WebUI.closeBrowser()
