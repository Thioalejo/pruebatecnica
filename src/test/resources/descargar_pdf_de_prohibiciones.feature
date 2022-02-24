Feature: Yo como usuario de bancolombia requiero realizar la descarga
  del PDF para conocer las prohibiciones de las tasas y tarifas de los prestamos de auto

  Background:
    Given que ingreso a la pagina de Bancolombia url

  @tag1
  Scenario: Validar que se pueda descargar el PDF para validar las prohibiciones sobre las tasas de prestamo de auto
    When ingrese a productos y servicios
    And seleccione prestamos
    And cuando ingrese a prestamos de auto
    Then deberia poder validar que se genere el pdf de manera correcta

