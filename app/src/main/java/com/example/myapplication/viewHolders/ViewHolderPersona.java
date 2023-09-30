package com.example.myapplication.viewHolders;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.R;
public class ViewHolderPersona extends RecyclerView.ViewHolder {
    private TextView nombrePersona;
    private TextView edadPersona;
    public ViewHolderPersona(@NonNull View itemView) {
        super(itemView);
        this.nombrePersona = itemView.findViewById(R.id.txvNombreComp);
        this.edadPersona = itemView.findViewById(R.id.txvEdadPersona);
    }
    public TextView getNombrePersona(){
        return this.nombrePersona;
    }
}