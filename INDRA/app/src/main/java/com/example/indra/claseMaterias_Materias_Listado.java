package com.example.indra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class claseMaterias_Materias_Listado extends Activity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.materias_materias_listado);
    }

    public void mostrar_Inicio(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void mostrar_Materias_Materias(View view)
    {
        Intent i = new Intent(this, claseMaterias_Materias.class);
        startActivity(i);
    }

}
