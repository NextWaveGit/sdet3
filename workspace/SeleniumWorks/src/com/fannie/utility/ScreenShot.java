package com.fannie.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//import com.sun.jna.platform.FileUtils;

//import com.sun.jna.platform.FileUtils;

public class ScreenShot { 
	public static String takeScreenShot(WebDriver driver, String fileName){
		fileName = fileName+".png";
		
		String directory = "C:\\Users\\Huser\\Desktop\\reports\\";
		
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(sourceFile, new File(directory+fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return directory+fileName;
		
		
	}

}
