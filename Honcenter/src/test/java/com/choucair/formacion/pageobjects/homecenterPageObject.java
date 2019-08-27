package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBys;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.sql.Driver;

@DefaultUrl("https://www.proteccion.com/wps/portal/proteccion/web/home/general/solicita-clave")
public class homecenterPageObject extends PageObject {


    @FindBy(xpath = "//div[@id='contenido2']//div//ul/li[3]")
    WebElementFacade msmConfirmacion;

    @FindBy(xpath = "//div[@id='popup_message']")
    WebElementFacade msmvalidar;


    public void llenarcamposPrimeraParte() {

        getDriver().switchTo().frame(getDriver().findElement(By.id("contenido")));
        getDriver().switchTo().frame(getDriver().findElement(By.id("contenido2")));

        getDriver().findElement(By.xpath("//input[@id='nombres']")).sendKeys("Manuel");
        getDriver().findElement(By.xpath("//input[@id='primerApellido']")).sendKeys("Martinez");
        getDriver().findElement(By.xpath("//input[@id='segundoApellido']")).sendKeys("Merlano");
       // getDriver().findElement(By.xpath("//select[@id='tipoIdentificacion']")).click();

    }
    public void mensajeFormaConfidencial(){
        getDriver().findElement(By.xpath("//a[@id='tab2']")).click();
        String textoEsperado ="Administre su cuenta individual de forma confidencial";
        String  mensaje = msmConfirmacion.getText().trim();
        assertThat(mensaje.equalsIgnoreCase(textoEsperado));

    }
    public void CapturarSegundaParte(){
        getDriver().findElement(By.xpath("//input[@id='identificacion']")).sendKeys("123456");
        getDriver().findElement(By.xpath("//a[@class='estiloBoton2 gtmValidarIdentidadSolClave']")).click();
    }

    public  void  capturarMensajeFecha(){
        String textoEs ="Debe ingresar una fecha de expedición valida";
        String  msm = msmvalidar.getText().trim();
        assertThat(msm.equalsIgnoreCase(textoEs));
    }
}