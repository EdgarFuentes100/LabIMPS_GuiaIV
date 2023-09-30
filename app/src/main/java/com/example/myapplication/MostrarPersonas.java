package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;
import com.example.myapplication.adapters.PersonaAdapter;
import com.example.myapplication.models.Persona;
import java.util.ArrayList;

public class MostrarPersonas extends AppCompatActivity {

    private PersonaAdapter personaAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    public static ArrayList<Persona> lstPersonas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_personas);

        recyclerView = findViewById(R.id.rcvPersonas);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        personaAdapter = new PersonaAdapter(lstPersonas);
        recyclerView.setAdapter(personaAdapter);
    }
}
