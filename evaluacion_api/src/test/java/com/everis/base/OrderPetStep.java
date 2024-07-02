package com.everis.base;

import com.everis.base.models.Mascota;
import com.everis.base.models.Order;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;


import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class OrderPetStep {

    private static final String URL_BASE = "https://petstore.swagger.io/v2";

    public static void consultaOrder(int id) {

        Order order =
                given()
                        .baseUri(URL_BASE)
                        .log()
                        .all()
                        .when()
                        .get("store/order/" + id)
                        //.then()
                        //.log().all()
                        .as(Order.class)
                ;

        System.out.println("OUT: " + order.getId());


    }


    public static void validateStatusCode(int i) {
        assertThat(lastResponse().statusCode(), is(i));
    }


    public static void validacionContenido() {
        Assert.assertEquals(Integer.valueOf(3), SerenityRest.lastResponse().body().path("petId"));
    }





    public static void CrearOrden(String petId, String quantity) {

        String jsonBody = "{ \"petId\": " + petId + ", \"quantity\": " + quantity + " }";

        try {
            Response response = RestAssured.given()
                    .baseUri(URL_BASE)
                    .contentType(ContentType.JSON)
                    .body(jsonBody)
                    .post("store/order");

            if (response.getStatusCode() == 200) {
                System.out.println("Orden creada exitosamente.");
            } else {
                System.out.println("Error al crear la orden. Código de estado: " + response.getStatusCode());
                System.out.println("Mensaje de error: " + response.getBody().asString());
            }
        } catch (Exception e) {
            System.out.println("Excepción al intentar crear la orden: " + e.getMessage());
        }
    }

    public static void validoStatusCode(int i) {
        Assert.assertEquals(200, i);
    }





}

