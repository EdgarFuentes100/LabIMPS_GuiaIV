package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.models.TrabajadorHora;
import com.example.myapplication.models.TrabajadorTiempoCompleto;

import org.w3c.dom.Text;

public class AgregarTrabajador extends AppCompatActivity {

    private EditText edtId, edtNombre, edtApellido, edtEdad, edtValor, edtHoras, edtSalario;
    private TextView txtValor, txtHoras, txtSalario;
    private Button btnAgregar;

    private Bundle bundle;

    private int idEleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_trabajador);

        btnAgregar = findViewById(R.id.btnAgregar);

        edtId = findViewById(R.id.edtID);
        edtNombre = findViewById(R.id.edtNombre);
        edtApellido = findViewById(R.id.edtApellidos);
        edtEdad = findViewById(R.id.edtEdad);
        edtValor = findViewById(R.id.edtValor);
        edtHoras = findViewById(R.id.edtHoras);
        edtSalario = findViewById(R.id.edtSalario);

        txtValor = findViewById(R.id.txtValor);
        txtHoras = findViewById(R.id.txtHoras);
        txtSalario = findViewById(R.id.txtSalario);

        bundle = getIntent().getExtras();
        idEleccion = bundle.getInt("tipoEleccion");

        if(idEleccion == 2){
            // Es libro
            edtValor.setVisibility(View.GONE);
            edtHoras.setVisibility(View.GONE);
            txtHoras.setVisibility(View.GONE);
            txtValor.setVisibility(View.GONE);
        }else {
            txtSalario.setVisibility(View.GONE);
            edtSalario.setVisibility(View.GONE);
        }

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtHoras.getText().toString().isEmpty() || edtValor.getText().toString().isEmpty()) {
                    MainActivity.lstTrabajador.add(
                            new TrabajadorTiempoCompleto(edtId.getText().toString(), edtNombre.getText().toString(),
                                    edtApellido.getText().toString(),Float.valueOf(edtSalario.getText().toString()))
                    );
                } else {
                    MainActivity.lstTrabajador.add(
                            new TrabajadorHora(edtId.getText().toString(), edtNombre.getText().toString(),
                                    edtApellido.getText().toString(),Integer.valueOf(edtHoras.getText().toString()),
                                    Float.valueOf(edtValor.getText().toString()))
                    );
                }

                // Crear el AlertDialog y mostrarlo
                new AlertDialog.Builder(AgregarTrabajador.this)
                        .setMessage("Insertado con éxito")
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        }).show();
            }
        });
    }
}