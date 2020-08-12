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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.urlHomepage)

WebUI.delay(2)

WebUI.click(findTestObject('Buy Product/Page_Sample Store/button_BUY NOW'))

WebUI.delay(2)

//WebUI.setText(findTestObject('Buy Product/Page_Sample Store/input_Amount(Rp)'), '500000')
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Buy Product/Page_Sample Store/input_Name'), 'NamaMana')
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Buy Product/Page_Sample Store/input_Email'), 'email@email.com')
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Buy Product/Page_Sample Store/input_Phone'), '089787876756')
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Buy Product/Page_Sample Store/input_City'), 'Bandung')
//
//WebUI.delay(2)
//
//WebUI.scrollToElement(findTestObject('Buy Product/Page_Sample Store/input_Address'), 2)
//
//WebUI.setText(findTestObject('Buy Product/Page_Sample Store/input_Address'), 'Halo halo Bandung ibu kota priangan')
//
//WebUI.delay(2)
//
//WebUI.setText(findTestObject('Buy Product/Page_Sample Store/input_PostalCode'), '40123')
//
//WebUI.delay(2)

//WebUI.click(findTestObject('New Folder/Page_Sample Store/button_Retry'))
//
//WebUI.delay(2)

WebUI.click(findTestObject('New Folder/Page_Sample Store/button_ATMBank Transfer'))

WebUI.delay(2)

WebUI.click(findTestObject('New Folder/Page_Sample Store/button_payBCA'))

WebUI.delay(2)

WebUI.click(findTestObject('New Folder/Page_Sample Store/button_See Account Number'))

WebUI.delay(2)

WebUI.click(findTestObject('New Folder/Page_Sample Store/button_Please Complete Payment'))

WebUI.delay(2)

