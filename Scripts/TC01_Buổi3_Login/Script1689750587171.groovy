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

WebUI.openBrowser("https://auto2023.myshopify.com/account/login")
WebUI.maximizeWindow()
WebUI.refresh()
//def email = "ngoccao1752@gmail.com"
//def password = "Ngoc@221999"
//
//def email = new String[2]
//email[0]="ngoccao1752@gmail.com"
//email[1]="ngoccao@gmail.com"

//def accountlist = [
//	account:[
//		email:"ngoccao1752@gmail.com",
//		password:"Ngoc@221999"
//		],
//    account1:[
//		email:"1111",
//		password:"Ngoc@221999"
//			],
//		]
//	

Account('ngoccao1752@gmail.com','Ngoc@221999')
def Account(def Email, def Password)
{
	WebUI.setText(findTestObject('Object Repository/Buổi3/input_Email'), Email)
	WebUI.setText(findTestObject('Object Repository/Buổi3/input_password'), Password)
}
//for(def i = 0; i<=5; i++)
//{
//	WebUI.setText(findTestObject('Object Repository/Buổi3/input_Email'), accountlist.account.email)
//	WebUI.setText(findTestObject('Object Repository/Buổi3/input_password'), accountlist.account.password)
//}

WebUI.click(findTestObject('Object Repository/Buổi3/button_Login'))
WebUI.takeScreenshot()