package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.models.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button BtnAgregarTrabajador, BtnMostrarLista, BtnAcercaDe;
    public static ArrayList<Trabajador> lstTrabajador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstTrabajador = new ArrayList<Trabajador>();

        BtnAgregarTrabajador = findViewById(R.id.btnAgregarTrabajador);
        BtnMostrarLista = findViewById(R.id.btnMostrarLista);
        BtnAcercaDe =findViewById(R.id.btnAcercaDe);

        BtnAgregarTrabajador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SeleccionarTrabajador.class));
            }
        });

        BtnMostrarLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MostrarPersonas.class));
            }
        });

        BtnAcercaDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AcercaDe.class));
            }
        });
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.btnAgregarTrabajador){
            startActivity(new Intent(this, SeleccionarTrabajador.class));
        }
    }
}