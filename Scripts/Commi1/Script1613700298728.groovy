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

WebUI.navigateToUrl('http://beats-dev.beraucoal.co.id/')

WebUI.setText(findTestObject('Object Repository/Page_HSE Automation/input_Login dengan SID Anda_v-textfield v-w_68bfb6'), 
    'XIIKM')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_HSE Automation/input_Login dengan SID Anda_v-textfield v-w_68bfb6_1'), 
    'Le5rtHwqZRU=')

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Login'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_PJO'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Pengajuan Commissioning'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/label_Commissioning'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Tambah'))

WebUI.setText(findTestObject('Object Repository/Page_HSE Automation/input_Nomor Lambung_gwt-uid-11'), 'Coba3')

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/input_Kategori_gwt-uid-13'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Kategori_v-filterselect-button'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/span_A2B'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/input_Jenis Unit_gwt-uid-15'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Jenis Unit_v-filterselect-button'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/span_ANFO TRUCK'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/input_Merk_gwt-uid-17'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Merk_v-filterselect-button'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/span_MITSUBISHI'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/input_Tipe Detail_gwt-uid-19'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Jenis Unit_v-filterselect-button'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/span_FUSO'))

WebUI.setText(findTestObject('Object Repository/Page_HSE Automation/input_Nomor Mesin_gwt-uid-21'), '123qwedf')

WebUI.setText(findTestObject('Object Repository/Page_HSE Automation/input_Nomor Chasis_gwt-uid-25'), '123qwsdda')

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Upload'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Unggah Foto'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Unggah Foto'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Unggah Foto'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Unggah Foto'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Site Operasional'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Tambah'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/input_Info Site Operasional_gwt-uid-31'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/span_HO - 04 Jul 2021 - PT Berau Coal - Min_79c4e5'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Simpan'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Simpan_1'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Ok'))

WebUI.click(findTestObject('Object Repository/Page_HSE Automation/div_Kirim'))

WebUI.closeBrowser()

