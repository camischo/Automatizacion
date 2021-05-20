package com.entity.qa.pages;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class SelectFlightPage extends PageObject {

	java.awt.Robot Robot;
	
	By DetalleTwoRow = By.xpath("(//span[.='Detalles del Vuelo'])[2]");
	By NumberOfOperator = By.xpath("//span[@class='flight-segment-operated-by-flight-number']");
	
	private void clicOnTowRow() {
		this.Esperar(2);
		getDriver().findElement(DetalleTwoRow).click();
		this.Esperar(2);
	}
	
	private String assertNumberOfOperator() {
		Assert.assertTrue(getDriver().findElement(NumberOfOperator).isDisplayed());
		return getDriver().findElement(NumberOfOperator).getText();
	}
	
	
	public void selectSecondRow() {
		this.clicOnTowRow();
	}
	
	public String isPresentTheNumber() {
		return this.assertNumberOfOperator();
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
