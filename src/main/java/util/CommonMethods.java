package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebElement;

public class CommonMethods {

	
	public void  element_Click(WebElement wed) {
		
		wed.click();
	}
	public void enterData(WebElement wed, String text) {
		wed.sendKeys(text);
		
	}
	//changes line by line
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
	
	
	//entering browser and url
	
	public void enterBrowserUrlInPropertyFile(String path,String browser,String url) {
		
		FileWriter fw=null;
		
		try {
			fw=new FileWriter(path);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		try {
			bw.write("browser="+browser);
			bw.newLine();
			bw.write("url="+url);
			
		} catch (IOException e) {
			System.out.println(e);
		}
	try {
		bw.flush();
		bw.close();
	} catch (IOException e) {
		System.out.println(e);
	}
	}
}
