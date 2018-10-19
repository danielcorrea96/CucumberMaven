package com.accenture.cucumbermaven.pages;

import java.util.concurrent.TimeUnit;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RedactarPage extends PageObject {
	@FindBy(xpath="//div[@class='T-I J-J5-Ji T-I-KE L3']") 
	private WebElementFacade redactar;
	@FindBy(name="to") private WebElementFacade destino;
	@FindBy(name="subjectbox") private WebElementFacade asunto;
	@FindBy(xpath="//*[@class='Am Al editable LW-avf' and @aria-label='Cuerpo del mensaje']") private WebElementFacade cuerpo;
	@FindBy(xpath="//*[@class='J-J5-Ji btA']") private WebElementFacade enviar;
	
	public void nuevo_correo() {
		redactar.withTimeoutOf(7, TimeUnit.SECONDS);
		redactar.waitUntilVisible().click();
	}
	
	public void redactar_correo(String destino, String asunto, String cuerpo) {		
		this.destino.waitUntilClickable().sendKeys(destino);
		this.asunto.waitUntilClickable().sendKeys(asunto);
		this.cuerpo.waitUntilClickable().sendKeys(cuerpo);
		this.enviar.waitUntilClickable().click();
		
	}
	
}
