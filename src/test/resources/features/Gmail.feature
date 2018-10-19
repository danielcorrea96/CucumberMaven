@Feature1
Feature: FUNCIONALIDAD - Envio de correo electrónico en la página de gmail.
COMO un usuario AccentureTesting@gmail.com
QUIERO enviar un correo electrónico.
PARA exponer una introducción a la automatización de pruebas con Cucumber, y en lenguaje Gherkin.

Background: Abrir el navegador en página de Gmail,y acceder con las credenciales de AccentureTesting2018@gmail.com
Given que Accenture Testing abrio el navegador en la pagina de gmail
And ingresa las credenciales de AccentureTesting2018@gmail.com con 123456Accenture

@tag1
Scenario: PRUEBA A REALIZAR - Enviar Correo Electrónico desde la página de Gmail.
When Accenture Testing quiere enviar un nuevo correo electronico a danielcorrea1058@gmail.com con asunto Automatizacion de pruebas y cuerpo Este mensaje es generado automaticamente
Then Accenture Testing espera haber enviado su mensaje a su amigo con asunto Automatizacion de pruebas 