package pe.edu.upeu.listaralumno.Tabla;

public class Tabla {

    public static final String TABLA_ALUMNO="alumno";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_ESCUELA="escuela";
    public static final String CAMPO_CICLO="ciclo";
    public static final String CAMPO_DIRECCION="direccion";
    public static final String CAMPO_TELEFONO="telefono";

    public static final String CREAR_TABLA_ALUMNO="CREATE TABLE " +
            ""+TABLA_ALUMNO+" ("+CAMPO_ID+" " +
            "INTEGER, "+CAMPO_NOMBRE+" TEXT,"+CAMPO_ESCUELA+" TEXT,"+ CAMPO_CICLO+" TEXT,"+CAMPO_DIRECCION+" TEXT,"+CAMPO_TELEFONO+" TEXT)";
}
