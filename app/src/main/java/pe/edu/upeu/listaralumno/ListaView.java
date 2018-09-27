package pe.edu.upeu.listaralumno;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import pe.edu.upeu.listaralumno.Tabla.Tabla;
import pe.edu.upeu.listaralumno.entidades.Alumno;

public class ListaView extends AppCompatActivity {
    ListView listaView;

    ArrayList<String> lisaInformacion;
    ArrayList<Alumno> listarAlumno;

    ConexionSQLiteHelper conn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_view);

        conn = new ConexionSQLiteHelper(getApplicationContext(), "bd_alumnos", null,1);

        listaView = (ListView) findViewById(R.id.lvalumno);

        consultarListaPersona();
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,lisaInformacion);
        listaView.setAdapter(adapter);

       // listaView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        //    @Override
        //    public void onItemClick(AdapterView<?> parent, View view, int pos, long l) {
        //        String informacion ="id: "+listarAlumno.get(pos).getId()+"\n";
         //       informacion+="Nombre: "+listarAlumno.get(pos).getNombre()+"\n";
         //       informacion+="Escuela: "+listarAlumno.get(pos).getNombre()+"\n";
         //       informacion+="Ciclo: "+listarAlumno.get(pos).getNombre()+"\n";
         //       informacion+="Direccion: "+listarAlumno.get(pos).getNombre()+"\n";
        //        informacion+="Telefono: "+listarAlumno.get(pos).getNombre()+"\n";
        //        Toast.makeText(getApplicationContext(),informacion,Toast.LENGTH_LONG).show();

          //      Alumno alu = listarAlumno.get(pos);

                //Intent intent = new Intent(ListaView.this,De)
          //      Bundle bundle=new Bundle();
            //    bundle.putSerializable("alumno",alu);



         //   }
      //  });


    }

    private void consultarListaPersona() {
        SQLiteDatabase db = conn.getReadableDatabase();

        Alumno alumno = null;
        listarAlumno = new ArrayList<Alumno>();
       Cursor cursor =db.rawQuery("SELECT  * FROM "+Tabla.TABLA_ALUMNO,null);

       while (cursor.moveToNext()){
           alumno = new Alumno();
           alumno.setId(cursor.getInt(0));
           alumno.setNombre(cursor.getString(1));
           alumno.setEscuela(cursor.getString(2));
           alumno.setCiclo(cursor.getString(3));
           alumno.setDireccion(cursor.getString(4));
           alumno.setTelefono(cursor.getString(5));
           listarAlumno.add(alumno);
       }
       obtenerLista();
    }

    private void obtenerLista() {
        lisaInformacion = new ArrayList<>();

        for(int i=0; i<listarAlumno.size();i++){
            lisaInformacion.add(listarAlumno.get(i).getId()+" - "
            + listarAlumno.get(i).getNombre()+" - "+ listarAlumno.get(i).getEscuela()+" - "+
            listarAlumno.get(i).getCiclo()+" - "+listarAlumno.get(i).getDireccion()+" - "+
            listarAlumno.get(i).getTelefono());
        }
    }


}
