package com.example.evaluacion02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Calculo extends AppCompatActivity {

    /*Declaro las variables*/
    private EditText codigo,nombre, valorNeto,valorBruto, marca;
    private EditText codigoR,nombreR, valorNetoR,valorBrutoR, marcaR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        /*recupero  valores del formulario*/
        codigo = (EditText) findViewById(R.id.txtCodigo);
        nombre = (EditText) findViewById(R.id.txtNombre);
        valorNeto = (EditText) findViewById(R.id.txtNeto);
        marca = (EditText) findViewById(R.id.txtMarca);

        codigoR = (EditText) findViewById(R.id.txtCodigoR);
        nombreR = (EditText) findViewById(R.id.txtNombreR);
        valorNetoR = (EditText) findViewById(R.id.txtNetoR);
        valorBrutoR = (EditText) findViewById(R.id.txtValorBrutoR);
        marcaR = (EditText) findViewById(R.id.txtMarcaR);
    }
    /*Metodo para el boton enviar*/
    public void calcularIVA(View view) {

        int Neto = Integer.parseInt(valorNeto.getText().toString());
        int Bruto = (int) ((Neto)*1.19);
        double iva = (double) ((Neto)*0.19);

        codigoR.setText(codigo.getText());
        nombreR.setText(nombre.getText());
        marcaR.setText(marca.getText());
        valorNetoR.setText(String.valueOf("Iva: $" + iva));
        valorBrutoR.setText(String.valueOf("Valor Bruto: $" + Bruto));


    }
}