package pages;

import org.openqa.selenium.By;

public class DressesPage extends BasePage {
	
	//Locators
	private By menuProducstLocator = By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a");
	private By titlePageCasualDressesLocator = By.xpath("/html/body/section[2]/div/div/div[2]/div/h2");
	
	public void viewCasualDressesPage() {
		if (super.isDisplayed(menuProducstLocator)) {
			super.actionMoveToElementPerform(menuProducstLocator);
			super.actionMoveToElementClickPerform(menuProducstLocator);
		} else {
			System.out.println("Menu Dresses não encontrado");
		}
	}
	
	public String getTitlePage() {
		return super.getText(titlePageCasualDressesLocator);
	}

}
