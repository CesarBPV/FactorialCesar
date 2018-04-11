package com.clases.cesar.model;


import com.clases.cesar.interfaces.FactorialInterface;

/**
 * Created by DReyna on 11/4/2018.
 */

public class FactorialModel implements FactorialInterface.Model{
    private FactorialInterface.Presenter presenter;
    private double resultado;
  public FactorialModel(FactorialInterface.Presenter presenter){
      this.presenter = presenter;
  }
    @Override
    public void getFactorial(String n) {
        int resultado = 1;
        for (int i = 1; i <= Integer.parseInt(n); i++) {
            resultado *= i;
        }
        presenter.mostrarResultado(String.valueOf(resultado));
    }
}
