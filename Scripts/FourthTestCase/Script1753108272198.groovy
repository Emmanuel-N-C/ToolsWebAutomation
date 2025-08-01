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


WebUI.click(findTestObject('Object Repository/FourthTest/Page_DEMOQA/h5_Alerts, Frame  Windows'))

WebUI.click(findTestObject('Object Repository/FourthTest/Page_DEMOQA/span_Browser Windows'))

WebUI.click(findTestObject('Object Repository/FourthTest/Page_DEMOQA/span_Alerts'))

WebUI.click(findTestObject('Object Repository/FourthTest/Page_DEMOQA/span_Frames'))

WebUI.click(findTestObject('Object Repository/FourthTest/Page_DEMOQA/span_Nested Frames'))

WebUI.click(findTestObject('Object Repository/FourthTest/Page_DEMOQA/span_Modal Dialogs'))

WebUI.click(findTestObject('Object Repository/FourthTest/Page_DEMOQA/button_Small modal'))

WebUI.click(findTestObject('Object Repository/FourthTest/Page_DEMOQA/button_Close'))

WebUI.click(findTestObject('Object Repository/FourthTest/Page_DEMOQA/button_Large modal'))

WebUI.click(findTestObject('Object Repository/FourthTest/Page_DEMOQA/button_Close_1'))

WebUI.click(findTestObject('Object Repository/FourthTest/Page_DEMOQA/li_Nested Frames'))

WebUI.click(findTestObject('Object Repository/FourthTest/Page_DEMOQA/span_Frames'))

WebUI.click(findTestObject('Object Repository/FourthTest/Page_DEMOQA/span_Alerts'))




