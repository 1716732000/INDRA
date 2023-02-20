package com.example.indra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostrar_materias_materias(View view)
    {
        Intent mmm = new Intent(this, claseMaterias_Materias.class);
        startActivity(mmm);
    }

    public void mostrar_niveles_niveles(View view)
    {
        Intent mnn = new Intent(this, claseNiveles_Niveles.class);
        startActivity(mnn);
    }
}