package com.choucair.formacion.definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.choucair.formacion.steps.homecenterSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class homecenterDefinition {

    @Steps
homecenterSteps HomecenterSteps;


    @Given("^el usuario desea cargar la pagina para diligenciar el formulario y llenar los campos y verificar los mensajes$")
    public void el_usuario_desea_cargar_la_pagina_para_diligenciar_el_formulario_y_llenar_los_campos_y_verificar_los_mensajes() {
    HomecenterSteps.abrirPaginaHomcenter();
    }

    @When("^diligencio los campos, voy al link, capturo los mensajes$")
    public void diligencio_los_campos_voy_al_link_capturo_los_mensajes() {
       HomecenterSteps.llenarcaposprimeraParte();
       HomecenterSteps.mensajeConfidencial();
    }


    @When("^validar la identidad\\.$")
    public void validar_la_identidad() {
        HomecenterSteps.segundaParte();
    }

    @Then("^Controlar la excepción de la fecha y mostrar el caso como exitoso$")
    public void controlar_la_excepción_de_la_fecha_y_mostrar_el_caso_como_exitoso() {
        HomecenterSteps.mensajeFecha();
    }

}
