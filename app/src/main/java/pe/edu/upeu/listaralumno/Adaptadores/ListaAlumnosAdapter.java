package pe.edu.upeu.listaralumno.Adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import pe.edu.upeu.listaralumno.R;
import pe.edu.upeu.listaralumno.entidades.Alumno;

public class ListaAlumnosAdapter extends RecyclerView.Adapter<ListaAlumnosAdapter.UsuarioViewHolder>{
ArrayList<Alumno> listaAlumno;

public ListaAlumnosAdapter(ArrayList<Alumno> listaAlumno){
    this.listaAlumno = listaAlumno;
}
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_alumno,null,false);
        return new UsuarioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UsuarioViewHolder holder, int position) {
    holder.nombre.setText(listaAlumno.get(position))

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class UsuarioViewHolder extends RecyclerView.ViewHolder {
        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
