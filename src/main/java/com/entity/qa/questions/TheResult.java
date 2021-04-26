package com.entity.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheResult implements Question<Integer>{
	
	public TheResult() {
	}

	@Override
	public Integer answeredBy(Actor actor) {
		return 1;
	}

	public static Question<Integer> is() {
		// TODO Auto-generated method stub
		return new TheResult();
	}
	
	

}
