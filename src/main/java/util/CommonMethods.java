package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebElement;

public class CommonMethods {

	
	public void  clickOnthePage(WebElement wed) {
		
		wed.click();
	}
	public void sendingDataOnThePage(WebElement wed, String text) {
		wed.sendKeys(text);
		
	}
	
	public void writeInPropertyFile(String path,String prpertyKey,String propertyValue) {
		FileWriter fw=null;
		try {
			fw=new FileWriter(path,true);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		try {
			bw.newLine();
			bw.write(prpertyKey+"="+propertyValue);
			
		} catch (IOException e) {
			System.out.println(e);
		}
	try {
		bw.flush();
	} catch (IOException e) {
		System.out.println(e);
	}
		
	}
}
