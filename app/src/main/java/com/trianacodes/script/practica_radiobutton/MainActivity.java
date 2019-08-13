package com.trianacodes.script.practica_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Creo objetos para almacenar los valores digitados en la interfaz
    private EditText et_num1, et_num2;
    private TextView tv_resultado;
    private RadioButton rbSum, rbRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Asigno a los objetos creados al principio los componentes de la interfaz correspondientes
        et_num1 = findViewById(R.id.et_numero1);
        et_num2 = findViewById(R.id.et_numero2);
        tv_resultado = findViewById(R.id.tv_resultado);
        rbSum = findViewById(R.id.rb_suma);
        rbRes = findViewById(R.id.rb_resta);
    }

    public void Calculo(View view){

        // Convierto a entero la cadena de caracteres obtenida de cada EditText
        int valor1 = Integer.parseInt(et_num1.getText().toString());
        int valor2 = Integer.parseInt(et_num2.getText().toString());

        // Restablezco el valor de TextView al predeterminado que he definido en el archivo string
        tv_resultado.setText(R.string.txtResultado);

        // Pregunto qué RadioButton está marcado
        if (rbSum.isChecked()){

            /* Establezco el valor del TextView a su valor unido al valor del cálculo obtenido al
            ejecutar la función Suma. */
            tv_resultado.setText(tv_resultado.getText().toString() + " " + Suma(valor1, valor2));

        } else {

            /* Establezco el valor del TextView a su valor unido al valor del cálculo obtenido al
            ejecutar la función Resta. */
            tv_resultado.setText(tv_resultado.getText().toString() + " " + Resta(valor1, valor2));

        }

    }

    // Las funciones Suma y Resta deben recibir dos valores (v1 y v2) para poder hacer el cálculo.
    public int Suma (int v1, int v2){

        // Devuelve el resultado de la operación
        return v1 + v2;

    }

    public int Resta (int v1, int v2){

        // Devuelve el resultado de la operación
        return v1 - v2;

    }

}
