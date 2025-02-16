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

WebUI.callTestCase(findTestCase('NICE CXone Agent/CXone Agent Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://ae1.nicecxone.com/apps/#/myprofile')

WebUI.click(findTestObject('Object Repository/Nice CXone Agent OR/Page_My Profile/svg_My Zone_header-option-icon'))

WebUI.click(findTestObject('Object Repository/Nice CXone Agent OR/Page_My Profile/div_MAX'))

WebUI.switchToWindowTitle('MAX')

WebUI.click(findTestObject('Object Repository/Nice CXone Agent OR/Page_MAX/button_New'))

WebUI.setText(findTestObject('Object Repository/Nice CXone Agent OR/Page_MAX/input_search'), '+971554573936')

WebUI.click(findTestObject('Object Repository/Nice CXone Agent OR/Page_MAX/button_Call'))

WebUI.click(findTestObject('Object Repository/Nice CXone Agent OR/Page_MAX/h4_Hang Up'))

WebUI.click(findTestObject('Object Repository/Nice CXone Agent OR/Page_MAX/button_Hang UpHang Up'))

