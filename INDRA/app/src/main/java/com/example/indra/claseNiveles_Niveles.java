package com.example.indra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class claseNiveles_Niveles extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.niveles_niveles);
    }


    public void mostrar_Inicio(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
