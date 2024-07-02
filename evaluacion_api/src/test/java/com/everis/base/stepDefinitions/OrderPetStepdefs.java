package com.everis.base.stepDefinitions;

import com.everis.base.MascotaStep;
import com.everis.base.OrderPetStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class OrderPetStepdefs {

    @Steps
    OrderPetStep order;
    @Given("existe un elemento con ID {int}")
    public void existeUnElementoConID(int arg0) {

    }
    @When("Consulto el order de ID {int}")
    public void consultoElOrderDeId(int id) {
        OrderPetStep.consultaOrder(id);
    }

    @Then("Valido el contenido")
    public void validoElContenido() {
        OrderPetStep.validacionContenido();
    }

    @And("Valido el codigo respuesta {int}")
    public void validoElCodigoRespuesta(int i) {
        OrderPetStep.validateStatusCode(i);
    }


    @When("creo una nueva orden con los datos proporcionados petId {string} y quantity {string}")
    public void creoUnaNuevaOrdenConLosDatosProporcionadosPetIdYQuantity(String petId, String quantity) {
    OrderPetStep.CrearOrden(petId,quantity);
    }

    @Then("el código de respuesta es {int}")
    public void elCódigoDeRespuestaEs(int i) {
        OrderPetStep.validoStatusCode(i);
    }


    @And("el número de orden creado es {string}")
    public void elNúmeroDeOrdenCreadoEs(String arg0) {

    }


    @And("Valido el orden creado")
    public void validoElOrdenCreado() {

    }
}
