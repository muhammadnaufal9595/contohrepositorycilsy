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



class account {
	//ResetPassword
	@Given("I want to go to login page3")
	def userGoingToLoginPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://account.midtrans.com/login')
		WebUI.delay(2)
	}

	@When("I click Trouble Loging in?")
	def clickTroubleLoggingIn() {
		WebUI.click(findTestObject('Account/Page_MAP  Midtrans/button_Trouble Logging In'))
		WebUI.verifyElementVisible(findTestObject('Account/Page_MAP  Midtrans/box_Reset Password'))
		WebUI.delay(2)
	}
	
	@And ("I put my email into email field")
	def putMyEmailToMailField(){
		WebUI.setText(findTestObject('Account/Page_MAP  Midtrans/inputField_emailResetPassword'), 'mail123@mail.com')
		WebUI.delay(2)
	}
	
	@And ("I click Reset Password button")
	def clickResetButton(){
		WebUI.click(findTestObject('Account/Page_MAP  Midtrans/button_Reset Password'))		
		WebUI.delay(2)
	}

	@Then("User is going to login page again")
	def verifyAndGoToLoginPage() {
		WebUI.verifyElementVisible(findTestObject('Account/Page_MAP  Midtrans/box_LOGIN'))
		WebUI.verifyElementVisible(findTestObject('Account/Page_MAP  Midtrans/box_alertResetPassword'))
	}
	
	//ResendConfirmation
	@Given ("I Want to go to Login page")
	def goToLoginPageYa(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://account.midtrans.com/login')
		WebUI.delay(2)
	}
	
	@When ("I click Resend Confirmation Instructions")
	def clickResendConf(){
		WebUI.click(findTestObject('Account/Page_MAP  Midtrans/button_Resend Confirmation Instructions'))
		WebUI.delay(2)
		WebUI.verifyElementVisible(findTestObject('Account/Page_MAP  Midtrans/box_Resend Confirmation Instructions'))
		WebUI.verifyElementVisible(findTestObject('Account/Page_MAP  Midtrans/text_typeEmailResendConf'))
		WebUI.delay(2)
	}
	
	@And ("I put My Email into Email Field")
	def inputEmailnyaYa(){
		WebUI.setText(findTestObject('Account/Page_MAP  Midtrans/inputField_emailResendConfirmationInstructions'), 'mail123@mail.com')
		WebUI.delay(2)
	}
	
	@And ("I click send button")
	def clickSendButton(){
		WebUI.click(findTestObject('Account/Page_MAP  Midtrans/button_Send'))
		WebUI.delay(2)
	}
	
	@Then ("User is Going to Login page")
	def backToLoginPage(){
		WebUI.verifyElementVisible(findTestObject('Account/Page_MAP  Midtrans/box_LOGIN'))
		WebUI.verifyElementVisible(findTestObject('Account/Page_MAP  Midtrans/box_successReqResendConfirmation'), FailureHandling.STOP_ON_FAILURE)
	}
}