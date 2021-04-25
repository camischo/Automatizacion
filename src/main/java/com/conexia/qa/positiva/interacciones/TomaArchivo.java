package com.conexia.qa.positiva.interacciones;

import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class TomaArchivo implements Interaction {
    private String ruta;
    private Target campoATomarArchivo;

    public TomaArchivo(String ruta, Target campoATomarArchivo) {
        this.ruta = ruta;
        this.campoATomarArchivo = campoATomarArchivo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement ElementoWeb = this.campoATomarArchivo.resolveFor(actor);
        ElementoWeb.sendKeys(ruta);
    }
    public static TomaArchivo deLaRuta(String ruta, Target campoATomarArchivo){
        return Tasks.instrumented(TomaArchivo.class,ruta,  campoATomarArchivo);
    }
}
