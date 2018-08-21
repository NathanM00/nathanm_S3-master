package com.example.estudiante.semana3_nathanm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv_titulo;
    EditText et_altura, et_masa;
    Button   btn_calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_titulo=findViewById(R.id.tv_titulo);
        et_masa=findViewById(R.id.et_masa);
        et_altura=findViewById(R.id.et_altura);
        btn_calcular=findViewById(R.id.btn_calcular);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String masa = et_masa.getText().toString();
                String altura = et_altura.getText().toString();

                float masaI = Float.valueOf(masa);
                float alturaI =Float.valueOf(altura);
                float alturaI2 = alturaI/100;
                float calculo = masaI/(alturaI2*alturaI2);

                tv_titulo.setText("Tu IMC es de: " + calculo);

                Toast.makeText(MainActivity.this, "Hola "+calculo, Toast.LENGTH_SHORT).show();;

            }
        });

    }
}
