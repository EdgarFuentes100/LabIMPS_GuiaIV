package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SeleccionarTrabajador extends AppCompatActivity {
    private RadioButton rbTrabajadorHora, rbtTrabajadorCompleto;
    private RadioGroup rgbEleccion;

    private Button btnContinuar;

    private Bundle bundle;

    private int idEleccion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_trabajador);
        btnContinuar = findViewById(R.id.btnContinuar);
        rgbEleccion = findViewById(R.id.rbtTrabajador);
        rbTrabajadorHora = rgbEleccion.findViewById(R.id.rbTrabajadoHora);
        rbtTrabajadorCompleto = rgbEleccion.findViewById(R.id.rbTrabajadorCompleto);

        rbTrabajadorHora.setOnClickListener(v -> idEleccion = 1); // En caso de que el usuario elija libro
        rbtTrabajadorCompleto.setOnClickListener(v -> idEleccion = 2); // En caso de que el usuario elija revista

        btnContinuar.setOnClickListener(v -> {
            bundle = new Bundle();
            bundle.putInt("tipoEleccion", idEleccion);
            Intent intent = new Intent(this, AgregarTrabajador.class);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}