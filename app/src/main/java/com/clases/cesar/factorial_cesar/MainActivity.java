package com.clases.cesar.factorial_cesar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.clases.cesar.interfaces.FactorialInterface;
import com.clases.cesar.presentator.FactorialPresentator;

public class MainActivity extends AppCompatActivity implements FactorialInterface.View{

    private TextView tvr;
    private EditText edt1;
    private Button btnc;
    private FactorialInterface.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvr = findViewById(R.id.tvr);
        edt1 =findViewById(R.id.txtn);
        presenter = new FactorialPresentator(this);
    }
    public void calcular(View view){
        presenter.factorial(edt1.getText().toString());
    }

    @Override
    public void mostrarResultado(String r) {
        tvr.setText(r);
    }
}
