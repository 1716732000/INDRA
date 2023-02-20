package com.example.indra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class claseMaterias_Materias_Agregar extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.materias_materias_agregar);
    }

    public void mostrar_Inicio(View view)
    {
        Intent ma = new Intent(this, MainActivity.class);
        startActivity(ma);
    }

    public void mostrar_Materias_Materias(View view)
    {
        Intent mm = new Intent(this, claseMaterias_Materias.class);
        startActivity(mm);
    }
}
