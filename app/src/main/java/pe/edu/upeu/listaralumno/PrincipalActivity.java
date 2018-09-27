package pe.edu.upeu.listaralumno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"bd_alumnos",null,1);
    }
    public void onClick(View view){
        Intent miIntent=null;
        switch (view.getId()){
            case R.id.btnListaView:
                miIntent=new Intent(PrincipalActivity.this,ListaView.class);
                break;
            case R.id.btnRecycler:
                miIntent=new Intent(PrincipalActivity.this,RecyclerView.class);
                break;
            case R.id.btnHolder:
                miIntent=new Intent(PrincipalActivity.this,ViewHolder.class);
                break;
        }
        if(miIntent!=null){
            startActivity(miIntent);
        }
    }
}
