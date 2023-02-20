package com.example.indra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class claseMaterias_Materias extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.materias_materias);
    }

    //Ir al inicio
    public void mostrar_Inicio(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    //Listado materias
    public void mostrar_Materias_Materias_Listado(View Listado)
    {
        Intent mml = new Intent(this, claseMaterias_Materias_Listado.class);
        startActivity(mml);
    }

    public void mostrar_Materias_Materias_Agregar(View Agregar)
    {
        Intent mma = new Intent(this, claseMaterias_Materias_Agregar.class);
        startActivity(mma);
    }

    public void mostrar_Materias_Materias_Eliminar(View Eliminar)
    {
        Intent mme = new Intent(this, claseMaterias_Materias_Eliminar.class);
        startActivity(mme);
    }

    public void mostrar_Modificar(View Modificar)
    {
        Intent mmm = new Intent(this, claseMaterias_Materias_Modificar.class);
        startActivity(mmm);
    }

}
