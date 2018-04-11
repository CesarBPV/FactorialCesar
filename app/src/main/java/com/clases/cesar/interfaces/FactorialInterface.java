package com.clases.cesar.interfaces;

/**
 * Created by DReyna on 11/4/2018.
 */

public interface FactorialInterface {
    interface View{
        void mostrarResultado(String r);
    }
    interface Presenter{
        void mostrarResultado(String r);
        void factorial(String n);
    }
    interface Model{
        void getFactorial(String n);
    }
}
