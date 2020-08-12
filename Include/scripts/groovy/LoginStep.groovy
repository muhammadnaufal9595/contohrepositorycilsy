import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginStep {
	//SuccessLogin
	@Given ("I want to go to login page")
	def navigateToLoginPage(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://account.midtrans.com/login')
		WebUI.delay(2)
	}

	@When ("I put email (.*) into email field")
	def inputEmail(String email){
		WebUI.setText(findTestObject('Login/Page_MAP  Midtrans/inputField_email'), email)
		WebUI.delay(2)
	}

	@And ("I put password (.*) into password field")
	def inputPassword(String password){
		WebUI.setText(findTestObject('Login/Page_MAP  Midtrans/inputField_password'), password)
		WebUI.delay(2)
	}

	@And ("I click on login button")
	def clickLoginButton(){
		WebUI.click(findTestObject('Login/Page_MAP  Midtrans/button_Login'))
		WebUI.delay(2)
	}

	@Then ("User is login into website")
	def successLogin(){
		WebUI.verifyElementPresent(findTestObject('Login/Page_MAP  Midtrans/button_accountInformation'), 2)
	}
	
	//FailLogin
	@Given ("I want to go to login page2")
	def navigateToLoginPage2(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://account.midtrans.com/login')
		WebUI.delay(2)
	}

	@When ("I put  wrong email into email field")
	def inputEmail(){
		WebUI.setText(findTestObject('Login/Page_MAP  Midtrans/inputField_email'), 'emailsalah@gmail.com')
		WebUI.delay(2)
	}

	@And ("I put wrong password into password field")
	def inputPassword(){
		WebUI.setText(findTestObject('Login/Page_MAP  Midtrans/inputField_password'), 'passwordSalah123')
		WebUI.delay(2)
	}

	@And ("I click on login button2")
	def clickLoginButton2(){
		WebUI.click(findTestObject('Login/Page_MAP  Midtrans/button_Login'))
		WebUI.delay(2)
	}

	@Then ("User is not login into website")
	def failedLogin(){
		WebUI.verifyElementPresent(findTestObject('Login/Page_MAP  Midtrans/text_Invalid email or password'), 2)
	}
}