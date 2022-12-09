package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
	
	private By nameAdressLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"); 
	private By emailAdressLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"); 
	private By submitBtnLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
	private By emailLocator = By.id("email");
	
	private By passwordLocator = By.xpath("//*[@id=\"password\"]");
	private By firstNameLocator = By.xpath("//*[@id=\"first_name\"]");
	private By lastNameLocator = By.xpath("//*[@id=\"last_name\"]");
	private By adressLocator = By.xpath("//*[@id=\"address1\"]");
	private By countryLocator = By.xpath("//*[@id=\"country\"]");
                                        
	private By stateLocator = By.xpath("//*[@id=\"state\"]");
	private By cityLocator = By.xpath("//*[@id=\"city\"]");
	private By zipcodeLocator = By.xpath("//*[@id=\"zipcode\"]");
	private By cellLocator = By.xpath("//*[@id=\"mobile_number\"]");
	private By createBtnLocator = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");
	
	private By accountCreatedLocator = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
	
	
	public void insertEmailToRegister() {
		if(super.isDisplayed(emailAdressLocator)) {
			super.type("lucas", nameAdressLocator);
			super.type("lucarauj@gmail.com", emailAdressLocator);
			super.click(submitBtnLocator);
		} else {
			System.out.println("Nome ou Email do usuário não está presente");
		}
	}
	
	public String getEmailNewAccount() {
		return super.getTextByAttribute(this.emailLocator, "value");
	}
	
	public void fillOutForm() {
		this.insertEmailToRegister();
		if (isDisplayed(passwordLocator)) {
			super.type("12345", passwordLocator);
			super.type("Lucas", firstNameLocator);
			super.type("Araujo", lastNameLocator);
			super.type("Endereço", adressLocator);
			super.selectByValue(countryLocator, "India");
			super.type("Sul", stateLocator);
			super.type("Arad", cityLocator);
			super.type("1923900", zipcodeLocator);
			super.type("+972-4-9935222", cellLocator);
			super.click(createBtnLocator);
		} else {
			System.out.println("Mensagem não encontrada");
		}
	}
	
	public String deleteAccount() {
		return super.getText(accountCreatedLocator);
	}

}
