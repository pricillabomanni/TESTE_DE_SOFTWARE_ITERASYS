package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	private WebDriver driver;

	private By totalTaxaInclusaTotal = By.cssSelector("div.cart-total span.value");

	private By nomeCliente = By.cssSelector("div.address");
	
	private By botaoContinueAddress = By.name("confirm-addresses");

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public String obter_totalTaxaInclusaTotal() {
		return driver.findElement(totalTaxaInclusaTotal).getText();
	}

	public String obter_nomeCliente() {
		return driver.findElement(nomeCliente).getText();
	}
	
	public void clicarBotaoContinueAddress() {
		driver.findElement(botaoContinueAddress).click();
		
	}

}
