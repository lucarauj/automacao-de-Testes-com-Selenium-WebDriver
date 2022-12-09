package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
	
	private By emailAdressLocator = By.name("email");
	private By passwordLocator = By.name("password");
	private By submitBtnLocator = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	private By myUserLocator = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b");
	
	public void login() {
		if(super.isDisplayed(emailAdressLocator)) {
			super.type("lukas.martins193@gmail.com", emailAdressLocator);
			super.type("12345", passwordLocator);
			super.click(submitBtnLocator);
		} else {
			System.out.println("Email do usuário não está presente");
		}
	}
	
	public String getMyAccountMessage() {
		return super.getText(myUserLocator);
	}
}
