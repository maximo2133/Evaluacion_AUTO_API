Feature: Tienda

  @ConsultaMascota
  Scenario: Consulta Mascota
    Given dado que estoy en la tienda
    When consulto la mascota de ID "10"
    Then valido el codigo de respuesta sea 200