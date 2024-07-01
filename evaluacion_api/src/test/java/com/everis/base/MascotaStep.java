package com.everis.base;

import com.everis.base.models.Book;
import com.everis.base.models.Mascota;
import io.restassured.RestAssured;

import static net.serenitybdd.rest.SerenityRest.given;

public class MascotaStep {
    private String URL_BASE = "https://petstore.swagger.io/v2";

    public void consultaMascota(String id){
        Mascota mascota =
        given()
                .baseUri(URL_BASE)
                .log()
                .all()
                .when()
                .get("pet/"+id)
                //.then()
                //.log().all()
                .as(Mascota.class)
                ;

        System.out.println("OUT: " + mascota.getName());
        System.out.println("OUT: " + mascota.getCategory().getId());
        System.out.println("OUT: " + mascota.getStatus());

    }
}
