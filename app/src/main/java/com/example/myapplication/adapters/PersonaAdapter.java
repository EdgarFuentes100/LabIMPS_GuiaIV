package com.example.myapplication.adapters;
import static com.example.myapplication.MostrarPersonas.lstPersonas;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.R;
import com.example.myapplication.models.Persona;
import com.example.myapplication.viewHolders.ViewHolderPersona;
import java.util.ArrayList;

public class PersonaAdapter extends RecyclerView.Adapter<ViewHolderPersona> {
    private ArrayList<Persona> datos;
    public PersonaAdapter(ArrayList<Persona> datos) {
        this.datos = datos;
    }
    @NonNull
    @Override
    public ViewHolderPersona onCreateViewHolder(@NonNull ViewGroup parent, int
            viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personas,parent
                        ,false);
        return new ViewHolderPersona(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolderPersona holder, int
            position) {

        holder.getNombrePersona().setText(datos.get(position).getNombrePersona());
    }
    @Override
    public int getItemCount() {
        return lstPersonas.size();
    }
}

