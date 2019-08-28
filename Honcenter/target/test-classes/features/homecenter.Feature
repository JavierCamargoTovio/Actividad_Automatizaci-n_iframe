Feature: Llenar nombres, apellido y segundo apellido
         Ir al link …más ventajas
        Validar que el último mensaje …más ventajas diga:
         Administre su cuenta individual de forma confidencialLlenar el tipo y número de documento
         Dejar fecha en blanco
         Clic a “Validad identidad”
         Controlar la excepción de la fecha y mostrar el caso como exitoso.

  Scenario: dilengiar el formulario validacion de identidad, validar los mensajes y mostrar el caso como exitoso
    Given  el usuario desea cargar la pagina para diligenciar el formulario y llenar los campos y verificar los mensajes
    When  diligencio los campos, voy al link, capturo los mensajes
    And   validar la identidad.
    Then  Controlar la excepción de la fecha y mostrar el caso como exitoso