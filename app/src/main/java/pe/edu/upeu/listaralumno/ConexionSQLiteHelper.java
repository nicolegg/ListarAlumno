package pe.edu.upeu.listaralumno;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import pe.edu.upeu.listaralumno.Tabla.Tabla;

public class ConexionSQLiteHelper extends SQLiteOpenHelper{

    public ConexionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Tabla.CREAR_TABLA_ALUMNO);
        db.execSQL("insert into alumno values('01','nicole','Ingenieria de sistemas','VI','Huaycan','954366067')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+Tabla.TABLA_ALUMNO);
        onCreate(db);
    }
}
