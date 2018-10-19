package com.accenture.cucumbermaven.steps;

import com.accenture.cucumbermaven.pages.GmailPage;
import com.accenture.cucumbermaven.pages.RedactarPage;
import com.accenture.cucumbermaven.pages.ValidarCorreo;

import net.thucydides.core.annotations.Step;

public class StepGmail {
	GmailPage gmail;
	RedactarPage redactar;
	ValidarCorreo validar;
	@Step
    public void is_the_home_page() {
        gmail.open();
    }
	
	@Step
	public void ingresar_credenciales(String username, String password) {
		gmail.enter_keywords(username, password);
	}
	
	@Step
	public void nuevo_correo () {
		redactar.nuevo_correo();
	}
	
	@Step
	public void redacta_correo(String destino, String asunto, String cuerpo) {
		redactar.redactar_correo(destino, asunto, cuerpo);
	}
	
	@Step
	public void enviados() {
		validar.enviados();
	}
	@Step
	public void lista_enviados(String asunto) {
		validar.list_enviados(asunto);
	}
}
