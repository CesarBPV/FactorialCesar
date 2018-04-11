package com.clases.cesar.presentator;


import com.clases.cesar.factorial_cesar.MainActivity;
import com.clases.cesar.interfaces.FactorialInterface;
import com.clases.cesar.model.FactorialModel;

/**
 * Created by DReyna on 11/4/2018.
 */

public class FactorialPresentator implements FactorialInterface.Presenter{
    private FactorialInterface.View view;
    private FactorialInterface.Model model;

    public FactorialPresentator(MainActivity view){
        this.view = view;
        model = new FactorialModel(this);
    }
    @Override
    public void mostrarResultado(String r) {
        if(view!=null){
            view.mostrarResultado(r);
        }
    }

    @Override
    public void factorial(String n) {
        if(view!=null){
            model.getFactorial(n);
        }
    }
}
