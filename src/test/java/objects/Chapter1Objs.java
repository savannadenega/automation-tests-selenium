package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author SavannaDenega
 *
 */
public class Chapter1Objs {

	// 1
	public WebElement radioButtonEsquerda(WebDriver driver) {
		String id = "radiobutton";
		return driver.findElement(By.id(id));
	}

	// 2
	public WebElement comboBoxEsquerda(WebDriver driver) {
		String id = "selecttype";
		return driver.findElement(By.id(id));
	}
	
	

	// 6
	public WebElement buttonLoadRedBox(WebDriver driver) {
		String id = "loadajax";
		return driver.findElement(By.id(id));
	}

	// 7
	public WebElement textRedBox(WebDriver driver) {
		String id = "ajaxdiv";
		return driver.findElement(By.id(id));
	}

}
