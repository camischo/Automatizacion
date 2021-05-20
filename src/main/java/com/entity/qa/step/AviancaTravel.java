package com.entity.qa.step;

import javax.swing.JOptionPane;

import com.entity.qa.pages.SearchFlightPage;
import com.entity.qa.pages.SelectFlightPage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class AviancaTravel extends PageObject {

	SearchFlightPage AviancaSearch;
	SelectFlightPage AviancaSelectSecond;

	@Step
	public void initPage() {
		AviancaSearch.open();
	}

	@Step
	public void fillFormWay(String from, String to, String dateToGo, String day, String howTravel, String adults,String children, String babys) {
		AviancaSearch.fillTheForm(from, to, dateToGo, day, howTravel, adults, children, babys);
	}

	@Step
	public void selectSecondRow() {
		AviancaSelectSecond.selectSecondRow();
		
	}
	
	@Step
	public void canSeeTheFligh() {
		String number= AviancaSelectSecond.isPresentTheNumber();
		JOptionPane.showConfirmDialog(null, number,"Avianca Number",1);
	}

}
