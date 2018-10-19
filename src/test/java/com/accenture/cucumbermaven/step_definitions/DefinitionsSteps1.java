package com.accenture.cucumbermaven.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.accenture.cucumbermaven.steps.StepGmail;
public class DefinitionsSteps1 {	
	@Steps
	StepGmail Acc;	
	
		 @Given("^que Accenture Testing abrio el navegador en la pagina de gmail$")
		    public void que_accenture_testing_abrio_el_navegador_en_la_pagina_de_gmail() throws Throwable {
		       Acc.is_the_home_page(); 
		}
		 
		 @And("^ingresa las credenciales de (.*) con (.*)$")
		    public void ingresa_las_credenciales_de_accenturetestinggmailcom_con_123456(String username, String password) throws Throwable {
		        Acc.ingresar_credenciales(username, password);
		 }


	    @When("^Accenture Testing quiere enviar un nuevo correo electronico a (.*) con asunto (.*) y cuerpo (.*)$")
	    public void accenture_testing_quiere_enviar_un_nuevo_correo_electronico(String destino, String asunto, String cuerpo) throws Throwable {
	    	Acc.nuevo_correo();
	    	Acc.redacta_correo(destino, asunto, cuerpo);
	    }

	    @Then("^Accenture Testing espera haber enviado su mensaje a su amigo con asunto (.*)$")
	    public void accenture_Testing_espera_haber_enviado_su_mensaje_a_su_amigo_con_asunto_Automatizacion_de_pruebas(String asunto) throws Exception {
	        // Write code here that turns the phrase above into concrete actions
	        Acc.enviados();	        
	        Acc.lista_enviados(asunto);
	    }

}
