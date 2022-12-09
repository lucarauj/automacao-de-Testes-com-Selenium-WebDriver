package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.DressesPage;

class DressesPageTest {
	private DressesPage dressesPage;
	private final String URL = "https://automationexercise.com/";

	@BeforeEach
	void setUp() throws Exception {
		this.dressesPage = new DressesPage();
		this.dressesPage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.dressesPage.quitWebDriver();
	}

	@Test
	void test() {
		//when
		this.dressesPage.viewCasualDressesPage();
		
		//then
		Assertions.assertEquals("ALL PRODUCTS", this.dressesPage.getTitlePage());
		Assertions.assertFalse(this.URL.equals(dressesPage.getCurrentUrl()));
	}

}
