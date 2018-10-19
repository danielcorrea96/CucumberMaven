package com.accenture.cucumbermaven.pages;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.By;

public class ValidarCorreo extends PageObject {
	boolean validacion;
	@FindBy(xpath="//div[@class=\"TO\"]//a[@href=\"https://mail.google.com/mail/u/0/#sent\"]") private WebElementFacade enviados;
	private List<WebElement> list;
	@FindBy(xpath="//div[@id=':nj']") private WebElementFacade esp;
	
	public void enviados () {
		enviados.withTimeoutOf(30, TimeUnit.SECONDS).waitUntilClickable();
		enviados.waitUntilVisible().click();
	}	
	
	
	public void list_enviados(String asunto) {
		System.out.println("Entro aqui");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list = getDriver().findElements(By.xpath("//span[@class=\"bog\"]"));	
		validacion = list.get(2).getText().equals(asunto);
		if (validacion) {
			assertTrue(true);
			System.out.println("true");
		} else { 
			assertTrue(false);
			System.out.println("false");
		}
	}

}
