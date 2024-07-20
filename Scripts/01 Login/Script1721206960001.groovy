import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.lang.model.element.VariableElement as VariableElement
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

WebUI.openBrowser(GlobalVariable.link)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/OB Username'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/OB Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Btn Login'))

WebUI.click(findTestObject('btn data entry'))

WebUI.click(findTestObject('Btn New Order'))

WebUI.selectOptionByLabel(findTestObject('slc tipe nasabah'), GlobalVariable.tipeNasabah, false)

WebUI.setText(findTestObject('text npwp'), GlobalVariable.npwp)

WebUI.setText(findTestObject('text nama perusahaan'), JenisPerusahaan)

WebUI.setText(findTestObject('text tgl berdiri perusahaan'), TglBerdiri)

WebUI.click(findTestObject('btn dedup'))

WebUI.click(findTestObject('btn to data entry'))

WebUI.selectOptionByLabel(findTestObject('slc jenis perusahaan'), JenisPerusahaan, false)

WebUI.setText(findTestObject('text nama lengkap'), NamaLengkap)

WebUI.click(findTestObject('src sektor ekonomi'))

WebUI.setText(findTestObject('text search sek eko'), SekEkonomi)

WebUI.click(findTestObject('tbl click sek eko'))

WebUI.click(findTestObject('btn pilih sek eko'))

WebUI.click(findTestObject('src lapangan usaha'))

WebUI.setText(findTestObject('text lapangan usaha'), '2301')

WebUI.click(findTestObject('tbl click lap usaha'))

WebUI.click(findTestObject('btn pilih lap usaha'))

WebUI.selectOptionByLabel(findTestObject('slc status lokasi'), '01 - MILIK SENDIRI', false)

WebUI.selectOptionByLabel(findTestObject('slc lokasi usaha'), '01 - RUMAH', false)

WebUI.setText(findTestObject('text total pegawai'), '10')

WebUI.setText(findTestObject('text total lama kerja'), '2')

WebUI.click(findTestObject('btn tambah alamat'))

WebUI.setText(findTestObject('txt alamat'), 'abc')

WebUI.setText(findTestObject('text rt'), '001')

WebUI.setText(findTestObject('text rw'), '002')

WebUI.click(findTestObject('src kodepos'))

WebUI.setText(findTestObject('text kodepos'), '11310')

WebUI.click(findTestObject('tbl click kodepos'))

WebUI.click(findTestObject('btn pilih kodepos'))

WebUI.click(findTestObject('btn save alamat'))

