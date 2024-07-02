# new feature
# Tags: optional

#Debe crear 1 solo Feature que contenga los siguientes 2 Escenarios:

#- Creación de Order: POST /store/order
#- Consulta de Order: GET /store/order/{orderId}
@Order
Feature: Store

    @ConsultaOrder
    Scenario: Consulta de Order:
        Given existe un elemento con ID 6
        When Consulto el order de ID 6
        Then Valido el contenido
        And Valido el codigo respuesta 200

    @CrearOrder
    Scenario Outline: Creacion de Order:
        When creo una nueva orden con los datos proporcionados petId "<petId>" y quantity "<quantity>"
        Then el código de respuesta es 200
        And el número de orden creado es "<orderId>"
        And Valido el orden creado

        Examples:
            | petId | quantity | orderId |
            | 10     | 5        |  101    |







