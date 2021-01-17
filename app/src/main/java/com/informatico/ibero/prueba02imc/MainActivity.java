package com.informatico.ibero.prueba02imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickCalcularIMC(View view){
        final EditText pesoText = (EditText) findViewById(R.id.entrada_peso);
        String pesoStr = pesoText.getText().toString();
        double peso = Double.parseDouble(pesoStr);
        final EditText alturaText = (EditText) findViewById(R.id.entrada_altura);
        String alturaStr = alturaText.getText().toString();
        double altura = Double.parseDouble(alturaStr);
        double IMC = (peso)/(altura*altura);
        final EditText IMCResult = (EditText) findViewById(R.id.resultado_imc);
        IMCResult.setText(Double.toString(IMC));
        String IMC_Cat;
        if (IMC < 15) IMC_Cat = "Críticamente Bajo de Peso";
        else if (IMC < 16) IMC_Cat = "Severamente Bajo de Peso";
        else if (IMC < 18.5) IMC_Cat = "Bajo de Peso";
        else if (IMC < 25) IMC_Cat = "Normal (peso saludable)";
        else if (IMC < 30) IMC_Cat = "Sobrepeso";
        else if (IMC < 35) IMC_Cat = "Obesidad Clase 1 - Moderadamente Obeso";
        else if (IMC < 40) IMC_Cat = "Obesidad Clase 2 - Severamente Obeso";
        else IMC_Cat = "Obesidad Clase 3 - Críticamente Obeso";

        final TextView cat_imc = (TextView) findViewById(R.id.categoria_imc);
        cat_imc.setText(IMC_Cat);
    }
}