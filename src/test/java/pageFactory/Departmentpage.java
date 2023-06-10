package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Departmentpage {

	@FindBy(xpath="//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[3]/label/input") 
	public WebElement automative;
	
	@FindBy(xpath="//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[15]/label/input") 
	public WebElement furniture;
	
	@FindBy(xpath="//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[6]/label/input") 
	public WebElement beauty;
	
	public void selectcheckbox(String checkbox){
		if(checkbox.equalsIgnoreCase("automative"))
			automative.click();
		else if(checkbox.equalsIgnoreCase("furniture"))
			furniture.click();
		else if(checkbox.equalsIgnoreCase("beauty"))
			beauty.click();
	}
	
}
