package com.entity.qa.pages;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.avianca.com/co/es/")
public class SearchFlightPage extends PageObject {

	java.awt.Robot Robot;

	By butonSearch = By.xpath("(//button[.='Buscar vuelos'])[2]");
	By onlyIda = By.xpath("//a[.='Solo ida']");
	By textFrom = By.xpath("//input[contains(@name,'pbOrigen_2')]");
	By textTo = By.xpath("//input[contains(@name,'pbDestino_2')]");
	By selectAutocomplete = By.xpath("//div[@class='bs-list-countries']/ul/li");
	By date = By.xpath("//input[contains(@id,'pbFechaIda_2') and @name='pbFechaIdaISO']");
	By day = By.xpath("(//input[contains(@id,'pbFechaIda_2_')])[2]");
	By howTravel = By.xpath("//label[contains(@for,'pbPasajeros_2')]");
	By classesEconomica = By.xpath("(//label[contains(.,'Clase Económica')])[3]");
	By classesPrivate = By.xpath("(//label[contains(.,'Clase Ejecutiva')])[3]");
	By textAdult = By.xpath("(//div[@class='controls adults' and @aria-label='Adultos Igual o mayores de 12 años'])[2]//div[@class='value']");
	By textChild = By.xpath("(//div[@class='controls noadults' and @aria-label='Niños  2 - 11 años'])[3]//div[@class='value']");
	By textBaby = By.xpath("(//div[@class='controls noadults' and @aria-label='Bebés Menores de 2 años'])[3]//div[@class='value']");
	By buttonContinuo = By.xpath("(//button[@aria-label=\"Continuar, cerrar cuadro de pasajeros\"])[4]");

	private void clicOnlyIda() {
		getDriver().findElement(onlyIda).click();
		this.Esperar(1);
	}

	private void enterTheValueInFrom(String from) {
		this.Esperar(1);
		getDriver().findElement(textFrom).clear();
		this.Esperar(1);
		getDriver().findElement(textFrom).sendKeys(from);
		this.Esperar(1);
	}

	private void selectAutocomplete() {
		getDriver().findElement(selectAutocomplete).click();
	}

	private void enterTheValueInTo(String to) {
		getDriver().findElement(textTo).clear();
		this.Esperar(1);
		getDriver().findElement(textTo).sendKeys(to);
		this.Esperar(1);
	}

	private void setAtribute(WebElement element, String atribute, String newValue) {

		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].removeAttribute('" + atribute + "')", element);
		js.executeScript("arguments[0].setAttribute('" + atribute + "', '" + newValue + "')", element);

	}

	private void setText(WebElement element, String text) {
		this.Esperar(1);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].innerHTML = '"+text+"';", element);
	}

	private void enterTheValueDay(String dayp) {
		this.Esperar(1);
		getDriver().findElement(day).sendKeys(dayp);
		this.Esperar(1);
	}

	private void clicOnHowTravel() {
		this.Esperar(1);
		getDriver().findElement(howTravel).click();
	}

	private void clicClass(String classe) {
		this.Esperar(1);
		if (classe.equals("Clase Económica")) {
			getDriver().findElement(classesEconomica).click();
		} else if (classe.equals("Clase Ejecutiva")) {
			getDriver().findElement(classesPrivate).click();
		}
		this.Esperar(1);
	}
	
	public void clicOnContinuo() {
		this.Esperar(1);
		getDriver().findElement(buttonContinuo).click();
		this.Esperar(1);
	}

	private void clicOnButtonSearch() {
		this.Esperar(1);
		getDriver().findElement(butonSearch).click();
	}

	public void fillTheForm(String from, String to, String dateToGo, String day, String howTravel, String adults,
			String children, String babys) {
		System.out.println(from);
		this.clicOnlyIda();
		this.enterTheValueInFrom(from);
		this.selectAutocomplete();
		this.enterTheValueInTo(to);
		this.selectAutocomplete();
		this.enterTheValueDay(day);
		this.setAtribute(getDriver().findElement(date), "value", dateToGo);
		this.clicOnHowTravel();
		this.clicClass(howTravel);
		this.setText(getDriver().findElement(textAdult), adults);
		this.setText(getDriver().findElement(textChild), children);
		this.setText(getDriver().findElement(textBaby), babys);
		this.clicOnContinuo();
		this.clicOnButtonSearch();
		this.Esperar(3);
	}

	public void Esperar(int pSegundos) {
		try {
			Robot = new java.awt.Robot();
			Robot.delay(pSegundos * 1000);
		} catch (NumberFormatException | AWTException e) {
			e.printStackTrace();
		}
	}
}
