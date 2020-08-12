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

WebUI.delay(5)

WebUI.click(findTestObject('Register/Page_Sample Store/button_SIGN UP'))

WebUI.switchToWindowUrl(GlobalVariable.urlRegister)

WebUI.delay(2)

WebUI.setText(findTestObject('Register/Page_MAP  Registration/inputField_Bussiness Brand'), 'MuzakkiTest')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Register/Page_MAP  Registration/inputField_Full Name'), 0)

WebUI.setText(findTestObject('Register/Page_MAP  Registration/inputField_Full Name'), 'Naufal Muzakki')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Register/Page_MAP  Registration/inputField_Email'), 0)

WebUI.setText(findTestObject('Register/Page_MAP  Registration/inputField_Email'), 'testmail@gmail.com')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Register/Page_MAP  Registration/inputField_WebInsta'), 0)

WebUI.setText(findTestObject('Register/Page_MAP  Registration/inputField_WebInsta'), '')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Register/Page_MAP  Registration/inputFiled_telephone'), 0)

WebUI.setText(findTestObject('Register/Page_MAP  Registration/inputFiled_telephone'), '087867876123')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Register/Page_MAP  Registration/inputFiled_password'), 0)

WebUI.setText(findTestObject('Register/Page_MAP  Registration/inputFiled_password'), 'Test1234')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Register/Page_MAP  Registration/inputField_passwordConfirmation'), 0)

WebUI.setText(findTestObject('Register/Page_MAP  Registration/inputField_passwordConfirmation'), 'Test1234')

WebUI.delay(2)

WebUI.click(findTestObject('Register/Page_MAP  Registration/button_Sign Up_registrationPage'))

