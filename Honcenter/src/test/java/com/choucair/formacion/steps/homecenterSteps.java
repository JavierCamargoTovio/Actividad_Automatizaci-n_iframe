package com.choucair.formacion.steps;
import com.choucair.formacion.pageobjects.homecenterPageObject;
import net.thucydides.core.annotations.Step;

public class homecenterSteps {

  homecenterPageObject HomecenterPage;
@Step
  public  void abrirPaginaHomcenter(){
      HomecenterPage.open();
  }

  public void llenarcaposprimeraParte(){
    HomecenterPage.llenarcamposPrimeraParte();
  }
    public void mensajeConfidencial(){
        HomecenterPage.mensajeFormaConfidencial();
    }

    public void segundaParte(){
        HomecenterPage.CapturarSegundaParte();
    }
    public void mensajeFecha(){
        HomecenterPage.capturarMensajeFecha();
    }
}
