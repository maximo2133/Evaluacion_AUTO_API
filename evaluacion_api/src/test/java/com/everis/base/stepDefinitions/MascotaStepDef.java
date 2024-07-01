package com.everis.base.stepDefinitions;

import com.everis.base.MascotaStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MascotaStepDef {
    @Steps
    MascotaStep mascota;

    @Given("dado que estoy en la tienda")
    public void dadoQueEstoyEnLaTienda() {
    }

    @When("consulto la mascota de ID {string}")
    public void consultoLaMascotaDeID(String arg0) {
        mascota.consultaMascota(arg0);
    }

    @Then("valido el codigo de respuesta sea {int}")
    public void validoElCodigoDeRespuestaSea(int arg0) {
    }
}
