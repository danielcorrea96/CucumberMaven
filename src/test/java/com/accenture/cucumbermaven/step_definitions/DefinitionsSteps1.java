package com.accenture.cucumbermaven.step_definitions;
import cucumber.api.PendingException;
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

	    @Given("^que Accenture Testing observa la pagina de inicio de gmail, procede a redactar un nuevo correo electronico$")
	    public void que_accenture_testing_observa_la_pagina_de_inicio_de_gmail_procede_a_redactar_un_nuevo_correo_electronico() throws Throwable {	    	
	        Acc.nuevo_correo();
	    }

	    @When("^Accenture Testing quiere enviar un correo electronico a (.*) para "
	    		+ "comentarle acerca de su nuevo descumbriento en la (.*) "
	    		+ "y argumentarle que (.*)$")
	    public void accenture_testing_quiere_enviar_un_correo_electronico_a_danielcorrea1058_para_comentarle_acerca_de_su_nuevo_descumbriento_en_la_automatizacion_de_pruebas_y_argumentarle_que_este_mensaje_es_generado_automaticamente(String destino, String asunto, String cuerpo) throws Throwable {
	        Acc.redacta_correo(destino, asunto, cuerpo);
	    }

	    @Then("^Accenture Testing espera haber enviado su mensaje a su amigo con asunto (.*)$")
	    public void accenture_Testing_espera_haber_enviado_su_mensaje_a_su_amigo_con_asunto_Automatizacion_de_pruebas(String asunto) throws Exception {
	        // Write code here that turns the phrase above into concrete actions
	        Acc.enviados();	        
	        Acc.lista_enviados(asunto);
	    }

}
