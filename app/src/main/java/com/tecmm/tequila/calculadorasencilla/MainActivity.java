package com.tecmm.tequila.calculadorasencilla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtnumero1, txtnumero2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buscando componentes
        txtnumero1 = (EditText) findViewById(R.id.edNumero1);
        txtnumero2 = (EditText) findViewById(R.id.edNumero2);
        resultado = (TextView) findViewById(R.id.txtResultado);
    }

    public void doSum(View v){
        int num1 = Integer.parseInt(txtnumero1.getText().toString());
        int num2 = Integer.parseInt(txtnumero2.getText().toString());
        int resultado = num1 + num2;
        this.resultado.setText("" + resultado);

    }

    public void doRes(View v){
        int num1 = Integer.parseInt(txtnumero1.getText().toString());
        int num2 = Integer.parseInt(txtnumero2.getText().toString());
        int resultado = num1 - num2;
        this.resultado.setText("" + resultado);
    }

    public void doMult(View v){
        int num1 = Integer.parseInt(txtnumero1.getText().toString());
        int num2 = Integer.parseInt(txtnumero2.getText().toString());
        int resultado = num1 * num2;
        this.resultado.setText(""+ resultado);
    }

    public void doDiv(View v){
        int num1 = Integer.parseInt(txtnumero1.getText().toString());
        int num2 = Integer.parseInt(txtnumero2.getText().toString());
        int resultado = num1 / num2;
        this.resultado.setText(""+ resultado);
    }
}
